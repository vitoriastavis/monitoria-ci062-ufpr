public class CartaoNatal extends CartaoWeb
{
    public CartaoNatal(){}
    public CartaoNatal(String destinatario)
    {
        super(destinatario);
    }


    String retornarMensagem(String remetente)
    {
        String mensagem, centro, despedida;

        remetente = remetente + ",\n";
        centro = "Feliz Natal.\n";
        despedida = "Tambem nao comprei presente, \n";
        destinatario = destinatario + ".";

        mensagem = remetente + centro + despedida + this.destinatario;
    
        return mensagem;
    }
    
}
