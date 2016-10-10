package test.com.abstractcalss;

public abstract class Plane {

	private Float length;

	protected String name;

	public void fly() {
		System.out.println("fly...");
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Plane [length=" + length + ", name=" + name + "]";
	};

}
