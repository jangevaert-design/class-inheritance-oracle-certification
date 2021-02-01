package edu.cnm.deepdive;

public class Cat extends Animal implements Run {



  public Cat(int age) {
    super(age);
  }

  @Override
  public void printName() {

  }

  @Override
  public void run() {

  }

  @Override
  public int getWeight() {
    return 5;
  }
}
