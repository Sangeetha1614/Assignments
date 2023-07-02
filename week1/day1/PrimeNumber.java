package week1.day1;

public class PrimeNumber {
public static void main(String[] args) {
	int num= 29;
	boolean value=true;
	
	for (int i1=2;i1<num;i1++)
	{
	if(num%i1==0)
	{
		value=false;
	    break;
	  }
	}
    if(value)
	{
	System.out.println("number is  prime number");
	}
    else {
    System.out.println("number is not a prime number");
    }
}
}

