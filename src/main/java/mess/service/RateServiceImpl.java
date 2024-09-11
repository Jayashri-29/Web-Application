package mess.service;

import java.util.List;

import mess.model.RateModel;
import mess.repository.RateRepo;
import mess.repository.RateRepoImpl;

public class RateServiceImpl implements RateService
{
   RateRepo rr=new RateRepoImpl();
	@Override
	public boolean isAddRate(RateModel m) {
		return rr.addRate(m);
	}
	@Override
	public List<RateModel> getAll() {
		return rr.getAll();
	}
	@Override
	public boolean delRate(int id) {
      return rr.delRate(id);
	}
	@Override
	public boolean isUpdateById(RateModel m) {
      return rr.updateById(m);
	}
	@Override
	public int getRateById(int id) {
		return rr.getRateById(id);
	}

}
