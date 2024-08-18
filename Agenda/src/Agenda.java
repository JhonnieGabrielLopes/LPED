import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Agenda {
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<String> compromisso = new ArrayList<>();
    private static ArrayList<String> descricao = new ArrayList<>();
    private static ArrayList<String> data = new ArrayList<>();

    public void addcompromisso(int dia, int mes, int ano, int opc, String desc, String nome, String pegadata){
        int control;
        do {
            System.out.print("\nInforme um nome para o seu compromisso: \n> ");
            compromisso.add (nome=in.nextLine());
            do{
                control=0;
                System.out.println("----------------------------------------");
                System.out.println("Data\n");
                System.out.print("Informe o dia: \n> ");
                dia=in.nextInt();
                System.out.print("Informe o mês: \n> ");
                mes=in.nextInt();
                System.out.print("Informe o ano: \n> ");
                ano=in.nextInt();
                System.out.println("----------------------------------------");
                switch (mes) {
                    case 1:
                        if (dia<1||dia>31) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                        }
                        break;
                    case 2:
                        if (dia<1||dia>28) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                    }
                        break;
                    case 3:
                        if (dia<1||dia>31) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                    }
                        break;
                    case 4:
                        if (dia<1||dia>30) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                    }
                        break;
                    case 5:
                        if (dia<1||dia>31) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                    }
                        break;
                    case 6:
                        if (dia<1||dia>30) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                    }
                        break;
                    case 7:
                        if (dia<1||dia>31) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                    }
                        break;
                    case 8:
                        if (dia<1||dia>31) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                    }
                        break;
                    case 9:
                        if (dia<1||dia>30) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                    }
                        break;
                    case 10:
                        if (dia<1||dia>31) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                    }
                        break;
                    case 11:
                        if (dia<1||dia>30) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                    }
                        break;
                    case 12:
                        if (dia<1||dia>31) {
                            System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                            control=1;
                    }
                        break;
                    default:
                    System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                    control=1;
                        break;
                }
                if (ano<2024) {
                    System.out.println("\nDATA INVÁLIDA!\nTENTE NOVAMENTE");
                    control=1;
                }
            }while(control==1);
            data.add (pegadata=(dia+"/"+mes+"/"+ano));
            in.nextLine();
            System.out.print("Dê uma descrição a este compromisso \n> ");
            descricao.add (desc=in.nextLine());
            do{
                System.out.println("\nAdicionar mais algum compromisso? [1]SIM | [2]NÃO");
                opc=in.nextInt();
                in.nextLine();
                if (opc!=1&&opc!=2){
                    System.out.println("\nOPÇÃO INVÁLIDA!");
                }
            }while(opc!=1&&opc!=2);
        }while(opc==1);
    }
    public void vercompromisso(String desc, String nome, String pegadata){
        Iterator<String> itercomp = compromisso.iterator();
        Iterator<String> iterdata = data.iterator();
        Iterator<String> iterdesc = descricao.iterator();
        while (itercomp.hasNext()) {
            nome=itercomp.next();
            pegadata=iterdata.next();
            desc=iterdesc.next();
            System.out.println(" > Compromisso: "+nome+"\n > Data:"+pegadata+"\n > Descrição: "+desc);
        }
    }
    public static void main(String[] args) {
        Agenda metodo = new Agenda();
        int dia=0, mes=0, ano=0, opc;
        String desc=null, nome=null, pegadata=null;        
        //menu de ações
        do{
            System.out.println("============OPÇÕES============");
            System.out.print(" [1]ADICIONAR COMPROMISSO\n [2]VER COMPROMISSOS\n [3]REMOVER COMPROMISSO\n [4]PESQUISAR COMPROMISSO\n [5]SAIR DO PROGRAMA\n > ");
            opc=in.nextInt();
            in.nextLine();
            System.out.println("==============================");
            switch (opc) {
                case 1:
                    metodo.addcompromisso(dia, mes, ano, opc, desc, nome, pegadata);
                    opc=1;
                    break;
                case 2:
                    metodo.vercompromisso(desc, nome, pegadata);
                    opc=1;
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }while (opc!=5);
        in.close();
    }
}