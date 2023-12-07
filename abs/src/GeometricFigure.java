public abstract class GeometricFigure {
    private int sideA=25;
    private int sideB=20;
    private int sideC=23;
    public GeometricFigure(){

    }
    public GeometricFigure(int sideA,int sideB,int sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    public GeometricFigure(int sideA,int sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }

    abstract void area();
    abstract void perimeter();

    public int getSideA(){
        return sideA;
    }
    public int getSideB(){
        return sideB;
    }
    public int getSideC(){
        return sideC;
    }

}
