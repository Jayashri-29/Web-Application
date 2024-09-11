package mess.service;

import java.util.List;

import mess.model.CustomerModel;
import mess.repository.*;

public class CustomerServiceImpl implements CustomerService
{
	CustomerRepo cr=new CustomerRepoImpl();
	public boolean isAddCust(CustomerModel m) {
		return cr.isaddcust(m);
	}
	@Override
	public List<Object[]> getAll() {
		return cr.getall();
	}
	@Override
	public boolean isDelBtId(int id) {
		return cr.isDelBtId(id);
	}
	@Override
	public boolean isUpdateCustomer(CustomerModel m) {
		return cr.isUpdateCustomer(m);
	}
	@Override
	public int getIdBtEmail(String Email) {
		return cr.getIdBtEmail(Email);
	}
	@Override
	public int getTotalMember(String name) {
		return cr.getTotalMember(name);
	}
	public int verifyCustomer(String email, String contact) {
		return cr.verifyCustomer(email, contact);
	}
	@Override
	public List<CustomerModel> getProfileById(int id) {
		return cr.getProfileById(id);
	}
	@Override
	 public int getTotalPresentDays(CustomerModel cm) {
		return cr.getTotalPresentDays(cm);
	}
	@Override
	public boolean verifyCustomer(CustomerModel m) {
		return cr.verifyCustomer(m);
	}
	@Override
	public int getTotalPresentDaysById(int id) {
		return cr.getPresentDayById(id);
	}
	@Override
	public int getPresentDayMonthWise(CustomerModel m, String month) {
		return cr.getPresentDayByMonth(m, month);
	}
	@Override
	public List<CustomerModel> getallByName(String name) {
		return cr.getallByName(name);
	}
	@Override
	public List<CustomerModel> getallWithoutAdvance()
	{
		return cr.getallWithoutAdvance();
	}
	@Override
	public boolean updcustomer(CustomerModel m) 
	{
		return cr.updCustomer(m);
	}
	@Override
	public List<CustomerModel> getALlNAmes(String name) {
		return cr.getAllNames(name);
	}
}
