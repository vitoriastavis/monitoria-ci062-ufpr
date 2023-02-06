package ex2;

/* neste exercicio eu assumi que os valores dos ingressos sao
 * ingresso normal = 20
 * adicional vip = 5
 * adicional camarote = 8
 * 
 * mas existem os construtores para colocar outros valores,
 * eh so inicializar com
 * ingressosNormais[i] = new Normal(novoValor);
 * ou
 * ingressosVip[i] = new Vip(novoValor1, novoValor2);
 * 
 * daria pra fazer pedindo o valor pro usuario no inicio
 */

public class Ex2
{ 
    /* cria vetores de 25 ingressos normais, 25 vips 
       e 25 camarote e imprime seus valores                     */
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
