package ex1;
public class Fluorescente extends Lampada
{    
    protected int comprimento;  // comprimento da lampada em centimetros

    // construtores
    public Fluorescente(){}   

    public Fluorescente(int comprimento)
    {
        super();       
        this.comprimento = comprimento;
    }

    // gette    public Led(){}rs e setters
    public int getComprimento()
    {
        return comprimento;
    }
    public void setComprimento(int comprimento)
    {
        this.comprimento = comprimento;
    }
}
