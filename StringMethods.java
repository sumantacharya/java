public class StringMethods{
	public static void main(String[] args){
		String animal="elephant big";

		String concatValue=animal.concat("park");
		System.out.println(concatValue);

        String trimedValue=animal.trim();
        System.out.println(trimedValue);

        String stringCheck="";
        boolean stringCheckedValue=stringCheck.isEmpty();// it will check true or false 
        System.out.println(stringCheckedValue);
         
        String name="sumanth acharya";
        String[] splitedValue=name.split(" ");
        System.out.println(splitedValue[0]);
        System.out.println(splitedValue[1]);

        String letters="abcd";
        String upperCase=letters.toUpperCase();
        System.out.println(upperCase);
        
        String letter="ABCDEF";
        String lowerCase=letter.toLowerCase();
        System.out.println(lowerCase);

        String palindrome="athul";
        char[] myChar=palindrome.toCharArray();
        String value="";
      
        for(int i=myChar.length-1;i>=0;i--){
        	value=value + myChar[i];
        	        }
        if(palindrome.equals(value)){
        	System.out.println("is palindrome:-"+value);
        }
        else{
        	System.out.println(" not  a palindrome");
        }

        int[]numbers={12,2,8,50,100,5,98};
        int smallestValue=numbers[0];
        int secondSmallestvalue=0;
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<smallestValue){
                secondSmallestvalue=smallestValue;
                smallestValue=numbers[i];
            }
            else if(numbers[i]<secondSmallestvalue){
                 secondSmallestvalue=numbers[i];

            }
        }

        
  System.out.println(secondSmallestvalue);
  System.out.println(smallestValue);

	}
}