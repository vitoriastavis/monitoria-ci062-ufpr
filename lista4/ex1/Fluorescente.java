package ex1;
public class Fluorescente extends Lampada
{    
    protected int comprimento;  // comprimento da lampada em centimetros

    // construtores
    public Fluorescente(){}      
    public Fluorescente(String estado, int comprimento)
    {
        super(estado);
        this.comprimento = comprimento;
    }

    // getters e setters
    public int getComprimento()
    {
        return comprimento;
    }
    public void setComprimento(int comprimento)
    {
        this.comprimento = comprimento;
    }
}
