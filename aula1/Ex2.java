import java.util.Scanner;

public class Ex2
{
    // le um numero e retorna se ele eh par ou impar
    public static void main(String args[])
    {
        // declara variaveis
        int num;
        Scanner input = new Scanner(System.in);  

        // le numero
        System.out.println("digite um numero");
        num = input.nextInt();

        // testa se eh par ou impar
        if (num % 2 == 0)
        {
            System.out.printf("par \n");
        }
        else
            System.out.printf("impar \n");

        input.close();
    }   
        
}

