package Giuaki;

interface ICar {
    void hienThongTin();
}

class Vehicle implements ICar {
    String ID, brand, publishYear, price, color;

    Vehicle(String ID, String brand, String publishYear, String price, String color) {
        this.ID = ID;
        this.brand = brand;
        this.publishYear = publishYear;
        this.price = price;
        this.color = color;
    }

	@Override
    public void hienThongTin() {
        System.out.println("ID: " + ID);
        System.out.println("Hãng sản xuất: " + brand);
        System.out.println("Năm sản xuất: " + publishYear);
        System.out.println("Giá bán: " + price);
        System.out.println("Màu sắc: " + color);
    }

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(String publishYear) {
		this.publishYear = publishYear;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
