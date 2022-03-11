public class Human {
    int countofHands;
    int countofFoot;
    boolean isMan;

    public Human (int countofHands, int countofFoot, boolean isMan){
        this.countofHands = countofHands;//this объект относится к своему экземпляру класса
        this.countofFoot = countofFoot;
        this.isMan = isMan;
    }

    public void say (){
        System.out.println("Hello, I'm man - " + isMan);
    }

    public int CountofHandsAndFeet(){
        return countofFoot + countofHands;
    }
}
