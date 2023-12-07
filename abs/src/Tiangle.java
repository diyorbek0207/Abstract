public class Tiangle extends GeometricFigure{
    public Tiangle(int sideA,int sideB,int sideC){
        super(sideA,sideB,sideC);
    }
    @Override
    void area() {
        double p=(getSideA() + getSideB() + getSideC())/2;

        double S=Math.sqrt(p*(p-getSideA())*(p-getSideB())*(p-getSideC()));
        System.out.println(S);
    }

    @Override
    void perimeter() {
        double p=getSideA() + getSideB() + getSideC();
        System.out.println(p);
    }

    public static void main(String[] args) {
        Tiangle tiangle=new Tiangle(41,35,20);
        tiangle.area();
        tiangle.perimeter();


    }
}
