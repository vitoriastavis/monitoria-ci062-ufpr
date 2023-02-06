import java.util.Scanner;

public class Main
{
    /* pede nome do destinatario e do remetente das cartao
    *  cria um vetor de cartao de dia dos namorados, natal 
    *  e aniversario. imprime as mensagens de cada cartao
    */
    public static void main(String args[])
    { 
        // declara variaveis         
        CartaoWeb listaCartoes[];      
        String remetente;
        String destinatario;
        Scanner input;

        // inicializa variaveis    
        listaCartoes = new CartaoWeb[3];
        input = new Scanner(System.in);

        System.out.print("qual o nome do remetente?: ");
        remetente = input.nextLine();
        
        System.out.print("qual o nome do destinatario?: ");
        destinatario = input.nextLine();

        listaCartoes[0] = new CartaoNamorados(destinatario);    
        listaCartoes[1] = new CartaoNatal(destinatario);
        listaCartoes[2] = new CartaoNiver(destinatario);
        
        String mensagem;

        System.out.println("-----------");
        for(int i = 0; i < 3; i++)
        {
            mensagem = listaCartoes[i].retornarMensagem(remetente);
            System.out.println(mensagem);
            System.out.println("-----------");
        }

        input.close();

    }
}
