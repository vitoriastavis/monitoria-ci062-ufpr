package ex2;
//import java.util.Scanner;

public class Ex2
{ 
    /* cria um ingresso normal, um vip e um camarote
       e imprimi seus valores                       */
    public static void main(String args[])
    {
        // declara variaveis   
        Normal ingressosNormais[];
        Vip ingressosVip[];
        Camarote ingressosCamarote[];     

        // inicializa variaveis     
        ingressosNormais = new Normal[25];
        ingressosVip = new Vip[25];
        ingressosCamarote = new Camarote[25];        
        for(int i = 0; i < 25; i++)
        {
            ingressosNormais[i] = new Normal();
            ingressosVip[i] = new Vip();
            ingressosCamarote[i] = new Camarote();            
        }
        
        // chama funcoes de imprimir ingresso
        System.out.printf("Valor ingressos normais: ");
        for(int i = 0; i < 25; i++)
        {
            ingressosNormais[i].imprimeIngresso();         
        }
        System.out.printf("\nValor ingressos VIP: ");
        for(int i = 0; i < 25; i++)
        {            
            ingressosVip[i].imprimeIngresso();            
        }
        System.out.printf("\nValor ingressos camarote: ");
        for(int i = 0; i < 25; i++)
        {            
            ingressosCamarote[i].imprimeIngresso();
        }
        System.out.println();
    }   
}
