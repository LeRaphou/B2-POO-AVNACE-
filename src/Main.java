import java.util.ArrayList;
import java.util.List;

void main() {
    Animals.commonRule();




    Cow cow = new Cow(10 , "JULLLL" , "meuh");
    System.out.println("La vache s'appel "+cow.getName());
    System.out.println(cow.getSound());
    System.out.println(cow.getName() + " a " + cow.getAge()+" ans.");
    cow.makeSound();
    cow.eat();
    cow.eat(" de la bonne herbe fraiche");




    Dog dog = new Dog(5,"SCH","woof");
    System.out.println("Le chien s'appel " + dog.getName());
    System.out.println(dog.getSound());
    System.out.println(dog.getAge()+"ans");
    dog.eat();
    dog.eat(" un boeuf bourgignon");

    Pet pet1 = new Dog(3, "Rex", "Woof");
    pet1.play();
    Pet pet2 = new Cow(5, "Marguerite" , "Meuh");
    pet2.play();

    List<Animals> animals = new ArrayList<>();
    animals.add(new Dog(2, "SoSoManess", "Woof"));
    animals.add(new Dog(2, "WaRenoi", "Woof"));
    animals.add(new Cow(2, "KYKY2Bondy", "meuh"));
    animals.add(new Cow(2, "Jérome", "meuh"));

    System.out.println("\n=== Parcours de la liste d'Animals ===");
    for (Animals animal : animals) {
        animal.makeSound();
        animal.eat();

        if (animal instanceof Pet) {
            ((Pet) animal).play();
        }
    }
}
