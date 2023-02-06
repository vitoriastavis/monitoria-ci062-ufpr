import java.util.Scanner;

public class Ex7
{
    // imprime a frase invertida e substituida
    public static String substituieInverte(String frase)
    {      
        frase = frase.replace("A", "*");
        frase = frase.replace("a", "*");

        for(int i = frase.length() - 1; i >= 0; i--)
        {
            System.out.print(frase.charAt(i));
        }
        System.out.println(" ");

        return frase;
    }


    // le duas frases e printa as duas invertidas e substituindo A por * 
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        try
        {
            // declara variaveis        
            String frase1, frase2;        
       
            // le primeira frase           
            System.out.print("digite uma frase: ");             
            frase1 = input.nextLine();  

            // le segunda frase           
            System.out.print("digite mais uma frase: ");             
            frase2 = input.nextLine();  

            System.out.println(" ");
           
            // substitui 'A' e 'a' por '*' e imprime invertida
            substituieInverte(frase1);      
            substituieInverte(frase2);
        }
        finally
        {
            input.close();
        }                      
    }    
}

