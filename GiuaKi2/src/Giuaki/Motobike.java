package Giuaki;

class Motobike extends Vehicle {
    String capacity;

    Motobike(String ID, String brand, String publishYear, String price, String color, String capacity) {
        super(ID, brand, publishYear, price, color);
        this.capacity = capacity;
    }

    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("Công suất: " + capacity);
    }

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Motobike [capacity=" + capacity + ", ID=" + ID + ", brand=" + brand + ", publishYear=" + publishYear
				+ ", price=" + price + ", color=" + color + ", getCapacity()=" + getCapacity() + ", getID()=" + getID()
				+ ", getBrand()=" + getBrand() + ", getPublishYear()=" + getPublishYear() + ", getPrice()=" + getPrice()
				+ ", getColor()=" + getColor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
}