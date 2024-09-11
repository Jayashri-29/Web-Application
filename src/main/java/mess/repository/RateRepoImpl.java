package mess.repository;

import java.util.ArrayList;
import java.util.List;

import mess.model.RateModel;

public class RateRepoImpl extends DBConfigue implements RateRepo
{	
	List<RateModel> list;
	int id;
	public int getIdAutomatic()
	{
		try
		{
			ps=con.prepareStatement("select max(rid) from rate");
			rs=ps.executeQuery();
			if(rs.next())
			{
				id=rs.getInt(1);
			}
			return ++id;
		}
		catch(Exception ex)
		{
          System.out.println("Exception is "+ex);
		  return -1;
		}
	}
	public boolean addRate(RateModel m)
	{
		try
		{
			id=this.getIdAutomatic();
			ps=con.prepareStatement("insert into rate values(?,?,?)");
			
			ps.setInt(1, id);
			ps.setString(2,m.getName());
			ps.setInt(3, m.getPrice());
			
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
	public List<RateModel> getAll()
	{
		try
		{
			 list=new ArrayList<RateModel>();
		 ps=con.prepareStatement("select *from rate");
		 rs=ps.executeQuery();
		 while(rs.next())
		 {
			 int id=rs.getInt(1);
			 String name=rs.getString(2);
			 int price=rs.getInt(3);
			 RateModel m=new RateModel(id, name, price);
			 list.add(m);
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
	public boolean delRate(int id) {
		try
		{
			ps=con.prepareStatement("delete from rate where rid=?");
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
	public boolean updateById(RateModel m) {
		try
		{
			ps=con.prepareStatement("update rate set rname=?,price=? where rid=?");
			ps.setString(1,m.getName());
			ps.setInt(2, m.getPrice());
			ps.setInt(3, m.getId());
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
	public int getRateById(int id)
	{
       try
       {
    	   ps=con.prepareStatement("select price from rate where rid=?");
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

}
