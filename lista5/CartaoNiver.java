public class CartaoNiver extends CartaoWeb
{

    public CartaoNiver(){}
    public CartaoNiver(String destinatario)
    {
        super(destinatario);
    }

    String retornarMensagem(String remetente)
    {
        String mensagem, centro, despedida;

        remetente = remetente + ",\n";
        centro = "Feliz aniversario.\n";
        despedida = "Nao comprei presente,\n";
        destinatario = destinatario + ".";

        mensagem = remetente + centro + despedida + this.destinatario;
    
        return mensagem;
    }
    
}
