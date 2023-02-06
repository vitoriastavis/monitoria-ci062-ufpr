public class Monitor implements Comparable<Monitor>
{      
    String nome;
    int matricula;
    String codigo;  

    public Monitor(){}
    
    public Monitor(String nome, int matricula, String codigo)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.codigo = codigo;
    }

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getMatricula()
    {
        return matricula;
    }
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public String getCodigo()
    {
        return codigo;
    }
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }    

    @Override
    public int compareTo(Monitor m)
    {
        if(this.matricula < m.matricula)
            return -1;
        else if(this.matricula > m.matricula)
            return 1;
        else
            return 0;        
    }
}
