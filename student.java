public class student{
	public static void main(String[] args){
		System.out.println("\n ******Printing string element******");
		for(int index=0;index<args.length;index++)
		{
			System.out.println(args[index]);
		}
		System.out.println("\n ******Reverse******");
		for(int index=args.length-1;index>=0;index--)
		{
			System.out.println(args[index]);
	}
}
}