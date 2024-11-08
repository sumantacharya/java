

public class Remainder {

    public static void main(String[] args) {
        int A=5;
        int B=2;               

            if (B == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        else {
            
            int remainder = A % B;

            
            System.out.println("The remainder when " + A + " is divided by " + B + " is: " + remainder);
        }

        
       
    }
}
