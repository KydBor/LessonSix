import java.util.Random;
import java.util.Scanner;

public class Сomputer {
    String CPU;
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
    }

    public static void main(String[] args) {
        Random random = new Random(); //Создать экземпляр
        int a = random.nextInt(2);//Создайте случайное число от 0 до 99 и назначьте его случайным образом
        System.out.println(a);//  Показать напечатать это случайное число
        //введите данные
        Scanner scanner = new Scanner(System.in);//  Создать экземпляр ввода
        System.out.println("Введите угаданный номер");
        int i = scanner.nextInt();
        if (a == i) {
            System.out.println("Комп включается"); //Когда введенное число меньше случайного числа
        } else if (a != i) {
            System.out.println("Комп сорел");//  Когда введенное число больше случайного числа
        }

    }


}
