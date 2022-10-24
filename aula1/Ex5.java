import java.util.Scanner;

public class Ex5
{
    // le x e aplica em f(x):
    // 0 <= x < 5, f(x) = x
    // 5 <= x <10; f(x) = 2x + 1
    // x >= 10; f(x) = x - 3
    public static void main(String args[])
    {
        // declara variaveis
        int x, y;
        Scanner input = new Scanner(System.in);
           
        // le x
        System.out.println("digite um numero");   
        x = input.nextInt();

        if (x >= 0 & x < 5)
            y = x;
        else if (x >= 5 & x < 10)
            y = 2*x + 1;
        else
            y = x - 3;

        // printa y
        System.out.printf("f(%d): %d \n", x, y);

        input.close();
    }        
}

