package mess.service;

import java.util.List;

import mess.model.PresentDay;

public interface PresentService 
{
 public boolean takePresenty(PresentDay pd);
 public List<PresentDay> getPresentDates(int id); 
 public List<PresentDay> getDatesBtMonth(int id,String month);
}
