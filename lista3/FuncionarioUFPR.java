public class FuncionarioUFPR
{
    String nome;
    String cargo;
    int matricula;
    Data dataNascimento;

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCargo()
    {
        return cargo;
    }
    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    public int getMatricula()
    {
        return matricula;
    }
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    
    public Data getDataNascimento()
    {
        return dataNascimento;
    }
    public void setDataNascimento(Data dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }
}

