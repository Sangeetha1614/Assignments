package week1.day2;

public class FindUniqueNumber {
	 public static void main(String[] args)
	 {
			int[] uniqueNumber= {5, 1, 1, 1, 1, 1, 4, 9, 1, 0, 1, 2};  
			int count=0;
			for(int i=0;i<uniqueNumber.length;i++)
			{
				count=0;	
				for(int j=0;j<uniqueNumber.length;j++)
				
				{		
						
					if(uniqueNumber[i]==uniqueNumber[j])
					{
						count=count+1;
						
					}
				}
						
						if (count<=1)
						{
						System.out.println("unique numbers are:" +uniqueNumber[i]);
					}
				}
			}	
				
}
