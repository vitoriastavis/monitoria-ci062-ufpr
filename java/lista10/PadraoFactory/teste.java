package PadraoFactory;

public class teste
    {
    public static void main(String []args)
    {
    // Código usando o padrão Method Factory
        VeiculoFactory carroF = new CarroFactory();
        Veiculo fusca = carroF.criarVeiculo("Fusca");
        fusca.buscar("José");
        fusca.parar();

        MotoFactory motoF = new MotoFactory();
        Veiculo moto = motoF.criarVeiculo("555");
        moto.buscar("fula");
        moto.parar();
    }
}
