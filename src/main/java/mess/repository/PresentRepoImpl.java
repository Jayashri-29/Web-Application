package mess.repository;

import java.util.List;

import mess.model.PresentDay;
import java.util.*;
public class PresentRepoImpl extends DBConfigue implements PresentRepo
{
	List<PresentDay> list;
	public boolean takePresenty(PresentDay pd) 
	{
		try
		{
			ps=con.prepareStatement("insert into present value(?,?,?)");
			ps.setInt(1, pd.getEid());
			ps.setInt(2, pd.getPresent());
			String s[]=pd.getDate().split("-");
	    	java.sql.Date d=new java.sql.Date((Integer.parseInt(s[0])-1900),(Integer.parseInt(s[1])-01),Integer.parseInt(s[2]));
			ps.setDate(3, d);
			int value=ps.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
		    System.out.println("error is "+ex);
			return false;
		}
	}

	@Override
	public List<PresentDay> getPresentDates(int id) 
	{
		try
		{
			list=new ArrayList<PresentDay>();	
			ps=con.prepareStatement("select date from present where eid=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next())
			{
				PresentDay p=new PresentDay();
				p.setDate(rs.getString(1));
				list.add(p);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
			System.out.println("error is "+ex);
			return null;
		}
	}

	@Override
	public List<PresentDay> getDatesMonthwise(int id, String month) 
	{
		try
		{
			list=new ArrayList<PresentDay>();
			ps=con.prepareStatement("select date from present where eid=? and date like ?");
			ps.setInt(1, id);
			ps.setString(2, "%"+month+"%");
			rs=ps.executeQuery();
			while(rs.next())
			{
				PresentDay p=new PresentDay();
				p.setDate(rs.getString(1));
				list.add(p);				
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
			System.out.println("error is "+ex);
			return null;
		}
	}

}
