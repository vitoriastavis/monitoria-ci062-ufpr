public class Endereco
{
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    // get e set da rua
    public String getRua()
    {
        return rua;
    }
    public void setRua(String rua)
    {
        this.rua = rua;
    }

    // get e set do numero
    public int getNumero()
    {
        return numero;
    }
    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    // get e set do bairro
    public String getBairro()
    {
        return bairro;
    }
    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }

    // get e set da cidade
    public String getCidade()
    {
        return cidade;
    }
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    // get e set do estado
    public String getEstado()
    {
        return estado;
    }
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
}
