package edu.cnm.deepdive;

public class Snake extends Reptile{

  @Override
  protected boolean hasLegs() {
    return false;
  }

  @Override
  protected double getWeight() {
    return 10.0;
  }
}
