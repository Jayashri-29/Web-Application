package mess.repository;

import java.util.List;

import mess.model.PresentDay;

public interface PresentRepo 
{
	 public boolean takePresenty(PresentDay pd);
	 public List<PresentDay> getPresentDates(int id);
	 public List<PresentDay> getDatesMonthwise(int id,String month);
	 
}
