package ex2;

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
    
    public void vender()
    {
        System.out.printf("Vendendo o produto %s, fabricado por %s. \n", this.codigo, this.nomeFabricante);
    }

    public void garantia()
    {
        System.out.printf("\tAcionando a garantia para o produto %d. \n", this.codigo);
    }
}
    
