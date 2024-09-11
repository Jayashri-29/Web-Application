package mess.model;

public class PresentDay {
	private int eid, present;
	private String date;

	public PresentDay() {

	}

	public PresentDay(int eid, int present, String date) {
		this.eid=eid;
		this.date=date;
		this.present=present;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getPresent() {
		return present;
	}

	public void setPresent(int present) {
		this.present = present;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
