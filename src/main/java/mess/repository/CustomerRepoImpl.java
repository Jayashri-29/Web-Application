package mess.repository;

import java.util.ArrayList;
import java.util.List;

import mess.model.CustomerModel;

public class CustomerRepoImpl extends DBConfigue implements CustomerRepo
{
	List<CustomerModel> list;
	List<Object[]> list1;
   int id;
   public int getIDAutomatic()
   {
	   try
		{
			ps=con.prepareStatement("select max(eid) from custratejoin");
			rs=ps.executeQuery();
			if(rs.next())
			{
				id=rs.getInt(1);
			}
		  return ++id;
		}
		catch(Exception ex)
		{
			System.out.println("Error in getid "+ex);
			return -1;
		}
   }
	
	public boolean isaddcust(CustomerModel m)
	{
		try
		{
			id=this.getIDAutomatic();
			ps=con.prepareStatement("insert into custratejoin values(?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, m.getName());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getContact());
			ps.setInt(5, m.getCid());
			ps.setInt(6, m.getRid());
			int value=ps.executeUpdate();
		    return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}

	@Override
	public List<Object[]> getall() 
	{
        try
        {
        	list1=new ArrayList<Object[]>();
        	ps=con.prepareStatement("select c.eid, c.name, c.email, c.contact, c.uid, c.rid, a.adv from custratejoin c left join admit a on c.eid=a.eid");
        	rs=ps.executeQuery();
        	while(rs.next())
        	{
        	   int id=rs.getInt(1);
        	   String name=rs.getString(2);
        	   String email=rs.getString(3);
        	   String contact=rs.getString(4);
        	   int uid=rs.getInt(5);
        	   int rid=rs.getInt(6);
        	   int adv=rs.getInt(7);
        	   Object obj[]=new Object[] {id,name,email,contact,uid,rid,adv};
        	   list1.add(obj);
        	}
	     	return list1.size()>0?list1:null;
        }
        catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return null;
		}
	}

	@Override
	public boolean isDelBtId(int id) 
	{
		try
		{
			ps=con.prepareStatement("delete from custratejoin where eid=?");
			ps.setInt(1, id);
			int value=ps.executeUpdate();
		    return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}

	@Override
	public boolean isUpdateCustomer(CustomerModel m) 
	{
		try
		{
			ps=con.prepareStatement("update custratejoin set name=?,email=?,contact=?,uid=?,rid=? where eid=?");
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getContact());
			ps.setInt(4,m.getCid());
			ps.setInt(5,m.getRid());
			ps.setInt(6,m.getEid());
			int value=ps.executeUpdate();
		    return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}

	@Override
	public int getIdBtEmail(String Email) 
	{
		int id=0;
		try
		{
			ps=con.prepareStatement("select eid from custratejoin where email=?");
			ps.setString(1, Email);
			rs=ps.executeQuery();
			if(rs.next())
			{
			 id=rs.getInt(1);	
			}
			return id;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return 0;
		}
	}

	@Override
	public int getTotalMember(String name)
	{
		int count=0;
		try
		{
			ps=con.prepareStatement("select count(cj.uid) from custratejoin cj inner join customertype c on cj.uid=c.uid where c.type=?");
			ps.setString(1, name);
			rs=ps.executeQuery();
			if(rs.next())
			{
			 count=rs.getInt(1);	
			}
			return count;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return 0;
		}
	}
	public int verifyCustomer(String email,String contact) 
	{
		try
		{
			ps=con.prepareStatement("select eid from custratejoin where email=? and contact=?");
			ps.setString(1,email);
			ps.setString(2, contact);
			rs=ps.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			else
			{
		     return 0;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return 0;
		}
	}

	@Override
	public List<CustomerModel> getProfileById(int id) 
	{
		try
		{
			list=new ArrayList<CustomerModel>();
			ps=con.prepareStatement("select *from custratejoin where eid=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next())
			{
				CustomerModel cm=new CustomerModel();
				cm.setEid(rs.getInt("eid"));
				cm.setName(rs.getString("name"));
				cm.setContact(rs.getString("contact"));
				cm.setEmail(rs.getString("email"));
				cm.setCid(rs.getInt("uid"));
				cm.setRid(rs.getInt("rid"));
				list.add(cm);
		        return list.size()>0?list:null;
			}
			else
			{
			  return null;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		    return null;
		}
	}

	@Override
	public int getTotalPresentDays(CustomerModel m)
	{
		try
		{
			ps=con.prepareStatement("select count(p.present) from present p inner join custratejoin c on p.eid=c.eid where c.email=?");
			ps.setString(1, m.getEmail());
			rs=ps.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			else
			{
			    return 0;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		    return 0;
		}
	}

	@Override
	public boolean verifyCustomer(CustomerModel m) 
	{
		try
		{
			ps=con.prepareStatement("select *from custratejoin where email=?");
			ps.setString(1, m.getEmail());
			rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
			else
			{
			    return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		    return false;
		}
	}

	@Override
	public int getPresentDayById(int id)
	{
		try
		{
			ps=con.prepareStatement("select count(p.present) from present p inner join custratejoin c on p.eid=c.eid where c.eid=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			else
			{
			    return 0;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		    return 0;
		}
	}

	@Override
	public int getPresentDayByMonth(CustomerModel m, String month) 
	{
		try
		{
			ps=con.prepareStatement("select count(p.present) from custratejoin c inner join present p on c.eid=p.eid where c.eid=? and p.date like ?");
            ps.setInt(1, m.getEid());
            ps.setString(2, "%"+month+"%");
            rs=ps.executeQuery();
            if(rs.next())
            {
            	return rs.getInt(1);
            }
            else
            {
         		return 0;
            }
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		    return 0;
		}
	}

	@Override
	public List<CustomerModel> getallByName(String name) 
	{
		try
        {
        	list=new ArrayList<CustomerModel>();
        	ps=con.prepareStatement("select *from custratejoin where name like '%"+name+"%'");
        	rs=ps.executeQuery();
        	while(rs.next())
        	{
        	   int id=rs.getInt(1);
        	   String name1=rs.getString(2);
        	   String email=rs.getString(3);
        	   String contact=rs.getString(4);
        	   int uid=rs.getInt(5);
        	   int rid=rs.getInt(6);
        	   CustomerModel cm=new CustomerModel(id, uid, rid, name1, contact, email);
        	   list.add(cm);
        	}
	     	return list.size()>0?list:null;
        }
        catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return null;
		}
	}

	@Override
	public List<CustomerModel> getallWithoutAdvance() 
	{
		try
        {
        	list=new ArrayList<CustomerModel>();
        	ps=con.prepareStatement("select *from custratejoin c where not exists(select eid from admit a where a.eid=c.eid)");
        	rs=ps.executeQuery();
        	while(rs.next())
        	{
        	   int id=rs.getInt(1);
        	   String name=rs.getString(2);
        	   String email=rs.getString(3);
        	   String contact=rs.getString(4);
        	   int uid=rs.getInt(5);
        	   int rid=rs.getInt(6);
        	   CustomerModel cm=new CustomerModel(id, uid, rid, name, contact, email);
        	   list.add(cm);
        	}
	     	return list.size()>0?list:null;
        }
        catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return null;
		}
	}

	@Override
	public boolean updCustomer(CustomerModel m)
	{
		try
		{
		  ps=con.prepareStatement("update custratejoin set name=?,email=?,contact=? where eid=?");
		  ps.setString(1, m.getName());
		  ps.setString(2, m.getEmail());
		  ps.setString(3, m.getContact());
		  ps.setInt(4, m.getEid());
		  int value=ps.executeUpdate();
		  return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
		
	}

	@Override
	public List<CustomerModel> getAllNames(String name)
	{
		try
		{
			list=new ArrayList<CustomerModel>();
			ps=con.prepareStatement("select cj.name from custratejoin cj inner join customertype c on cj.uid=c.uid where c.type=?");
			ps.setString(1, name);;
			rs=ps.executeQuery();
			while(rs.next())
			{
				CustomerModel cm=new CustomerModel();
				cm.setName(rs.getString(1));
				list.add(cm);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		    return null;
		}	
	}

}
