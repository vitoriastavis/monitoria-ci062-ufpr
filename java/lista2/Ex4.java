import java.util.Scanner;

public class Ex4
{
    // le 7 numeros e printa o maior e o menor 
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        try
        {
            // declara variaveis        
            int numeros[] = new int[7];  
            int i, menor, maior;
           
            // inicializa variaveis
            menor = maior = numeros[0];

            // le numeros e salva no array
            System.out.println("digite 7 numeros");   
            for (i = 0; i < 7; i++)                
                numeros[i] = input.nextInt();                                
    
            // itera pelo vetor e compara os valores
            for (i = 0; i < 7; i++)      
            {  
                if(numeros[i] > maior)
                    maior = numeros[i];

                if(numeros[i] < menor)
                    menor = numeros[i];
            }
                    
            System.out.printf("o maior eh %d e o menor eh %d \n", maior, menor);
        }
        finally
        {
            input.close();
        }                       
    }    
}

