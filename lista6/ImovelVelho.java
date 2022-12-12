public class ImovelVelho extends Imovel
{ 
    // construtores
    public ImovelVelho (){}
    public ImovelVelho(Endereco endereco)
    {
        this.endereco = endereco;       
    }
    public ImovelVelho(double preco)
    {
        this.preco = preco;
    }
    public ImovelVelho(Endereco endereco, double preco)
    {
        this.endereco = endereco;
        this.preco = preco;
    }

    // get e set do preco    
    public double getPreco()
    {
        return preco;
    }
    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    // get e set do endereco    
    public Endereco getEndereco()
    {
        return endereco;
    }
    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }    

    // calcula o valor do imovel velho e retorna no atributo
    void calcularValorImovel()
    {
        double preco;
        double min = 80000;
        double max = 200000000;
     
        // valor aleatorio entre 80.000 e 200.000.000
        preco = Math.floor(Math.random()*(max-min+1)+min);
       
        // mais 10000 por ser velho
        preco -= 200000;

        this.preco = preco; 
    };  
}
