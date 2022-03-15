public class ComputerRun {
    public static void main(String[] args) {

        Computer computer = new Computer ("CPU", 1, 2, 3);
        computer.Run();
        System.out.println(computer.Description());
    }
}
