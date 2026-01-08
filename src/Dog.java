public class Dog extends Animals implements Pet{
    public Dog(int age, String name, String sound){
        super(age, name, sound);
    }
    @Override
    public void eat(){
        System.out.println(getName() + " Mange de la viande et des croquettes");
    }

    public void eat(String food){
        System.out.println(getName() + " Mange ces croquette mais prefère :" + food);
    }

    @Override
    public void play() {
        System.out.println(getName() + " joue à la balle");
    }
}
