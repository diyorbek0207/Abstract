public class Cat extends Animal{
    @Override
    void sound() {
        System.out.println(cat("meow meow"));
    }

    @Override
    void getName() {
        System.out.println("Koshka");
    }

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sound();
        cat.getName();
    }
}
