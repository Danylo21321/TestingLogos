package Test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Core_Task {
    public static final String path = "/Users/khrystyna_nykolyshyn/Documents/TestingLogos/";
    public static final File file = new File("1.txt");
    public static List<Device> list = List.of(new Device(2L,"lg","info",401)
    , new Device(3L,"samsung","info",200));
    public static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Builder builder = new RealizeIo();
        builder.serializeAndDeSerialize(list).writer(list);
        AllOperationWithDevice();
    }
    public static void showAllDevice(){
        list.stream().forEach(System.out::println);
    }
    public static void sortDeviceWithBrend(){
        list.stream().sorted(Comparator.comparing(Device::getBrend)).forEach(System.out::println);
    }
    public static void sechDevicrWithNumber(){
        long serialNumberDevice = scanner.nextLong();
        list.stream().filter(device -> device.getSeriaNumber() == serialNumberDevice).forEach(System.out::println);
    }
    public static void filterDeviceWithSum(){
        list.stream().filter(device -> device.getPrice() > 400).forEach(System.out::println);
    }
    public static void sechMaxDeviceForPrice(){
        Device max = list.stream().max(Comparator.comparingDouble(Device::getPrice)).get();
        System.out.println(max);
    }
    public static void showHighPriceDevice(){
        list.stream().mapToInt(Device::getPrice).max().ifPresent(System.out::println);
    }
    public static void AllOperationWithDevice(){
        while (true){
            String forSwitch = scanner.next();
            switch (forSwitch){
                case "1":
                    showAllDevice();
                    break;
                case "2":
                    sortDeviceWithBrend();
                    break;
                case "3":
                    sechDevicrWithNumber();
                    break;
                case "4":
                    filterDeviceWithSum();
                case "5":
                    sechMaxDeviceForPrice();
                    break;
                case "6":
                    sechMaxDeviceForPrice();
                    break;
                case"7":
                    System.exit(0);
                    break;
                default:
                    System.out.println("incorrect answer");

            }
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
