package edu.cnm.deepdive;

public class Eagle extends Bird{

  public int fly(int height) {
    System.out.println("Eagle is flying at " + height + " meters.");
    return height;
//this fly() is overloaded because it has a different parameter than the fly() in Bird class.
  }

  @Override
  public void eat(int amount) {

  }
}
