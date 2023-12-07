public abstract class Animal {
    private String SoundDog;
    private String SoundDuck;
    private String SoundCat;


    abstract void sound();
    abstract void getName();

    public String dog(String SoundDog){
        this.SoundDog=SoundDog;
        return SoundDog;
    }
    public String duck(String SoundDuck){
        this.SoundDuck=SoundDuck;
        return SoundDuck;
    }
    public String cat(String SoundCat){
        this.SoundCat=SoundCat;
        return SoundCat;
    }

}
