import java.util.Scanner;

public class Ex2
{
    // le matriz 3x3 e printa soma das colunas
    public static void main(String args[])
    {
        // declara variaveis        
        int numeros[][] = new int[3][3];
        int vetorSomas[] = new int[3];
        int soma, i, j;
        Scanner input;

        // inicializa variaveis
        soma = 0;    
        input = new Scanner(System.in);

        // le numeros e salva no array
        System.out.println("digite uma matriz 3x3 de inteiros");     
        for (i = 0; i < 3; i++)
                for (j = 0; j < 3; j++)
                    numeros[i][j] = input.nextInt();                                
        
        // itera pela matrix e salva a soma das colunas no vetorSomas
        for (j = 0; j < 3; j++)      
        {  
            for (i = 0; i < 3; i++)
                soma += numeros[i][j];                        
            
            vetorSomas[j] = soma;
            soma = 0;
        }
       
        for (i = 0; i < 3; i++)          
            System.out.printf("%d ", vetorSomas[i]);
                               
        input.close();
    }    
}

