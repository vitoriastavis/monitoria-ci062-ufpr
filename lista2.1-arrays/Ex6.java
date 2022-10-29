import java.util.Scanner;

public class Ex6
{
    private static final int MAX=4;

    // le peso e altura de pessoas ate digitar -1 e printa quantas estao acima do peso
    public static void main(String args[])
    {
        // declara variaveis
        int i, j, x, y;              // contador de pessoas acida do peso
        double pessoas[][], num;
        boolean achou;
        Scanner input;
        
        // inicializa variaveis
        x = y = -1;
        pessoas = new double[MAX][MAX];   
        achou = false;   
        input = new Scanner(System.in);
        
        // le peso e altura
        System.out.println("entre uma matriz de tamanho 4x4"); 
        for (i = 0; i < MAX; i++)
            for (j = 0; j < MAX; j++)
                pessoas[i][j] = input.nextDouble();
    
        // le valor buscado
        System.out.println("entre um numero para buscar na matriz"); 
        num = input.nextDouble();

        // itera pela matriz procurando o numero
        i = j = 0;
        while(achou != true & i < MAX)
        {
            while(achou != true & j < MAX)
            {
                if(pessoas[i][j] == num)        // achou o numero
                {
                    x = i;
                    y = j;                    
                    achou = true;
                } 
                j++;
            }
            i++;
            j = 0;
        }
        
        if(x == -1 & y == -1)      
            System.out.printf("elemento nao encontrado \n");
        else
            System.out.printf("linha %d, coluna %d \n", x+1, y+1);
    
        input.close();
    }       
}

