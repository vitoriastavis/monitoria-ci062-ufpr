import java.util.Scanner;

public class Ex5
{
    // le peso e altura de pessoas ate digitar -1 e retorna quantas estao acima do peso
    public static void main(String args[])
    {
        // declara variaveis
        int count, i, j, k;              // contador de pessoas acida do peso
        double[][] pessoas;
        Scanner input = new Scanner(System.in);

        i = j = k = 0;
       
        // le peso e altura
        System.out.println("digite o peso em kg"); 
          
        while(input.nextDouble() != -1)
        {
            pessoas[i][j] = input.nextDouble();
        }

        while (peso != -1)
        {
            System.out.println("digite a altura em m"); 
            altura = input.nextDouble();

            if (altura == -1)
                break;

            imc = peso/(altura*altura);

            if (imc > 25)
            {
                count += 1;                
            }

            System.out.println("digite o peso");   
            peso = input.nextDouble();            
        }

        System.out.printf("existem %d pessoas acima do peso \n", count);
      
        input.close();
    }       
}

