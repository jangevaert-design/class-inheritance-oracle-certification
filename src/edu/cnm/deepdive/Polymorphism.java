package edu.cnm.deepdive;

public class Polymorphism {

  public static void main(String[] args) {
    Husky husky = new Husky(5);
    husky.setName("Rex");

    Dog dog = husky; //this is called upcasting.
    dog.printDetails();

    HasTail hasTail = husky;
    System.out.println(hasTail.getTailLength());

    Animal cat = new Cat(2);// we can assign to Animal since Animal is parent class of Cat
//    Cat myCat = cat; does not compile because cat is of type Animal
    Cat myCat = (Cat) cat; //cast to Cat and now the code compiles.

    Animal rabbitAnimal = new Rabbit();
    rabbitAnimal.printDetails();//at runtime the overridden version of printDetails() will be used
    //even though we have the printDetails() in Animal class -> virtual method.
    //during compile time printDetails() will be considered the one in the Animal class but at
    //runtime and since the object is referring to Rabbit in memory, printDetails() of Rabbit will
    //be used.

  }

}
