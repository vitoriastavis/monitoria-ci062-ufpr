import java.util.Scanner;

public class Ex3
{
    public static boolean ehVogal(char c)
    {
        String vogais = "aeiou";
        int i;

        for (i = 0; i < vogais.length(); i++)
        {
            if (c == vogais.charAt(i))
                return true;
        }

        return false;

    }
    // le uma palavra, diz quantas vogais tem
    // le um caractere e substitui as vogais pelo caractere
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        try
        {           
            // declara variaveis        
            String palavra, novaPalavra;
            char caractere;
            int i, qtdVogais;
                    
            qtdVogais = 0;

            // le string
            System.out.print("digite uma palavra: ");     
            palavra = input.nextLine();                                
            
            // itera pela string e conta as vogais
            for (i = 0; i < palavra.length(); i++)      
            {  
                if(ehVogal(palavra.charAt(i)))
                    qtdVogais++;
            }
                        
            System.out.printf("tem %d vogais \n", qtdVogais);

            // le char pra substituir vogais
            System.out.printf("entre um char para substituir as vogais: ", qtdVogais);
            caractere = input.next().charAt(0);

            // substitui as vogais pelo char novo
            novaPalavra = palavra.replace('a', caractere);
            novaPalavra = novaPalavra.replace('e', caractere);
            novaPalavra = novaPalavra.replace('i', caractere);
            novaPalavra = novaPalavra.replace('o', caractere);
            novaPalavra = novaPalavra.replace('u', caractere);

            System.out.printf("a nova palavra eh %s \n",  novaPalavra);
        }
        finally
        {              
            input.close();
        }    
    }    
}

