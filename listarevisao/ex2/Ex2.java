package ex2;
import java.util.*;

public class Ex2
{
    public static void main(String args[])
    {  
        Servico tecnicoCelular = new Servico("Tecnico Celular", 90);
        ProdutoEletronico tv = new Televisao(25625, "lg");

        ArrayList<Loja> vendasLoja = new ArrayList<Loja>();        

        vendasLoja.add(tecnicoCelular);
        vendasLoja.add(tv);

        Iterator<Loja> i = vendasLoja.iterator();
        while(i.hasNext())
        {
            Loja loja = i.next();
            loja.vender();
            loja.garantia();            
        } 

        /* ou
            for(Loja loja: vendasLoja)
            {
                loja.vender();
                loja.garantia();
            } 
         */
    }
}
