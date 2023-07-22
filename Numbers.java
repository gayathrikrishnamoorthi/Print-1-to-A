package gayathri;

public class Numbers {
	public static void printNumbers(int A) {
        if (A <= 0) {
            return;
        }
        printNumbers(A - 1);
        System.out.print(A + " ");
    }

    public static void main(String[] args) {
        int A = 10;
        printNumbers(A);
        System.out.println(); 
        A = 5;
        printNumbers(A);
        System.out.println(); 
    }
}


