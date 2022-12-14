package ex3;

public abstract class ProdutoEletronico implements Loja
{  
    protected int codigo;
    protected String nomeFabricante;

    public ProdutoEletronico(){};
    public ProdutoEletronico(int codigo, String nomeFabricante)
    {
        this.codigo = codigo;
        this.nomeFabricante = nomeFabricante;
    }

    public abstract void vender();   
    public abstract void garantia();

    public void ligar(String nome)
    {
        System.out.printf("\t\tLigando %s. \n", nome);
    }

    public void desligar(String nome)
    {
        System.out.printf("\t\tDesligando %s. \n", nome);
    }
}
    
