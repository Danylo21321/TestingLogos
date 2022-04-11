package Test;

import java.io.*;
import java.util.List;

public interface Builder {
    Builder serialize(List<Device> list) throws IOException, ClassNotFoundException;
    Builder deserialize(List<Device> list) throws IOException;
    Builder serializeAndDeSerialize(List<Device> list);
    Builder writer (List<Device> list);
}
