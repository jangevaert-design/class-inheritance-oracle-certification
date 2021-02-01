package edu.cnm.deepdive;

public interface Run extends Walk {

  default int getSpeed() {
    return 12;
  }

}
