package edu.cnm.deepdive;

public class Bear extends Animal implements Omnivore{



  @Override
  public void eatsMeat() {
    System.out.println("Bear eats meat");
  }

  @Override
  public void eatGrass() {
    System.out.println("Bear eats grass");
  }

  @Override
  public void printName() {
    System.out.println("Bear");
  }

  @Override
  public void run() {

  }

  @Override
  public int getWeight() {
    return 2_000;
  }
}
