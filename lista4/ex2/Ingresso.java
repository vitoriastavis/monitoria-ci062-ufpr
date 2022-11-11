package ex2;

public class Ingresso
{
    protected int valorIngresso;

    public Ingresso()
    {
        this.valorIngresso = 20;
    }
    public Ingresso(int valorIngresso)
    {
        this.valorIngresso = valorIngresso;
    }

    public int getValorIngresso()
    {
        return valorIngresso;
    }
    public void setValorIngresso(int valorIngresso)
    {
        this.valorIngresso = valorIngresso;
    }

    public void imprimeIngresso()
    {
        System.out.print(this.valorIngresso + " ");
    }
}
