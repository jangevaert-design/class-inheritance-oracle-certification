package edu.cnm.deepdive;

public interface Herbivore {

  default void eatGrass() {
    System.out.println("eats grass");
  }

//  default int getRequiredPlantAmount(); will not compile because a default method needs a body.
//  public int getRequiredPlantAmount() { will not compile because you need the default keyword.
//    return;
//  }

//  default int getRequiredPlantAmount() {   compiles
//    return 4;
//  }

}
