package ex3;
import java.util.*;

public class Ex3
{
    public static void main(String args[])
    {  
        Servico tecnicoCelular = new Servico("Tecnico Celular", 90);
        Televisao tv = new Televisao(25625, "lg");
        Celular nokia = new Celular(1697, "nokia");

        ArrayList<Loja> vendasLoja = new ArrayList<Loja>();        

        vendasLoja.add(tecnicoCelular);
        vendasLoja.add(tv);
        vendasLoja.add(nokia);

        Iterator<Loja> i = vendasLoja.iterator();
        while(i.hasNext())
        {
            Loja loja = i.next();
            loja.vender();
            loja.garantia();    
            
            if(loja instanceof Televisao)
            {
                Televisao t = (Televisao) loja;
                t.ligar("Televisao");
                t.desligar("Televisao");
            }
            else if(loja instanceof Celular)
            {
                Celular c = (Celular) loja;
                c.ligar("Celular");
                c.desligar("Celular");
            }
        } 

        /* ou para iterar:
            for(Loja loja: vendasLoja)
            {
                loja.vender();
                loja.garantia();
            } 
         */
    }
}
