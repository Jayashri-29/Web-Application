package mess.repository;

import java.util.*;

import mess.model.CustomerTypeModel;

public class CustomerTypeRepoImpl extends DBConfigue implements CustomerTypeRepo
{
    List<CustomerTypeModel> list;
	@Override
	public boolean isAddCustType(CustomerTypeModel ctm) 
	{
		try
		{
			ps=con.prepareStatement("insert into customertype values('0',?)");
			ps.setString(1, ctm.getType());
			int value=ps.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is ");
			return false;
		}
	}

	@Override
	public List<CustomerTypeModel> getAllTypes() 
	{
		
		try
		{
			list=new ArrayList<CustomerTypeModel>();
			ps=con.prepareStatement("select *from customertype");
			rs=ps.executeQuery();
			while(rs.next())
			{
				CustomerTypeModel ctm=new CustomerTypeModel();
				ctm.setUid(rs.getInt(1));
				ctm.setType(rs.getString(2));
				list.add(ctm);
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
	public boolean delTypeBtid(int id) 
	{
		try
		{
			ps=con.prepareStatement("delete from customertype where uid=?");
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
	public boolean isUpdateCustType(CustomerTypeModel ctm) {
		try
		{
			ps=con.prepareStatement("update customertype set type=? where uid=?");
			ps.setString(1, ctm.getType());
			ps.setInt(2, ctm.getUid());
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
	public String getTypeById(int id)
	{
		String type=null;
		try
		{
			ps=con.prepareStatement("select type from customertype where uid=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next())
			{
				type=rs.getString(1);
			}
		   return type;
		}
		catch(Exception ex)
		{
		 System.out.println("Error is "+ex);
		 return null;
		}
	}
		
}
