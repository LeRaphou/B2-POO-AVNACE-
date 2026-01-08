public class Animals {
    private int age;
    private String name;
    private String sound;

    public Animals(int age, String name, String sound) {
        this.age = age;
        this.name = name;
        this.sound = sound;
    }


    protected int getAge() {
        return age;
    }

    protected String getName() {
        return name;
    }

    protected String getSound() {
        return sound;
    }

    public static void commonRule() {
        System.out.println("Règle : tous les animaux respirent et se nourrissent.");
    }

    public void makeSound() {
        System.out.println(name + " fait : " + sound);
    }

    public void eat(){
        System.out.println(name+" mange");
    }


    public void eat(String food){
        System.out.println(name+" mange" + food);
    }

}
