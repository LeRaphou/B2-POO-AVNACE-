public class Dog extends Animals{
    public Dog(int age, String name, String sound){
        super(age, name, sound);
    }
    @Override
    public void eat(){
        System.out.println(getName() + " Mange de la viande et des croquettes");
    }
}
