1. Write a Java program to print 'Hello' on screen and then print your name on a 
separate line. 
class Hello
{
public static void main(String args[])
{
System.out.println("Hello");
}
}
2. Write a Java program to print the sum of two numbers. 
import java.util.Scanner;
class Assign2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter first number"+a);
		int b = sc.nextInt();
		System.out.println("Enter second number"+b);
		int c = a+b;
		System.out.println("Addition is:"+c);
	}
}
3. Write a Java program to divide two numbers and print on the screen.
 import java.util.Scanner;
class Assign3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter first number"+a);
		int b = sc.nextInt();
		System.out.println("Enter second number"+b);
		int c = a/b;
		System.out.println("Answer is:"+c);
	}
}
5. Write a Java program that takes two numbers as input and display the product of 
two numbers.
import java.util.Scanner;
class Assign5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter first number"+a);
		int b = sc.nextInt();
		System.out.println("Enter second number"+b);
		int c = a*b;
		System.out.println("Multiplication is:"+c);
	}
}
6. Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers.
import java.util.Scanner;
class Assign6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter first number"+a);
		int b = sc.nextInt();
		System.out.println("Enter second number"+b);
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		System.out.println("Addition is:"+c);
		System.out.println("Substraction is:"+d);
		System.out.println("Multiplication is:"+e);
		System.out.println("Division is:"+f);
		System.out.println("mod is:"+g);
	}
} 
7. Write a Java program that takes a number as input and prints its multiplication 
table upto 10.
import java.util.Scanner;
class Assign7
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println("Input is"+n);
  
  for(int i=1;i<=10;i++)
  {
  System.out.println(n+"="+n*i);
  }
}
} 
9. Write a Java program to compute the specified expressions and print the output.
class Assign9
{
public static void main(String args[])
{
float a=25.5f;
float b=3.5f;
float c=40.5f;
float d=4.5f;
float x;

x=((a*b-b*b)/(c-d));
System.out.println(x);
}
} 
10. Write a Java program to compute a specified formula.
class Assign10
{
public static void main(String args[])
{
float a=4.0f;
float b=1;
float c=1.0f;
float d=3;
float e=5;
float f=7;
float g=9;
float h=11;
float sum;

sum=a*(b-c/d)+(c/e)-(c/f)+(c/g)-(c/h);
System.out.println(sum);
}
} 
11. Write a Java program to print the area and perimeter of a circle
import java.util.Scanner;
class Assign11
{
public static void main(String args[])
{
  Scanner sc =new Scanner(System.in);
  float r = sc.nextFloat();
  float w =5.5f;
  float h =8.5f;
  float p=2*(h*w);
  float a= w*h;
  System.out.println("perimeter is"+p);
  System.out.println("area is"+a); 
  
  
}
}
13. Write a Java program to print the area and perimeter of a rectangle. 
import java.util.Scanner;
class Assign13
{
public static void main(String args[])
{
  Scanner sc =new Scanner(System.in);
  float r = sc.nextFloat();
  float w=5.5f;
  float h=8.5f;
  float p=2*(h*w);
  float a= w*h;
  System.out.println("perimeter is"+p);
  System.out.println("area is"+a); 
  
  
}
}