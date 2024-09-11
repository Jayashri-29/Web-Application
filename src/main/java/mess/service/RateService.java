package mess.service;

import mess.model.RateModel;
import java.util.*;
public interface RateService 
{
public boolean isAddRate(RateModel m);
public List<RateModel> getAll();
public boolean delRate(int id);
public boolean isUpdateById(RateModel m);
public int getRateById(int id);
}
