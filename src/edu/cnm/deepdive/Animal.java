package edu.cnm.deepdive;

public abstract class Animal {

  private int age;

  public Animal() {

  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;

  public Animal(int age) {
    System.out.println("Animal");
    this.age = age;
  }

  public void printDetails() {
    printName();
    System.out.println("age = " + age);
  }

  public void eat() {
    System.out.println("Animal is eating");
  }

  public double getAverageWeight() {
    return 10.0;
  }

  public abstract void printName();

//  public static abstract void run() will not compile because an abstract method cannot be static.
//  public abstract run() {} will not compile because of the body of the method.
    public abstract void run();  // is the correct way to define an abstract method.

  public abstract int getWeight();

}
