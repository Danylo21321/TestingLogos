package Test;

import java.io.*;
import java.util.List;

public class InputOutput {
    public static final String path = "/Users/khrystyna_nykolyshyn/Documents/TestingLogos/";
    public static final File file = new File("1.txt");
    public List<Device> deserialize(List<Device> deviceList) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(path + File.separator + file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        List<Device> list = (List<Device>) objectInputStream.readObject();
        System.out.println(list.toString());
        System.out.println(deviceList);
        inputStream.close();
        return  list;
    }
    public void serialize(List<Device> list) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(path + File.separator + file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

}
