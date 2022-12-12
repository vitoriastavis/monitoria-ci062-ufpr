package ex1;
/* pode ser classe abstrata
 * mas ainda nao foi dada essa parte
 */
public class Lampada
{
    protected String estado;

    // construtores   
    public Lampada()
    {
        this.estado = "desligado";
    }
   
    // getters e setters
    public String getEstado()
    {
        return this.estado;
    }
    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    // se a lampada esta desligada, liga. se ligada, desliga
    public void ligaDesligaLampada()
    {
        if(this.estado == "ligado")
            this.estado = "desligado";
        else if(this.estado == "desligado")
            this.estado = "ligado";
    }

}
