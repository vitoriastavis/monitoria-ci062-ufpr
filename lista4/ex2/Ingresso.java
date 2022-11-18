package ex2;
/* pode ser classe abstrata
 * mas ainda nao foi dada essa parte
 */
public class Ingresso
{
    protected int valorIngresso;

    // construtores
    public Ingresso()                       // default = 20
    {
        this.valorIngresso = 20;
    }
    public Ingresso(int valorIngresso)      // outro valor de ingresso
    {
        this.valorIngresso = valorIngresso;
    }

    // get e set do valorIngresso
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
