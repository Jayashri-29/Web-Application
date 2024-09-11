package mess.repository;

import mess.model.MainuCardModel;
import java.util.*;
public class MainuCardRepoImpl extends DBConfigue implements MainuCardRepo
{
    List<MainuCardModel> list;
	@Override
	public boolean addItemToCard(MainuCardModel m) 
	{
		try
		{
			ps=con.prepareStatement("insert into card values(?,?,?,?,?,?)");
			ps.setString(1, m.getDay());
			ps.setString(2, m.getBhaji());
			ps.setString(3, m.getDal());
			ps.setString(4, m.getPoli());
			ps.setString(5, m.getRice());
			ps.setString(6, m.getSweet());
			int value=ps.executeUpdate();
		    return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Eroor is "+ex);
			return false;
		}
	}

	@Override
	public List<MainuCardModel> getAllList()
	{
		try
		{
			list=new ArrayList<MainuCardModel>();
			ps=con.prepareStatement("select *from card");
			rs=ps.executeQuery();
			while(rs.next())
			{
				String day=rs.getString("day");
				String bhaji=rs.getString("bhaji");
				String dal=rs.getString("dal");
				String poli=rs.getString("poli");
				String bhat=rs.getString("rice");
				String sweet=rs.getString("sweet");
				MainuCardModel mcm=new MainuCardModel(day, bhaji, dal, poli, bhat, sweet);
				list.add(mcm);				
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
			System.out.println("Eroor is "+ex);
		    return null;
		}      
	}

	@Override
	public boolean updatebyDay(MainuCardModel m) 
	{
		try
		{
			ps=con.prepareStatement("update card set bhaji=?,dal=?,poli=?,rice=?,sweet=? where day=?");			
			ps.setString(1, m.getBhaji());
			ps.setString(2, m.getDal());
			ps.setString(3, m.getPoli());
			ps.setString(4, m.getRice());
			ps.setString(5, m.getSweet());
			ps.setString(6, m.getDay());
			int value=ps.executeUpdate();
		    return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Eroor is "+ex);
			return false;
		}
	}

	@Override
	public boolean delByDay(String Day)
	{
		try
		{
			ps=con.prepareStatement("delete from card where day=?");			
			ps.setString(1, Day);
			int value=ps.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Eroor is "+ex);
			return false;
		}
	}

}
