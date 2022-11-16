import java.util.Scanner;

public class Ex1
{     
    static final int nProfs=1;
    
    // cria e retorna funcionario com nome, cargo, matricula e data de nascimento 
    static FuncionarioUFPR carregaFuncionario(Scanner input)
    {        
        // declara e inicializa novo funcionario
        FuncionarioUFPR func = new FuncionarioUFPR();

        System.out.println("    digite dados do funcionario");

        // le nome
        System.out.print("digite o nome: ");
        func.nome = input.nextLine();

        // le cargo
        System.out.print("digite o cargo: ");
        func.cargo = input.nextLine();

        // le matricula
        System.out.print("digite a matricula (numero inteiro): ");
        func.matricula = input.nextInt();
        input.nextLine();           // a input.nextInt() nao conta o enter dado pelo usuario depois do numero

        // le data de nascimento em string
        System.out.print("digite a data de nascimento no formato dd/mm/aaaa: ");           
        Data dataNasc = new Data();   
        dataNasc.data = input.nextLine();       
        dataNasc.parserCompleto();              // separa data em dia mes e ano
        func.dataNascimento = dataNasc;         // atribui data ao funcionario

        System.out.println("");

        return func;
    }
    /* cria e retorna folha de pagamento com funcionario (nome, cargo, matricula
        e data de nascimento), data do pagamento e salario do mes               */                                            
    static FolhaDePagamentoUFPR carregaFolhaPgto(Scanner input)
    {       
        // declara e inicializa folha de pagamento
        FolhaDePagamentoUFPR folhaPgto = new FolhaDePagamentoUFPR();
       
        // carrega funcionario
        folhaPgto.func = carregaFuncionario(input);     

        // le data de pagamento em string
        System.out.print("digite o mes e ano de pagamento no formado mm/aaaa: ");
        Data dataPgto = new Data();
        dataPgto.data = input.nextLine();
        dataPgto.parserIncompleto();               // separa data em mes e ano
        folhaPgto.dataPagamento = dataPgto;        // atribui data a folha

        // le salario do mes
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
            // declara e inicializa vetor de folhas
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

