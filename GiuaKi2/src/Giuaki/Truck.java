package Giuaki;

public class Truck extends Vehicle{
	String loadWeight;

	public Truck(String ID, String brand, String publishYear, String price, String color, String loadWeight) {
		super(ID, brand, publishYear, price, color);
		this.loadWeight = loadWeight;
	}
	 public void hienThongTin() {
	        super.hienThongTin();
	        System.out.println("Trọng tải: " + loadWeight);
	 }
	public String getLoadWeight() {
		return loadWeight;
	}
	public void setLoadWeight(String loadWeight) {
		this.loadWeight = loadWeight;
	}
	@Override
	public String toString() {
		return "Truck [loadWeight=" + loadWeight + ", ID=" + ID + ", brand=" + brand + ", publishYear=" + publishYear
				+ ", price=" + price + ", color=" + color + ", getLoadWeight()=" + getLoadWeight() + ", getID()="
				+ getID() + ", getBrand()=" + getBrand() + ", getPublishYear()=" + getPublishYear() + ", getPrice()="
				+ getPrice() + ", getColor()=" + getColor() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	 
}
