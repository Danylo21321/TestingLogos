package Test;

import java.io.*;
import java.util.List;

public interface Builder {
    Builder serialize(List<Device> list) throws IOException, ClassNotFoundException;
    Builder deserialize(List<Device> list) throws IOException;
    Builder serializeAndDeSerialize(List<Device> list);
    Builder writer (List<Device> list);
}
class RealizeIo implements Builder{
    public static final String path = "/Users/khrystyna_nykolyshyn/Documents/TestingLogos/";
    public static final File file = new File("1.txt");
    public static final File file1 = new File("2.txt");

    @Override
    public Builder serialize(List<Device> list) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(path + File.separator + file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        List<Device> list1 = (List<Device>) objectInputStream.readObject();
        System.out.println(list1.toString());
        System.out.println(list);
        inputStream.close();
        return this;
    }

    @Override
    public Builder deserialize(List<Device> list) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(path + File.separator + file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        objectOutputStream.close();
        return this;
    }

    @Override
    public Builder serializeAndDeSerialize(List<Device> list) {
        try {
            serialize(list);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            deserialize(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public Builder writer(List<Device> list) {
        try {
            FileWriter writer = new FileWriter(path + File.separator + file1,true);
            writer.write(list.toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }
}
