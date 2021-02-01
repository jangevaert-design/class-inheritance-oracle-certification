package edu.cnm.deepdive;

public interface Carnivore {

  default void eatsMeat() {
    System.out.println("eating meat");
  }
}
