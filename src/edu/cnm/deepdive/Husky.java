package edu.cnm.deepdive;

public class Husky extends Dog{ // we don't need to implement the interface because Dog implements it.
//to see the hierarchy, click on husky, go to Navigate -> Type Hierarchy
  public Husky(int age) {
    super(age);
    System.out.println("Husky");
  }

  @Override
  public void eat() {
    super.eat();
    System.out.println("Husky eating");
  }

  @Override
  public void printName() {
    System.out.println("Husky name = " + getName());
  }

  @Override
  public void run() {

  }

  @Override
  public int getWeight() {
    return 14;
  }

  @Override
  public int getTailLength() {
    return 20;
  }

  @Override
  public void run(int speed) {
    System.out.println("Husky running at speed = " + speed);
  }
}
