package test.com.domain;

public class Car {

	private Integer id;
	private Float length;
	Float wide;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}

	public Float getWide() {
		return wide;
	}

	public void setWide(Float wide) {
		this.wide = wide;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", length=" + length + ", wide=" + wide + "]";
	}

}
