package mess.service;

import mess.model.AdvanceModel;
import mess.repository.AdvanceRepo;
import mess.repository.AdvanceRepoImpl;

public class AdvancServiceImpl implements AdvanceService
{
	AdvanceRepo ar=new AdvanceRepoImpl();
	@Override
	public boolean idAdmitWithAmount(AdvanceModel m) {
		return ar.admitWithAdvance(m);
	}
	@Override
	public int getAdvanceById(int id) {
		return ar.getAdvnaceById(id);
	}

}
