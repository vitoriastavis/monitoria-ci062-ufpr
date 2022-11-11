package ex2;

public class Vip extends Ingresso
{
    protected int valorAdicional;

    public Vip()
    {
        this.valorAdicional = 5;
    }
    public Vip(int valorAdicional)
    {
        this.valorAdicional = valorAdicional;
    }
    public Vip(int valorIngresso, int valorAdicional)
    {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

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
