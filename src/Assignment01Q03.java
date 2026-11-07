public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int prev = 1;
        int curr = 1;
        int numOdd = 0;
        
        for (int i = 0; i < x; i++){
            System.out.print(prev);
            if (i < x-1)
                System.out.print(" ");
            if (prev % 2 == 1)
                numOdd += 1;
            
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
