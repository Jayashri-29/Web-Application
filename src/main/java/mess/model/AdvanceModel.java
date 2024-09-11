package mess.model;

public class AdvanceModel {
	private int adv;
	private int id;

	public AdvanceModel() {

	}

	public AdvanceModel(int adv, int id) {
		this.id = id;
		this.adv = adv;
	}

	public int getAdv() {
		return adv;
	}

	public void setAdv(int adv) {
		this.adv = adv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
