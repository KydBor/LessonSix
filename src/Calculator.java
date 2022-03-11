public class Calculator {
    double a;
    double b;

    public Calculator (double a, double b){
        this.a = a;
        this.b = b;
    }
    public double ab(){
        return a + b;
    }
    public double abba(){
        return a - b;
    }
    public double aabb(){
        return a * b;
    }
    public double bbaa(){
        return a / b;
    }
}
