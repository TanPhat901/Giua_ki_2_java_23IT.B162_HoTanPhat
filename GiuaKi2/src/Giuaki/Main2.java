package Giuaki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    private static final String FILENAME = "vehicle.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicleList = readFromFile(FILENAME);
        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm phương tiện");
            System.out.println("2. Xoá phương tiện");
            System.out.println("3. Sửa phương tiện");
            System.out.println("4. Cập nhật phương tiện");
            System.out.println("5. Hiển thị danh sách phương tiện");
            System.out.println("6. Ghi danh sách phương tiện vào file");
            System.out.println("7. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    createVehicle(vehicleList, scanner);
                    break;
                case 2:
                	deleteVehicle(vehicleList, scanner);
                    break;
                case 3:
                	editVehicle(vehicleList, scanner);
                    break;
                case 4:
                	editVehicle(vehicleList, scanner);
                    break;
                case 5:
                    readVehicle(vehicleList);
                    break;
                case 6:
                    writeToFile(vehicleList, FILENAME);
                    System.out.println("Đã ghi danh sách phương tiện vào file.");
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        }
    }

    private static void writeToFile(ArrayList<Vehicle> vehicleList, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle instanceof Car) {
                    writer.println("Car," + vehicle.toString());
                } else if (vehicle instanceof Motobike) {
                    writer.println("Motobike," + vehicle.toString());
                } else if (vehicle instanceof Truck) {
                    writer.println("Truck," + vehicle.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void editVehicle(ArrayList<Vehicle> vehicleList, Scanner scanner) {
        System.out.println("Nhập ID của phương tiện cần chỉnh sửa:");
        String id = scanner.nextLine();
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getID().equals(id)) {
                System.out.println("Nhập thông tin mới cho phương tiện:");
             
                System.out.print("Hãng sản xuất: ");
                vehicle.setBrand(scanner.nextLine());
                System.out.print("Năm sản xuất: ");
                vehicle.setPublishYear(scanner.nextLine());
                System.out.print("Giá bán: ");
                vehicle.setPrice(scanner.nextLine());
               
                System.out.println("Đã cập nhật thông tin phương tiện có ID " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy phương tiện có ID " + id);
    }
    private static void deleteVehicle(ArrayList<Vehicle> vehicleList, Scanner scanner) {
        System.out.println("Nhập ID của phương tiện cần xoá:");
        String id = scanner.nextLine();
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getID().equals(id)) {
                vehicleList.remove(i);
                System.out.println("Đã xoá phương tiện có ID " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy phương tiện có ID " + id);
    }
    private static void readVehicle(ArrayList<Vehicle> vehicleList) {
    	for (Vehicle vehicle : vehicleList) {
    		vehicle.hienThongTin();
            System.out.println();
        }
    }
    private static void updateVehicle(ArrayList<Vehicle> vehicleList, Scanner scanner) {
        System.out.println("Nhập ID của phương tiện cần cập nhật:");
        String id = scanner.nextLine();
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getID().equals(id)) {
                System.out.println("Nhập thông tin mới cho phương tiện:");
                System.out.print("Hãng sản xuất: ");
                vehicle.setBrand(scanner.nextLine());
                System.out.print("Năm sản xuất: ");
                vehicle.setPublishYear(scanner.nextLine());
                System.out.print("Giá bán: ");
                vehicle.setPrice(scanner.nextLine());
                System.out.println("Đã cập nhật thông tin phương tiện có ID " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy phương tiện có ID " + id);
    }

    public static void createVehicle(ArrayList<Vehicle> vehicleList, Scanner scanner) {
        System.out.println("Nhập loại phương tiện (Car/Motobike/Truck):");
        String vehicleType = scanner.nextLine();

        switch (vehicleType) {
            case "Car":
                vehicleList.add(createCar(scanner));
                break;
            case "Motobike":
                vehicleList.add(createMotobike(scanner));
                break;
            case "Truck":
                vehicleList.add(createTruck(scanner));
                break;
            default:
                System.out.println("Loại phương tiện không hợp lệ.");
        }
    }

    private static Truck createTruck(Scanner scanner) {
    	System.out.println("Nhập thông tin cho xe tải:");
	    System.out.print("Nhập ID của xe tải: ");
	    String ID = scanner.nextLine();
	    System.out.print("Nhập hãng sản xuất: ");
	    String brand = scanner.nextLine();
	    System.out.print("Nhập năm sản xuất: ");
	    String publishYear = scanner.nextLine();
	    System.out.print("Nhập giá bán: ");
	    String price = scanner.nextLine();
	    scanner.nextLine();
	    System.out.print("Nhập màu sắc: ");
	    String color = scanner.nextLine();
	    System.out.println("Nhập trọng tải");
	    String loadWeight = scanner.nextLine();
		return new Truck (ID, brand, publishYear, price, color,loadWeight); 
    }

    private static Motobike createMotobike(Scanner scanner) {
    	System.out.println("Nhập thông tin cho xe máy:");
	    System.out.print("Nhập ID của xe máy: ");
	    String ID = scanner.nextLine();
	    System.out.print("Nhập hãng sản xuất: ");
	    String brand = scanner.nextLine();
	    System.out.print("Nhập năm sản xuất: ");
	    String publishYear = scanner.nextLine();
	    System.out.print("Nhập giá bán: ");
	    String price = scanner.nextLine();
	    scanner.nextLine();
	    System.out.print("Nhập màu sắc: ");
	    String color = scanner.nextLine();
	    System.out.print("Nhập công suất: ");
	    String capacity = scanner.nextLine();
	    scanner.nextLine();
		return new Motobike(ID, brand, publishYear, price, color,capacity); 
    }

    private static Car createCar(Scanner scanner) {
    	System.out.print("Nhập ID của ô tô: ");
        String ID = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String brand = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        String publishYear = scanner.nextLine();
        System.out.print("Nhập giá bán: ");
        String price = scanner.nextLine();
        scanner.nextLine();  
        System.out.print("Nhập màu sắc: ");
        String color = scanner.nextLine();
        System.out.print("Nhập số chỗ ngồi: ");
        String slots = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Nhập kiểu động cơ: ");
        String engineType = scanner.nextLine();
        return new Car(ID, brand, publishYear, price, color, slots, engineType);    
    }
    private static ArrayList<Vehicle> readFromFile(String filename) {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
               
                String[] parts = line.split(",");
                String type = parts[0].trim();
                if (type.equals("Car")) {
                    
                    // vehicleList.add(car);
                } else if (type.equals("Motobike")) {
                   
                } else if (type.equals("Truck")) {
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return vehicleList;
    }
}
