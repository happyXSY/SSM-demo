package test.com.domain;

public class BMW extends Car {

	private String model;
	private Float price;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		wide = 3.5f;
		return "BMW [wide=" + getWide() + ",length=" + getLength() + ",id=" + getId() + ",model=" + model + ", price="
				+ price + "]";
	}

}
