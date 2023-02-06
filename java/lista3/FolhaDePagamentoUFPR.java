public class FolhaDePagamentoUFPR
{
    FuncionarioUFPR func;
    Data dataPagamento;   
    double salarioMes;

    public FuncionarioUFPR getFuncionario()
    {
        return func;
    }
    public void setFuncionario(FuncionarioUFPR func)
    {
        this.func = func;
    }

    public Data getDataPagamento()
    {
        return dataPagamento;
    }
    public void setDataPagamento(Data dataPagamento)
    {
        this.dataPagamento = dataPagamento;
    }

    public double getSalarioMes()
    {
        return salarioMes;
    }
    public void setSalarioMes(double salarioMes)
    {
        this.salarioMes = salarioMes;
    }

    void imprimir()
    {
        System.out.printf("     funcionario: %s \n", func.nome);
        System.out.printf("cargo: %s \n", func.cargo);
        System.out.printf("data de nascimento: %d/%d/%d \n", func.dataNascimento.dia,
                                                                    func.dataNascimento.mes, func.dataNascimento.ano);
        System.out.printf("matricula: %d \n", func.matricula);        
        System.out.printf("data do pagamento: %d/%d \n", dataPagamento.mes, dataPagamento.ano);
        System.out.printf("total de vencimentos: %,.2f \n", salarioMes);

        System.out.println("");
    }
}
