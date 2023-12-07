public class Dog extends Animal{
    @Override
    void sound() {
        System.out.println(dog("bow bow"));
    }

    @Override
    void getName() {
        System.out.println("Bobik");
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.sound();
        dog.getName();
    }
}
