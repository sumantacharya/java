public class CheckArray{	
 public static void main(String[] args) {
											
	int[] arr={2,3,5,6};
	int x=4;
     for(int i=0;i<arr.length;i++){
		if(arr[i]==x){
			System.out.println("yes");	
			return ;

	     }
     }
     System.out.println("no");        
 }

}

