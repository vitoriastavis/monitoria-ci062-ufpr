package PadraoFactory;


public class MotoFactory extends VeiculoFactory
{
public Veiculo criarVeiculo (String dado){
return new Moto(dado);
}
}