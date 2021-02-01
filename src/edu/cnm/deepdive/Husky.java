package edu.cnm.deepdive;

public class Husky extends Dog{
//to see the hierarchy, click on husky, go to Navigate -> Type Hierarchy
  public Husky(int age) {
    super(age);
    System.out.println("Husky");
  }
    public void printDetails() {
      System.out.println("name = " + getName() + " age = " + getAge());
    }

}
