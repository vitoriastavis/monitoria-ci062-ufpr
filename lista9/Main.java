import java.util.Scanner;
import java.util.*;

public class Main
{
    /* imprime informacoes do treeset de monitores ordenado por matricula
    */
    public static void imprimeMonitores(TreeSet<Monitor> monitores)
    {     
        System.out.println("-----------------------------");
        System.out.println("\tinformacoes dos monitores:");

        Iterator<Monitor> i = monitores.iterator();
        while(i.hasNext())
        {
            Monitor m = i.next();
            System.out.printf("nome do monitor: %s, GRR%d, disciplina: %s \n", m.getNome(), m.getMatricula(), m.getCodigo());
        }
    }

    /* imprime dados dos professores da linked list
     */
    public static void imprimeProfessores(LinkedList<Professor> profs)
    {
        System.out.println("-----------------------------");
        System.out.println("\tlista de professores:");

        Iterator<Professor> i;

        i = profs.iterator();
        while(i.hasNext())
        {
            Professor p = i.next();
            System.out.printf("nome: %s, matricula: %d \n", p.getNome(), p.getMatricula());
        }
    }

    /* busca um professor na linkedlist e se encontrar, remove
    */
    public static void buscaProfessor(LinkedList<Professor> profs)
    {
        Scanner input;     
        int matricula;

        input = new Scanner(System.in);       

        System.out.print("escolha uma matricula de professor para buscar e remover: ");
        matricula = input.nextInt();

        int j = 0;
        while(j < profs.size())
        {
            Professor p = profs.get(j);
            if(p.matricula == matricula)
            {
                System.out.printf("\tprofessor %s \n", p.getNome());
                profs.remove(j);

                break;
            }
            else if(p.matricula != matricula & j == profs.size() - 1)
                System.out.println("\tprofessor nao encontrado");

            j++;
        }
        input.close();
    }

    public static void main(String args[])
    {   
        TreeSet<Monitor> monitores = new TreeSet<Monitor>();
        Monitor m1 = new Monitor("fulano", 20195214, "CI1062");
        Monitor m2 = new Monitor("ciclano", 20215420, "CI1055");
        Monitor m3 = new Monitor("beltrano", 20200052, "CI1055");
     
        monitores.add(m1);
        monitores.add(m2);
        monitores.add(m3);

        LinkedList<Professor> profs = new LinkedList<Professor>();
        Professor p1 = new Professor("joao", 100);
        Professor p2 = new Professor("maria", 200);
        Professor p3 = new Professor("jose", 300);
        Professor p4 = new Professor("ana", 400);
        Professor p5 = new Professor("helena", 500);
  
        profs.add(p1);
        profs.add(p2);
        profs.add(p3);
        profs.add(p4);
        profs.add(p5);
        
        imprimeMonitores(monitores);

        imprimeProfessores(profs);
        buscaProfessor(profs);
        imprimeProfessores(profs);
    }
}