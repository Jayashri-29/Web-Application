package mess.repository;

import mess.model.CustomerModel;
import java.util.*;
public interface CustomerRepo
{
 public boolean isaddcust(CustomerModel m);
 public List<Object[]> getall();
 public List<CustomerModel> getallWithoutAdvance();
 public boolean isDelBtId(int id);
 public boolean isUpdateCustomer(CustomerModel m);
 public int getIdBtEmail(String Email);
 public int getTotalMember(String name);
 public int verifyCustomer(String email,String contact);
 public boolean verifyCustomer(CustomerModel m);
 public List<CustomerModel> getProfileById(int id);
 public int getTotalPresentDays(CustomerModel m);
 public int getPresentDayById(int id);
 public int getPresentDayByMonth(CustomerModel m,String month);
 public List<CustomerModel> getallByName(String name);
 public boolean updCustomer(CustomerModel m);
 public List<CustomerModel> getAllNames(String name);
}
