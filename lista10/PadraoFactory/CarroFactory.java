package PadraoFactory;

public class CarroFactory extends VeiculoFactory
{
    public Veiculo criarVeiculo (String dado){
    return new Carro(dado);
}
}