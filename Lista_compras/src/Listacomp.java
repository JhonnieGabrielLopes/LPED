package Lista_compras.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Listacomp {
    
    public void criarlista(ArrayList<String> compras, String produto, Scanner in){//criar lista
        System.out.println("============================");
        System.out.println("CRIANDO A LISTA DE COMPRAS");
        System.out.println("Informe os seus produtos:");
        do{
            System.out.print(" - ");
            produto=in.nextLine();
            if (!produto.equalsIgnoreCase("fim")) { 
                compras.add(produto);
            }
        }while(!produto.equalsIgnoreCase("fim"));
    }
    public void lista(ArrayList<String> compras, String produto, Iterator<String> iterator){//mostrar os itens da lista
        System.out.println("");
        System.out.println("============================");
        System.out.println("LISTA DE COMPRAS");
        iterator=compras.iterator();
        while (iterator.hasNext()) {
            produto=iterator.next();
            System.out.println("- "+produto);
        }
    }
    public void remover(ArrayList<String> compras, String produto, Iterator<String> iterator, String removeritem, Scanner in, int op){//remover item da lista
        System.out.println("============================");
            do{
                System.out.println("");
                System.out.println("Qual o item você quer remover?\n");
                removeritem=in.nextLine();
                iterator=compras.iterator();
                while (iterator.hasNext()) {
                    produto=iterator.next();
                    if (produto.equalsIgnoreCase(removeritem)) {
                        iterator.remove();
                    }
                }
                do{
                System.out.println("");
                System.out.println("Quer remover mais algum item? \n1.Sim  |  2.Não");
                op=in.nextInt();
                in.nextLine();
                    if (op!=1&&op!=2) {
                        System.out.println("Opção inválida!");
                    }
                }while(op!=1&&op!=2);
            }while(op==1);
    }
    public void alterarlista(ArrayList<String> compras, String produto, String subs, Scanner in){//altera item da lista
        System.out.println("");
        System.out.println("============================");
        System.out.println("Digite o produto a ser substituído e o produto que você deseja adicionar");
        subs=in.nextLine();
        produto=in.nextLine();
        compras.set(compras.indexOf(subs),produto);
    }
    public static void main(String[] args) {
        Listacomp metodo=new Listacomp();
        String produto=null, removeritem=null, subs=null;
        int op=0, opc;
        Scanner in = new Scanner(System.in);
        ArrayList<String> compras = new ArrayList<String>();
        Iterator<String> iterator = compras.iterator();
        //menu de opções
        do{
        System.out.println("====================================Menu de opções======================================");
        System.out.println("0.Sair do programa\n1.Criar uma lista (NECESSÁRIO CRIAR UMA LISTA PARA PROSSEGUIR COM AS OUTRAS OPÇÕES)\n2.Ver minha lista\n3.Remover um item da lista\n4.Alterar um item da lista\n");
        opc=in.nextInt();
        in.nextLine();
            switch (opc) {
                case 0:
                    break;
                case 1:
                metodo.criarlista(compras, produto, in);
                opc=5;
                    break;
                case 2:
                metodo.lista(compras, produto, iterator);
                opc=5;
                    break;
                case 3:
                metodo.remover(compras, produto, iterator, removeritem, in, op);
                opc=5;
                    break;
                case 4:
                metodo.alterarlista(compras, produto, subs, in);
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