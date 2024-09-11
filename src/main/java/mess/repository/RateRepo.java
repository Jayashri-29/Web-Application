package mess.repository;

import mess.model.RateModel;
import java.util.*;
public interface RateRepo
{
public boolean addRate(RateModel m);
public List<RateModel> getAll();
public boolean delRate(int id);
public boolean updateById(RateModel m);
public int getRateById(int id);
}
