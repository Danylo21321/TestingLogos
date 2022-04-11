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
        List<Device> list = new ArrayList<>();
        list.add(new Device(1213L,"lg","info",21321));
        Builder builder = new RealizeIo();
        builder.serializeAndDeSerialize(list).writer(list);
        InputOutput inputOutput1 = new InputOutput();

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
