import java.util.Scanner;

public class Ex6
{
    // printa nome completo, nome do time de futebol, bairro
    public static void main(String argś[])
    {
        System.out.println("vitoria stavis de araujo");   
        System.out.println("nenhum");
        System.out.println("agua verde");   
      
    }

    // le peso e altura de pessoas ate digitar -1 e retorna quantas estao acima do peso
    public static void contaAcimaDoPeso()
    {
        // declara variaveis
        int count;
        double peso, altura, imc;
        Scanner input;

        // inicializa variaveis  
        count = 0;
        imc = 0;
        input = new Scanner(System.in);

        // le peso e altura
        System.out.println("digite o peso em kg");   
        peso = input.nextDouble(); 

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
                System.out.println("essa pessoa esta acima do peso"); 
            }

            System.out.println("digite o peso");   
            peso = input.nextDouble();            
        }

        System.out.printf("existem %d pessoas acima do peso \n", count);
      
        input.close();
    }      
}

