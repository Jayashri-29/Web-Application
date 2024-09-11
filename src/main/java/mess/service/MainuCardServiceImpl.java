package mess.service;

import java.util.List;

import mess.model.MainuCardModel;
import mess.repository.MainuCardRepo;
import mess.repository.MainuCardRepoImpl;

public class MainuCardServiceImpl implements MainuCardService
{
    MainuCardRepo mcr=new MainuCardRepoImpl();
	@Override
	public boolean addItemToCard(MainuCardModel m) {
		return mcr.addItemToCard(m);
	}
	@Override
	public List<MainuCardModel> getAllData() {
		return mcr.getAllList();
	}
	@Override
	public boolean updatebyDay(MainuCardModel m) {
		return mcr.updatebyDay(m);
	}
	@Override
	public boolean delByDay(String Day) {
		return mcr.delByDay(Day);
	}

}
