import java.util.Scanner;

public class Ex3
{
    // le de numeros ate digitar -1 e printa a soma deles
    public static void main(String args[])
    {
        // declara variaveis
        int num, soma;
        Scanner input;

        // inicializa variaveis     
        soma = 0;
        input = new Scanner(System.in);

        // le o primeiro numero
        System.out.println("digite uma serie de numeros que acaba com -1");   
        num = input.nextInt();

        // ate entrar com -1, soma e le o proximo numero
        while (num != -1)
        {
            soma = soma + num;
            num = input.nextInt();
        }

        // printa soma
        System.out.println("soma: " + soma);

        input.close();
    }       
}

