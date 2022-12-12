package ex2;

public class Vip extends Ingresso
{
    protected int valorAdicional;

    // construtores
    public Vip()
    {
        this.valorAdicional = 5;        // default = 5
    }
    public Vip(int valorAdicional)      // outro valor de adicional
    {
        this.valorAdicional = valorAdicional;   
    }
    public Vip(int valorIngresso, int valorAdicional)       // outro valor de adicional e de ingresso normal
    {
        //super(valorIngresso);
        //this.valorAdicional = valorAdicional;
        this(valorAdicional);
    }

    // get e set do valorAdicional
    public int getValorIngresso()
    {
        return valorIngresso;
    }
    public void setValorIngresso(int valorIngresso)
    {
        this.valorIngresso = valorIngresso;
    }

    @Override
    public void imprimeIngresso()
    {
        int total = this.valorIngresso + this.valorAdicional;
        System.out.print(total + " ");
    }
}
