import java.io.*;
interface printable
{
  void print();
}
public Myclass implements printable
{
  void print()
  {
    System.out.println("Hello");
  }
  public static void main(String args[])
  {
    Myclass ob=new Myclass();
    ob.print();
  }
}
