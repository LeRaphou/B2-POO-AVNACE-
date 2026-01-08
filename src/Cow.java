public class Cow extends Animals implements Pet{
    public Cow(int age, String name, String sound){
        super(age, name, sound);
    }

    @Override
    public void play() {
        System.out.println(getName() + " joue dans le pré");
    }
}
