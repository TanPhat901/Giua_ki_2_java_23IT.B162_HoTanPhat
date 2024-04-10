package Giuaki;
import java.io.File;
import java.io.IOException;

public class  CreatedFile {
    public static void main(String[] args) {
        String fileName = "vehicle.txt";
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("Tạo tệp tin " + fileName + " thành công.");
            } else {
                System.out.println("Tệp tin " + fileName + " đã tồn tại.");
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo tệp tin " + fileName + ": " + e.getMessage());
        }
    }
}
