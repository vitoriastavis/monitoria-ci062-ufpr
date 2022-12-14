package ex2;

public class Celular extends ProdutoEletronico
{
    public Celular(int codigo, String fabricante)
    {
        super(codigo, fabricante);
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
