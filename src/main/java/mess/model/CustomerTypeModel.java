package mess.model;

public class CustomerTypeModel {
	private int uid;
	private String type;

	public CustomerTypeModel() {

	}

	public CustomerTypeModel(int uid, String type) 
	{
     this.uid=uid;
     this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
}
