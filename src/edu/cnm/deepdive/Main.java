package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    Husky husky = new Husky(5);//prints Animal - Dog - Husky. Although we only instantiated husk, we
    //did instantiate all three classes.
    //Order of initialization: parent classes are initialized first.
    husky.setName("Nyx");
    husky.printDetails();
    husky.setAge(6);
    husky.printName();
    husky.run(10);
    System.out.println("Weight = " + husky.getWeight());
    System.out.println("Tail length husky = " + husky.getTailLength());


//    Dog dog = new Dog(3);
//    dog.setName("Rex");
//    dog.printDetails(); does not compile because printDetails() is a method in Husky class.
//    Better would be to have printDetails() in Animal so that it is available to all subclasses.

    husky.eat();
    System.out.println("average weight = " + husky.getAverageWeight());

//    Animal animal = new Animal(); we cannot instantiate animal because the Animal class is abstract.

    Bear bear = new Bear();
    bear.eatGrass();
    bear.eatsMeat();
    bear.run();
    bear.setName("jimmy");
    bear.setAge(10);
    bear.printDetails();
  }

}
