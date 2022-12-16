public class ImovelNovo extends Imovel
{ 
    // construtores
    public ImovelNovo(){}
    public ImovelNovo(Endereco endereco)
    {
        this.endereco = endereco;       
    }
    public ImovelNovo(double preco)
    {
        this.preco = preco;
    }
    public ImovelNovo(Endereco endereco, double preco)
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

    // calcula o valor do imovel novo e retorna no atributo
    void calcularValorImovel()
    {     
        double preco;
        double min = 80000;
        double max = 200000000;
     
        // valor aleatorio entre 80.000 e 200.000.000
        preco = Math.floor(Math.random()*(max-min+1)+min);
       
        // mais 20000 por ser novo
        preco += 20000;

        this.preco = preco; 
    };  
}
