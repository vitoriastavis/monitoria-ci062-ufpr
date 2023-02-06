public class Ex4
{
    // calcula e printa a soma dos 10 primeiros multiplos de 3
    public static void main(String args[])
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
}

