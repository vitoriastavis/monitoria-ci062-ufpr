package PadraoFactory;

public abstract class VeiculoFactory
{
    public abstract Veiculo criarVeiculo (String dado);

    Veiculo buscar(String nomeC, String dadoV)
    {
        Veiculo v = this.criarVeiculo(dadoV);
        v.buscar(nomeC);
        return v;
    }
}
