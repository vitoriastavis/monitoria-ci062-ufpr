import java.util.Scanner;

public class Ex1
{    
    // le um numero e printa se eh positivo ou negativo
    public static void main (String args[])
    {
        // declara variaveis
        int num;
        Scanner input = new Scanner(System.in);

        // le numero
        System.out.println("digite um numero");
        num = input.nextInt();

        // testa se eh positivo ou negativo
        if (num > 0)
        {
            System.out.println("eh positivo");            
        }
        else    
            System.out.println("eh negativo");

        input.close(); 
    }

        
}

