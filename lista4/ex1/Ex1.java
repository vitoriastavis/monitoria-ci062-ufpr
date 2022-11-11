package ex1;
import java.util.Scanner;

public class Ex1
{   
    public static void main(String args[])
    {
        // declara variaveis     
        Fluorescente lampadaFluo;
        Led lampadaLed;
        Scanner input;
        int escolha;

        // inicializa variaveis 
        lampadaFluo = new Fluorescente();
        lampadaLed = new Led();
        input = new Scanner(System.in);

        // printa estados
        System.out.printf("estado lampada fluorescente: %s \n", lampadaFluo.getEstado()); 
        System.out.printf("estado lampada LED: %s \n", lampadaLed.getEstado()); 

        // le lampada escolhida
        System.out.println("escolha 1 para lampada fluorescente e 2 para lampada led"); 
        escolha = input.nextInt();
        
        // garante que o usuario escolha uma lampada
        while((escolha != 1) & (escolha != 2))
        {
            System.out.println("escolha 1 para lampada fluorescente e 2 para lampada led"); 
            escolha = input.nextInt();
        }

        // altera lampada escolhida
        if(escolha == 1)
            lampadaFluo.ligaDesligaLampada();
        else
            lampadaLed.ligaDesligaLampada();
      
        // printa estados
        System.out.printf("estado lampada fluorescente: %s \n", lampadaFluo.getEstado()); 
        System.out.printf("estado lampada LED: %s \n", lampadaLed.getEstado()); 
    
        input.close();
    }

}
