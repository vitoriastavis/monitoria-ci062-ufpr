public class CartaoNamorados extends CartaoWeb
{    
    public CartaoNamorados(){}
    public CartaoNamorados(String destinatario)
    {
        super(destinatario);
    }

    String retornarMensagem(String remetente)
    {
        String mensagem, centro, despedida;

        remetente = remetente + ",\n";
        centro = "Feliz dia dos namorados.\n";
        despedida = "Espero que seja o unico cartao que voce recebeu, \n";
        destinatario = destinatario + ".";
        
        mensagem = remetente + centro + despedida + this.destinatario;
    
        return mensagem;
    }
    
}
