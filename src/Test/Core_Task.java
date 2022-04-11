package Test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Core_Task {
    public static final String path = "/Users/khrystyna_nykolyshyn/Documents/TestingLogos/";
    public static final File file = new File("1.txt");
    public static void main(String[] args) {
        System.out.println("hello igor )");
        InputOutput inputOutput = new InputOutput();
        List<Device> list = new ArrayList<>();
        list.add(new Device(1213L,"lg","info",21321));
        try {
            inputOutput.serialize(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inputOutput.deserialize(list);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

@Data
@AllArgsConstructor
class Device implements Serializable {
    Long seriaNumber;
    String brend;
    String info;
    int price;
}
