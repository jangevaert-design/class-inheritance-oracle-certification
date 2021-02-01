package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    Husky husky = new Husky(5);//prints Animal - Dog - Husky. Although we only instantiated husk, we
    //did instantiate all three classes.
    //Order of initialization: parent classes are initialized first.
  }

}
