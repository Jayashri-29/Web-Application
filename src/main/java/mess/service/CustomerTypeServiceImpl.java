package mess.service;

import java.util.List;

import mess.model.CustomerTypeModel;
import mess.repository.CustomerTypeRepo;
import mess.repository.CustomerTypeRepoImpl;

public class CustomerTypeServiceImpl implements CustomerTypeService
{
    CustomerTypeRepo ctr=new CustomerTypeRepoImpl();
	@Override
	public boolean addCustType(CustomerTypeModel ctm) {
		return ctr.isAddCustType(ctm);
	}
	public List<CustomerTypeModel> getAllCustType() {
		 
		return ctr.getAllTypes();
	}
	@Override
	public boolean isDelTypeByid(int id) {
		return ctr.delTypeBtid(id);
	}
	@Override
	public boolean isupdatecusttype(CustomerTypeModel ctm) {
	  return ctr.isUpdateCustType(ctm);
	}
	@Override
	public String getTypeById(int id) {
		return ctr.getTypeById(id);
	}
	
}

