package ex3;

public class Servico implements Loja
{
    String nome;

    public Servico(String nome, int duracao)
    {
        this.nome = nome;
        this.duracao = duracao;
    }

    int duracao;

    public void vender()
    {
        System.out.printf("Vendendo o servico %s que dura %d minutos. \n", this.nome, this.duracao);
    }

    public void garantia()
    {
        System.out.printf("\tAcionando a garantia para o serviço %s. \n", this.nome);
    }
}
