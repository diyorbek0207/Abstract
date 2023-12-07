public class Trapezium extends GeometricFigure{
    private int h=20;
    public Trapezium(int sideA,int sideB){
        super (sideA,sideB);
    }
    @Override
    void area() {
        double S=((getSideA()+getSideB())*h)/2;
        System.out.println(S);
    }

    @Override
    void perimeter() {
        double p=getSideA()+getSideB()+getSideC()*2;
        System.out.println(p);
    }

    public static void main(String[] args) {
        Trapezium trapezium=new Trapezium(41,36);
        trapezium.area();
        trapezium.perimeter();
    }
}
