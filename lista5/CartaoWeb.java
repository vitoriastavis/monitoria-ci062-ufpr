public abstract class CartaoWeb
{
    protected String destinatario;

    public CartaoWeb(){}
    public CartaoWeb(String destinatario) 
    {
        this.destinatario = destinatario;
    }

    abstract String retornarMensagem(String remetente);
}
