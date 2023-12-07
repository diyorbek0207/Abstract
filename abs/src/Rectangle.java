public class Rectangle extends GeometricFigure{

    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }
    @Override
    void area() {
        int S=getSideA() * getSideB();
        System.out.println(S);
    }

    @Override
    void perimeter() {
        int p=(getSideA() + getSideB())*2;
        System.out.println(p);
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(32,29);
        rectangle.area();
        rectangle.perimeter();
    }
}
