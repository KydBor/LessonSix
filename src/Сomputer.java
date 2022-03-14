import java.util.Random;
import java.util.Scanner;

public class Сomputer {
/*    String CPU;
    int RAM;
    int Harddrive;
    int OnOff;

    public Computer (String CPU, int RAM, int Harddrive, int OnOff){
        this.CPU = CPU;
        this.RAM = RAM;
        this.Harddrive = Harddrive;
        this.OnOff = OnOff;
    }

    public void Description (){
        System.out.println("CPU - " + CPU);
        System.out.println("RAM (MB) - " + RAM);
        System.out.println("Harddrive (GB) - " + Harddrive);
        System.out.println("OnOff - " + OnOff);
    }*/

    public static void main (String[] args) {
        Random random = new Random();
        int a = random.nextInt(2);
        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите угаданный номер");
        int i = scanner.nextInt();
        if (a == i) {
            System.out.println("Комп включается");
        } else if (a != i) {
            System.out.println("Комп сорел");
            System.out.println("Введите повторно число");
            if (a != i) {
                i = scanner.nextInt();
            }System.out.println("У вас же комп сорел");
        }



    }


}
