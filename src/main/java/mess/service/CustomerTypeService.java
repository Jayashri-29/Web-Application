package mess.service;
import java.util.*;
import mess.model.CustomerTypeModel;

public interface CustomerTypeService 
{
  public boolean addCustType(CustomerTypeModel ctm);
  public List<CustomerTypeModel> getAllCustType();
  public boolean isDelTypeByid(int id);
  public boolean isupdatecusttype(CustomerTypeModel ctm);
  public String getTypeById(int id);
}
