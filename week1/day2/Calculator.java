package week1.day2;

public class Calculator {
public int addThreeNumbers(int a,int b,int c)
{
	return a+b+c;
}
public float subTwoNumbers(int a,float b)
{
	return a-b;
}
public int divideTwoNumbers(int a,int b)
{ 
	return a/b;

}
public static void main(String[] args) {
	Calculator c=new Calculator();
	int add=c.addThreeNumbers(10, 20, 5);
	System.out.println(add);
	float sub=c.subTwoNumbers(5,2.0f);
	System.out.println(sub);
	int divide=c.divideTwoNumbers(8, 2);
	System.out.println(divide);
	
}  
}
