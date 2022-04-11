package Test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.File;

public class Core_Task {
    public static final String path = "/Users/khrystyna_nykolyshyn/Documents/TestingLogos/";
    public static final File file = new File("1.txt");
    public static void main(String[] args) {
        System.out.println("hello igor )");

    }
}
@Data
@AllArgsConstructor
class Device{
    Long seriaNumber;
    String brend;
    String info;
    int price;
}
