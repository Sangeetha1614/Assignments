package week1.day2;

public class MatchTwoArray {

	 public static void main(String[] args)
	 {
			int[] missingNumber= {1,2,3,4,7,6,8};
			int[] secondArray= {1,3,4,7,2,8,6};
			String result="";
			int missNum=missingNumber.length;
			int secArray=secondArray.length;
			
			if(missNum==secArray)
			{
				System.out.println("Both arrays are matching");
				for(int i=0;i<missNum;i++)
				{
					for(int j=0;j<secArray;j++)
					{ 
						if(missingNumber[i]==secondArray[j])
						{
							result="both are equal";
						}
						
					}				
					
			}
				System.out.println(result);
			}
			
			
			else
			{
				System.out.println("not matching");
			}
			
			
}
	 }

	 
