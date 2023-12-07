public  class Duck extends Animal{
    @Override
    void sound() {
        System.out.println(duck("quack quack"));
    }

    @Override
    void getName() {
        System.out.println("duck");
    }

    public static void main(String[] args) {
        Duck duck=new Duck();
        duck.sound();
        duck.getName();
    }
}
