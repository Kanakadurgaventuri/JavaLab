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
  void eat()
  {
    super.eat();
    System.out.println("Dog is eating");
  }
}
class Single
{
  public static void main(String argrs[])
  {
    Dog d=new Dog();
    d.eat();
  }
}
  
