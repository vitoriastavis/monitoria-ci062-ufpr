import java.util.Scanner;

public class Ex1
{
    // le 10 numeros e retorna:
    // numeros pares
    // soma dos numeros pares
    // numeros numeros
    // quantidade de numeros numeros
    public static void main(String args[])
    {
        // declara variaveis
        int numeros[], qtdImpares, somaPares;
        Scanner input;

        // inicializa variaveis
        numeros = new int[10];
        qtdImpares = somaPares = 0;
        input = new Scanner(System.in);

        // le numeros e salva no array
        System.out.println("digite 10 numeros");       

        for (int i = 0; i < 10; i++)      
        {  
            numeros[i] = input.nextInt();      
                               
        }

        for (int i = 0; i < 10; i++)      
        {  
            if (numeros[i] % 2 == 0)
            {
                System.out.printf("%d ", numeros[i]);
                somaPares += numeros[i];
            }  
            
        }

        System.out.printf("\na soma dos numeros pares eh %d \n", somaPares);

        for (int i = 0; i < 10; i++)      
        {  
            if (numeros[i] % 2 != 0)
            {
                System.out.printf("%d ", numeros[i]);
                qtdImpares++;               
            }              
        }
        
        System.out.printf("\nforam escritos %d numeros impares \n", qtdImpares);
                      
        input.close();
    }    
    

}

