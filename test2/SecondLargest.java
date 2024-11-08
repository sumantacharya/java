public class SecondLargest{
	public static void main(String[] args) {
		int[]arr={2,3,8};
		
		int largest = arr[0];
        int secondLargest=0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest=largest;
                largest=arr[i];
            }
        }
        System.out.println("Second Largest Number=" +secondLargest);
       
    }
}