public class Mountain{
	public static void main(String[] args) {
		int[]arr={2,3,8,5,9};
		
		int tallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > tallest) {
                tallest = arr[i];
            }
        }
        System.out.println("tallest="+tallest);
       
    }
}


