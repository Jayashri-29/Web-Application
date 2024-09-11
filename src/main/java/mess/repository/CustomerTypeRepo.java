package mess.repository;

import java.util.*;

import mess.model.CustomerTypeModel;

public interface CustomerTypeRepo 
{
 public boolean isAddCustType(CustomerTypeModel ctm);
 public List<CustomerTypeModel> getAllTypes();
 public boolean delTypeBtid(int id);
 public boolean isUpdateCustType(CustomerTypeModel ctm);
 public String getTypeById(int id);
}