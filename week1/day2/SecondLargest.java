package week1.day2;

import java.util.Arrays;

public class SecondLargest {
 public static void main(String[] args) {
	int[] data= {3,2,11,4,6,7,9,13,12,14};
	//int count=0;
	int len=data.length;
	Arrays.sort(data);
	
	for(int i=len-2;i>0;)
	{
		System.out.println(data[i]);
		break;
//		count=count+1;
//		if(count==2)
//		{

		}
	
}
}

