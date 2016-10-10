package test.com.domain;


public class Audi extends Car {
	private String name;
	private String brand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		wide = 3.6f;
		return "Audi [wide=" + getWide() + ",length=" + getLength() + ",id=" + getId() + ",name=" + name + ", brand="
				+ brand + "]";
	}

}
