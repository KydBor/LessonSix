public class CalculatorRun {
    public static void main (String[] args){
        Calculator One = new Calculator(8, 4);
        System.out.println("Сложение " + One.ab());
        System.out.println("Вычитание " + One.abba());
        System.out.println("Умножение " + One.aabb());
        System.out.println("Деление " + One.bbaa());
    }
}
