package edu.cnm.deepdive;

public class Dog extends Animal{

  public Dog(int age) {
    super(age);
    System.out.println("Dog");

  }

  @Override
  public void eat() {
    super.eat();
    System.out.println("Dog eating");
  }

  @Override
  public double getAverageWeight() {
    return super.getAverageWeight() + 20;//in Husky this will also return 30. (10 from getAverageWeight()
    //in Animal and 20 added here as an int.
  }
}
