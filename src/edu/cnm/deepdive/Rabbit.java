package edu.cnm.deepdive;

public class Rabbit extends Animal {

  public Rabbit() {
//    super; this will not compile because the super constructor is called with super()
//    super().setAge(3); does not compile. Needs to be super.setAge(3).

    super();
    super.setAge(3);
  }

  public Rabbit(int age) {
//    this(age); recursive call because it calls itself.
//    super(); calls the super constructor in the Animal class.
//    this();  calls the constructor on line 5.
    super(3);
  }
}
