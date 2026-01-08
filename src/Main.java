void main() {
    Animals.commonRule();

    Cow cow = new Cow(10 , "JULLLL" , "meuh");
    System.out.println(cow.getName());
    System.out.println(cow.getSound());
    System.out.println(cow.getAge());
    cow.makeSound();

}
