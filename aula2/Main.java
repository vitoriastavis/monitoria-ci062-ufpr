import java.util.Scanner;

public class Main
{
    // le 10 numeros e mostra 
    public static void le10Numeros()
    {
        // declara variaveis
        int idx, numeros[];
        Scanner input = new Scanner(System.in);

        idx = 0;

       // le numero
        System.out.println("digite um numero");
        
        while (idx < 10)      
        {  
            numeros[idx] = input.nextInt();
            idx += 1;
        }
        
        idx = 0;

        while (idx < 10)
            System.out.print(numeros[idx]);
        
        input.close();
    } 

    // le um numero e retorna se ele eh par ou impar
    public static void parOuImpar()
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

    // le de numeros ate digitar -1 e retorna a soma deles
    public static void somaInputs()
    {
        // declara variaveis
        int num, soma;
        Scanner input = new Scanner(System.in);

        soma = 0;  

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

    // calcula e imprima a soma dos 10 primeiros multiplos de 3
    public static void somaMultiplos3()
    {       
        // declara variaveis
        int num, count, soma;

        count = 0;      // contador de multiplos
        soma = 0;       // soma
        num = 1;        // valor inicial

        // vai contando e se achar um multiplo, soma e incrementa o contador de multiplos
        while (count < 10)
        {
            if (num % 3 == 0)
            {
                soma = soma + num;
                count += 1;
            }
            num += 1;
        }

        // printa soma
        System.out.println("soma dos 10 primeiros multiplos de 3: " + soma);
    }
       
    // le x e aplica em f(x):
    // 0 <= x < 5, f(x) = x
    // 5 <= x <10; f(x) = 2x + 1
    // x >= 10; f(x) = x - 3
    public static void funcao()
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

    // printa nome completo, nome do time de futebol, bairro
    public static void informacoes()
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
        Scanner input = new Scanner(System.in);

        count = 0;
        imc = 0;

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
    
    public static void main (String args[])
    {
        le10Numeros();
    }

        
}

