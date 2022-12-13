package ex1;

public class Servico
{
    String formato;
    int duracao;

    void vender()
    {
        System.out.printf("Vendendo um servico %s que dura %d minutos.", this.formato, this.duracao);
    }

    void garantia()
    {
        System.out.printf("Acionando a garantia para o serviço.", this.formato, this.duracao);

    }
}
