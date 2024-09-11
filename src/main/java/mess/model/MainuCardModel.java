package mess.model;

public class MainuCardModel {
	private String day, bhaji, dal, poli, rice, sweet;

	public MainuCardModel() {

	}

	public MainuCardModel(String day, String bhaji, String dal, String poli, String rice, String sweet) {
		this.day = day;
		this.bhaji = bhaji;
		this.dal = dal;
		this.poli = poli;
		this.rice = rice;
		this.sweet = sweet;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getBhaji() {
		return bhaji;
	}

	public void setBhaji(String bhaji) {
		this.bhaji = bhaji;
	}

	public String getDal() {
		return dal;
	}

	public void setDal(String dal) {
		this.dal = dal;
	}

	public String getPoli() {
		return poli;
	}

	public void setPoli(String poli) {
		this.poli = poli;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public String getSweet() {
		return sweet;
	}

	public void setSweet(String sweet) {
		this.sweet = sweet;
	}

}
