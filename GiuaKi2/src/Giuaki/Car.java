package Giuaki;

class Car extends Vehicle {
    String slots, engineType;

    Car(String ID, String brand, String publishYear, String price, String color, String slots, String engineType) {
        super(ID, brand, publishYear, price, color);
        this.slots = slots;
        this.engineType = engineType;
    }

    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("Số chỗ ngồi: " + slots);
        System.out.println("Kiểu động cơ: " + engineType);
    }

	public String getSlots() {
		return slots;
	}

	public void setSlots(String slots) {
		this.slots = slots;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Car [slots=" + slots + ", engineType=" + engineType + ", ID=" + ID + ", brand=" + brand
				+ ", publishYear=" + publishYear + ", price=" + price + ", color=" + color + ", getSlots()="
				+ getSlots() + ", getEngineType()=" + getEngineType() + ", getID()=" + getID() + ", getBrand()="
				+ getBrand() + ", getPublishYear()=" + getPublishYear() + ", getPrice()=" + getPrice() + ", getColor()="
				+ getColor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
