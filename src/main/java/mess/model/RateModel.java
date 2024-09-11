package mess.model;

public class RateModel {
	private int id, price;
	private String name;

	public RateModel() {

	}

	public RateModel(int id, String name, int price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public RateModel(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
