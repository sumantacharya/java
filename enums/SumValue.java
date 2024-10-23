public class SumValue{
	public static void main(String[] args) {
		int[] numbers={2,5,3,6,8,7,4};
		String name="sumanth";
		 sumOfArray(numbers);
		 countNumbers(numbers);
		  findChar(name);

	}
	public static void sumOfArray(int[] numbers){
		System.out.println("Sum of the ineteger value in Array\n");
		int n=numbers.length;
		int values=0;
		for(int i=0;i<n;i++){
        values=values+numbers[i];     
		}
		System.out.println("sum of array is= "+values+"\n");
	}
     public static void countNumbers(int[] numbers){
     	System.out.println("\nCounting the Even and Odd numbers\n");
     	int evenCount=0;
     	int oddCount=0;
     	int n=numbers.length;
     	for(int i=0;i<n;i++){
     		if(numbers[i]%2!=0){
     			oddCount=oddCount+1;
     		}
     		else{
     			evenCount=evenCount+1;
     		}
     	}
     	System.out.println("the count of even in array is="+evenCount);
     	System.out.println("the count of odd in array is="+oddCount);


     }
     public static void findChar(String name){
     	System.out.println("Finding character in the Array \n");
     	char[] charArr=name.toCharArray();
     	char value='t';
     	for(int i=0;i<charArr.length;i++){
     		if(value==charArr[i]){
     			System.out.println("your given Character is in= "+i+" position");
     		}
     	}

     }


}