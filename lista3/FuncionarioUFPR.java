public class FuncionarioUFPR
{
    String nome;
    String cargo;
    int matricula;
    Data dataNascimento;

    // construtores 
    public FuncionarioUFPR(){}
    public FuncionarioUFPR(String nome, String cargo, int matricula, Data dataNascimento)
    {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    // get e set nome
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    // get e set cargo
    public String getCargo()
    {
        return cargo;
    }
    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    // get e set matricula
    public int getMatricula()
    {
        return matricula;
    }
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    
    // get e set data de nascimento
    public Data getDataNascimento()
    {
        return dataNascimento;
    }
    public void setDataNascimento(Data dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }
}

