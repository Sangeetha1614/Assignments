package week1.day2;

public class MajorityElement {
public static void main(String[] args) {
	int[] a= {2, 4, 3, 6, 7, 5,5,5,5};  
	int count;
	int max=0;
	int index=-1;
	int len=a.length;
	for(int i=0;i<a.length;i++)
	{
		count=0;	
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				  count++;
				
				}
					
			}
		int currentMax=count;
			
			if(currentMax>=max)
			{ 
				max=currentMax;
				index=a[i];
				
			}
			
	
	}
	if(max>len/2)
	{
	
		System.out.println(index);
}
	else 
	{
		System.out.println("no majority");
	}
}
}