package Lista_alunos.src;

//criar uma aplicação para armazenar o nome do aluno e sua respectiva nota

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Lista_alunos {

    public void inserealuno(ArrayList<String> aluno, Scanner in, String alunos, ArrayList<Float> nota, float notas){//adiciona alunos
        do{
        System.out.print("\nInforme o nome do aluno: ");
        alunos=in.nextLine();
            if(!alunos.equalsIgnoreCase("sair")){
                aluno.add(alunos);
                System.out.print("Insira a nota deste aluno: ");
                notas=in.nextInt();
                in.nextLine();
                nota.add(notas);
            }
        }while(!alunos.equalsIgnoreCase("sair"));
    }
    public void removealuno(ArrayList<String> aluno, ArrayList<Float> nota, Scanner in, String alunos, float notas, Iterator<String> iteraluno, Iterator<Float> iternota, String nome){//remove aluno
        System.out.println("Digite o nome do aluno que deseja remover da lista: ");
        alunos=in.nextLine();
        iteraluno=aluno.iterator();
        iternota=nota.iterator();
        while (iteraluno.hasNext()) {
            nome=iteraluno.next();
            notas=iternota.next();
            if (nome.equalsIgnoreCase(alunos)) {
                iteraluno.remove();
                iternota.remove();
            }
        }
    }
    public void alteraaluno(ArrayList<String> aluno, ArrayList<Float> nota, Scanner in, String alunos, float notas, Iterator<String> iteraluno, Iterator<Float> iternota, String nome, float verifnota, String verifnome){
        System.out.println("Digite o nome do aluno no qual será feita a alteração: ");
        alunos=in.nextLine();
        System.out.println("Digite o nome e a nota  do aluno para alteração: ");
        nome=in.nextLine();
        notas=in.nextInt();
        iteraluno=aluno.iterator();
        iternota=nota.iterator();
        while (iteraluno.hasNext()) {
            verifnome=iteraluno.next();
            verifnota=iternota.next();
            if (verifnome.equalsIgnoreCase(alunos)) {
                nota.set(nota.indexOf(verifnota), notas);
                aluno.set(aluno.indexOf(alunos), nome);
            }
        }
    }
    public void listaralunos(ArrayList<String> aluno, ArrayList<Float> nota, Iterator<String> iteraluno, Iterator<Float> iternota, float verifnota, String verifnome){
        iteraluno=aluno.iterator();
        iternota=nota.iterator();
        while (iteraluno.hasNext()) {
            verifnome=iteraluno.next();
            verifnota=iternota.next();
            System.out.println("-"+verifnome+" | nota: "+verifnota);
        }
    }
    public void calcmedia(ArrayList<Float> nota, Iterator<Float> iternota,float verifnota, int cont, float notas){
        iternota=nota.iterator();
        while (iternota.hasNext()) {
            verifnota=iternota.next();
            notas+=verifnota;
        }
        notas=notas/cont;
        System.out.println("A media das notas de todos os alunos juntos é: "+notas);
    }
    public static void main(String[] args) {
        Lista_alunos metodo=new Lista_alunos();
        ArrayList<String> aluno=new ArrayList<>();
        ArrayList<Float> nota=new ArrayList<>();
        Iterator<String> iteraluno = aluno.iterator();
        Iterator<Float> iternota = nota.iterator();

        Scanner in=new Scanner(System.in);
        String alunos=null, nome=null, verifnome=null;
        float notas=0, verifnota=0;
        int cont, opc;
        System.out.println("\n\nSistema de gereciamento de alunos e notas\n");
        System.out.println("Comece Informando o nome e a notas dos alunos, respectivamente. E para finalizar a entrada de dados digite 'sair'");
        metodo.inserealuno(aluno, in, alunos, nota, notas);
        System.out.println("\n");
        // menu de ações
        do{
            System.out.println("\n====================================Menu de opções======================================");
            System.out.println("0.Sair do programa\n1.Ver minha lista de alunos\n2.Remover um item da lista\n3.Alterar um item da lista\n4.Calcular a media das notas de todos os alunos\n");
            opc=in.nextInt();
            in.nextLine();
            System.out.println("");
            System.out.println("==================================================\n");
                switch (opc) {
                    case 0:
                        break;
                    case 1:
                    metodo.listaralunos(aluno, nota, iteraluno, iternota, verifnota, verifnome);;
                    opc=5;
                        break;
                    case 2:
                    metodo.removealuno(aluno, nota, in, alunos, notas, iteraluno, iternota, verifnome);;
                    opc=5;
                        break;
                    case 3:
                    metodo.alteraaluno(aluno, nota, in, alunos, notas, iteraluno, iternota, nome, verifnota, verifnome);;
                    opc=5;
                        break;
                    case 4:
                    cont=nota.size();
                    metodo.calcmedia(nota, iternota, verifnota, cont, notas);
                    opc=5;
                        break;
                    default:
                    System.out.println("Opção inválida!");
                        break;
                }
            }while(opc<0||opc>4);
            
        in.close();
    }
}
