package ex2;

public class Camarote extends Vip
{
    protected int valorCamarote;

    // construtores
    public Camarote()                   // default = 8
    {
        this.valorCamarote = 8;
    }
    public Camarote(int valorCamarote)  // outros valores de adicional camarote
    {
        this.valorCamarote = valorCamarote;
    }
    public Camarote(int valorIngresso, int valorAdicional, int valorCamarote)
    {
        super(valorIngresso, valorAdicional);
        this.valorCamarote = valorCamarote;
    }

    // get e set do valorCamarote
    public int getValorCamarote()
    {
        return valorCamarote;
    }
    public void setValorCamarote(int valorCamarote)
    {
        this.valorCamarote = valorCamarote;
    }

    @Override
    public void imprimeIngresso()
    {
        int total = this.valorIngresso + this.valorAdicional + this.valorCamarote;
        System.out.print(total + " ");
    }
}
