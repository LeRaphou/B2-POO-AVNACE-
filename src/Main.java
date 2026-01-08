void main() {
    Animals.commonRule();

    Cow cow = new Cow(10 , "JULLLL" , "meuh");
    System.out.println(cow.getName());
    System.out.println(cow.getSound());
    System.out.println(cow.getAge());
    cow.makeSound();
    cow.eat();

    Dog dog = new Dog(5,"SCH","woof");
    System.out.println(dog.getName());
    System.out.println(dog.getSound());
    System.out.println(dog.getAge());
    dog.eat();

}
