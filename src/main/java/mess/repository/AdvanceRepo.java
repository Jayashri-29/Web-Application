package mess.repository;

import mess.model.AdvanceModel;

public interface AdvanceRepo 
{
 public boolean admitWithAdvance(AdvanceModel m);
 public int getAdvnaceById(int id);
}
