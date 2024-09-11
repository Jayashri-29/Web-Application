package mess.service;

import mess.model.CustomerModel;
import java.util.*;
public interface CustomerService 
{
  public boolean isAddCust(CustomerModel m);
  public List<Object[]> getAll();
  public List<CustomerModel> getallWithoutAdvance();
  public boolean isDelBtId(int id);
  public boolean isUpdateCustomer(CustomerModel m);
  public int getIdBtEmail(String Email);
  public int getTotalMember(String name);
  public int verifyCustomer(String email,String contact);
  public List<CustomerModel> getProfileById(int id);
  public int getTotalPresentDays(CustomerModel cm);
  public boolean verifyCustomer(CustomerModel m);
  public int getTotalPresentDaysById(int id);
  public int getPresentDayMonthWise(CustomerModel m,String month);
  public List<CustomerModel> getallByName(String name);
  public boolean updcustomer(CustomerModel m);
  public List<CustomerModel> getALlNAmes(String name);
}
