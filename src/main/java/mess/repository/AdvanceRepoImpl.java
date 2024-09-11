package mess.repository;

import mess.model.AdvanceModel;

public class AdvanceRepoImpl extends DBConfigue implements AdvanceRepo
{

	@Override
	public boolean admitWithAdvance(AdvanceModel m) 
	{
		try
		{
			ps=con.prepareStatement("insert into admit values(?,?)");
			ps.setInt(1, m.getId());
			ps.setInt(2, m.getAdv());
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
	public int getAdvnaceById(int id) 
	{
		try
		{
			ps=con.prepareStatement("select adv from admit where eid=?");
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
