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
  void eat(){
      super.eat();
    System.out.println("Dog is eating");
  }
}
class Main
{
  public static void main(String argrs[])
  {
      Dog dog=new Dog();
      dog.eat();
  }
}
  
