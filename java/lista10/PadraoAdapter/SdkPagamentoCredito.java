package PadraoAdapter;
public class SdkPagamentoCredito
{
    public void autorizar(int valor){
        System.out.printf("autorizou %d \n", valor);
    }
    public void capturar(int valor){
        System.out.printf("capturou %d \n", valor);
    }
    public void creditar(int valor){
        System.out.printf("creditou %d \n", valor);
    }
}