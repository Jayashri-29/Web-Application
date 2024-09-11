package mess.model;

public class CustomerModel {
	private int eid, cid, rid;
	private String name, contact, email;

	public CustomerModel() {

	}

	public CustomerModel(int eid, int cid, int rid, String name, String contact, String email) {
      this.eid=eid;
      this.cid=cid;
      this.rid=rid;
      this.name=name;
      this.email=email;
      this.contact=contact;
	}

	public CustomerModel(int cid, int rid, String name, String contact, String email) {
		 this.cid=cid;
	      this.rid=rid;
	      this.name=name;
	      this.email=email;
	      this.contact=contact;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
