public class HumanRun {
    public static void main (String[] args){
        Human Euhene = new Human (2, 2, true);//CTRL+P
        Human Alex = new Human (315, 315, false);
        Euhene.say();
        System.out.println("Количество рук и ног у Евгения " + Euhene.CountofHandsAndFeet());
        Alex.say();
        System.out.println("Количество рук и ног у Сани " + Alex.CountofHandsAndFeet());
    }
}
