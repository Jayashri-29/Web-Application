package mess.service;

import java.util.List;

import mess.model.PresentDay;
import mess.repository.PresentRepo;
import mess.repository.PresentRepoImpl;

public class PresentServiceImpl implements PresentService
{
    PresentRepo pr=new PresentRepoImpl();
	@Override
	public boolean takePresenty(PresentDay pd) {
		return pr.takePresenty(pd);
	}
	@Override
	public List<PresentDay> getPresentDates(int id) {
		return pr.getPresentDates(id);
	}
	@Override
	public List<PresentDay> getDatesBtMonth(int id, String month) {
		return pr.getDatesMonthwise(id, month);
	}

}
