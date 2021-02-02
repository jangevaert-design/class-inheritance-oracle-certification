package edu.cnm.deepdive;

public class PolyParameters {

  public static void main(String[] args) {
    Husky husky = new Husky(3);
    husky.setName("Rex");
    printDetails(husky);

    Rabbit rabbit = new Rabbit();
    rabbit.setName("Bunny");
    printDetails(rabbit);

    Cat cat = new Cat(2);
    cat.setName("Tom");
    printDetails(cat);

    Animal rex = createAnimal("Rex", 4);
    printDetails(rex);

    Animal kitty = createAnimal("Kitty", 4);
    printDetails(kitty);

    Animal bunny = createAnimal("Bunny", 5);
    printDetails(bunny);


  }
//    public static void printDetails(Husky husky) {
//      husky.printDetails();
//    }
//
//    public static void printDetails(Rabbit rabbit) {//overloaded method -> same method name but
//    //different parameters.
//    rabbit.printDetails();
//    }
//instead of duplicating these methods a 3rd time, we can create one method instead. One of the
//advantages of polymorphism.

  public static void printDetails(Animal animal) {
    animal.printDetails();
// all instances in subclasses can use the same method of parent class thanks to polymorphic parameters.
  }

  public static Animal createAnimal(String name, int age) {
    if (name.equals("Rex")) {
      Animal animal = new Husky(age);
      animal.setName(name);
      return animal;//we are returning animal but that animal in memory is Husky (line 40)
    } else if(name.equals("Kitty")) {
      Animal cat = new Cat(age);
      cat.setName(name);
      return cat;
    }
    Animal rabbit = new Rabbit(age);
    rabbit.setName(name);
    return rabbit;
  }
}
