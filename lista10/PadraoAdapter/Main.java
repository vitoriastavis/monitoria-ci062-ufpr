package PadraoAdapter;

public class Main {

    public static void main(String []args)
    {
        ProcessarPagamento credito = new MeuPagamentoCredito();
        credito.debitar(240);
    }
    
}
