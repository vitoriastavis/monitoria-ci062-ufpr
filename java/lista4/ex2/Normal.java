package ex2;

public class Normal extends Ingresso
{    
    public Normal(){}
    public Normal(int valorIngresso)
    {
        super(valorIngresso);
    }   
    
    public int getValorIngresso()
    {
        return this.valorIngresso;
    }
    public void setValorIngresso(int valorIngresso)
    {
        this.valorIngresso = valorIngresso;
    }

    @Override
    public void imprimeIngresso()
    {
        System.out.print(this.valorIngresso + " ");
    }
}
