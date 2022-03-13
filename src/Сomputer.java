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

    public static void OnOff(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [5];
        for(int i = 0; i < 5; i++){
            System.out.println("Введите число: ");
            array[i] = scanner.nextInt();//тут выводим данные после run//
        }
        for(int i = 0; i < 5; i++){
            System.out.println(array[i]);// эта команда выполняет данные после заполнения данных//
        }
            }
}
