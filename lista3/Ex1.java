import java.util.Scanner;

public class Ex1
{     
    static final int nProfs=1;

    static FuncionarioUFPR carregaFuncionario(Scanner input)
    {        
        FuncionarioUFPR func = new FuncionarioUFPR();

        System.out.println("    digite dados do funcionario");

        System.out.print("digite o nome: ");
        func.nome = input.nextLine();

        System.out.print("digite o cargo: ");
        func.cargo = input.nextLine();

        System.out.print("digite a matricula: ");
        func.matricula = input.nextInt();

        System.out.print("digite a data de nascimento no formato dd/mm/aaaa: ");           
        Data dataNasc = new Data();   
        dataNasc.data = input.nextLine();       
        dataNasc.parserCompleto();
        func.dataNascimento = dataNasc;

        System.out.println("");

        return func;
    }

    static FolhaDePagamentoUFPR carregaFolhaPgto(Scanner input)
    {       
        FolhaDePagamentoUFPR folhaPgto = new FolhaDePagamentoUFPR();
       
        folhaPgto.func = carregaFuncionario(input);     

        System.out.print("digite o mes e ano de pagamento no formado mm/aaaa: ");
        Data dataPgto = new Data();
        dataPgto.data = input.nextLine();
        dataPgto.parserIncompleto();
        folhaPgto.dataPagamento = dataPgto;

        System.out.print("digite salario do mes: ");
        folhaPgto.salarioMes = input.nextDouble();

        System.out.println("");

        return folhaPgto;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        try
        {
            FolhaDePagamentoUFPR folhas[];

            folhas = new FolhaDePagamentoUFPR[3];

            // carrega folhas de pagamento
            for (int i = 0; i < nProfs; i++)
            {
                folhas[i] = carregaFolhaPgto(input);
            }

            // imprime folhas de pagamento
            for (int i = 0; i < nProfs; i++)
            {
                folhas[i].imprimir();
            }
        }
        finally
        {
            input.close();
        }                           
       
    }    
}

