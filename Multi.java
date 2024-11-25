import java.io.*;
import java.util.*;
class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	void area()
	{
		super.eat();
		System.out.println("Dog is eating");
	}
	void play()
	{
		System.out.println("Dog is playing");
	}
}
class Puppy extends Dog
{
	void bark()
	{
		System.out.println("Puppy is barking");
	}
}
class MultiInheritance
{
	public static void main(String args[])
	{
		Puppy p=new Puppy();
		p.bark();
		p.eat();
		p.play();
	}
}
