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


  }

}
