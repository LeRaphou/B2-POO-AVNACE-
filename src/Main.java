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

}
