import java.io.*;
class Animal
{
  void eat()
  {
      System.out.println("Animal is eating");
  }
}
class Dog extends Animal
{
  void bark()
  {
    System.out.println("Dog is barking");
  }
}
class Puppy extends Animal
{
  void play()
  {
    System.out.println("Dog is playing");
  }
}
class Multi
{
  public static void main(String argrs[])
  {
    Puppy p=new Puppy();
    p.eat();
    p.bark();
    p.play();
  }
}
  
