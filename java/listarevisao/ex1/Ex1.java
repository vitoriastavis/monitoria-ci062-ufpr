package ex1;
import java.util.*;

public class Ex1
{
    public static void main(String args[])
    {  
        Servico tecnicoCelular = new Servico("Tecnico Celular", 90);
        ProdutoEletronico tv = new ProdutoEletronico(25625, "lg");
        Servico tecnicoTV = new Servico("Tecnico TV", 120);

        ArrayList<Loja> vendasLoja = new ArrayList<Loja>();        

        vendasLoja.add(tecnicoCelular);
        vendasLoja.add(tv);
        vendasLoja.add(tecnicoTV);

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
