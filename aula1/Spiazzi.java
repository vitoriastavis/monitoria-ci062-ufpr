import java.util.Scanner;

public class Spiazzi {
    public static void main (String args[]) {
        Scanner come;
        int n;
        come = new Scanner(System.in);
       
        System.out.printf("Voce vai comer o que hoje:");
        n = come.nextInt();
        System.out.printf("\nVoce cuspiu %d!!\n", n);




        come.close();
    }
    
}
