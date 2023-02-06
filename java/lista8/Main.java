import java.util.Scanner;

public class Main
{
/* cria um array de 200 do tipo Imovel, 
*  insere instâncias de ImovelVelho e ImovelNovo alternadamente
*  Printa o valor de cada imovel
*/
    public static void main(String args[])
    {        
        // declara variaveis         
        Imovel listaImoveis[];
        Scanner input;

        // inicializa variaveis       
        listaImoveis = new Imovel[200];
        input = new Scanner(System.in);

        // inicializa vetor de imoveis
        for(int i = 0; i < 200; i++)
        {
            if(i % 2 == 0)
                listaImoveis[i] = new ImovelVelho();
            else
                listaImoveis[i] = new ImovelNovo();                
        }

        System.out.println("Mostrando preço dos 200 imoveis disponiveis:");

        // calcula o preco dos imoveis e printa
        for(int i = 0; i < 200; i++)
        {
            listaImoveis[i].calcularValorImovel();

            if(i % 2 == 0)
            {                
                System.out.printf("Antigo \t R$ %,.2f \n", listaImoveis[i].preco);                
            }
            else
                System.out.printf("Novo \t R$ %,.2f \n", listaImoveis[i].preco);             
        }

        System.out.println("Sobrecarga de construtor: polimorfismo ad hoc");        
        System.out.println("Usar o metodo calcularValorImovel: polimorfismo universal de inclusao");        




        input.close();
    }    
}
