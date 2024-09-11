package mess.service;

import mess.model.AdvanceModel;
import mess.repository.AdvanceRepo;
import mess.repository.AdvanceRepoImpl;

public interface AdvanceService
{

 public boolean idAdmitWithAmount(AdvanceModel m);
 public int getAdvanceById(int id);
 
}
