package AtvPilha.src;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Atv02{

    public void acessalink(Stack<String> pilha, ArrayList<String> historico, String link, Scanner in){
        System.out.print("Informe a URL do site que deseja acessar: \n > URL: ");
        link=in.nextLine();
        pilha.push(link);
        historico.add(link);
    }
    public void retornalink(Stack<String> pilha, String link, ArrayList<String> historico){
        if (pilha.isEmpty()) {
            System.out.println("Não há site anterior");
        }else{
            try{
            pilha.pop();
            historico.add(pilha.peek());
            }catch (Exception EmptyStackException) {}
        }
    }
    public void verhistorico(ArrayList<String> historico){
        if (historico.isEmpty()) {
            System.out.println("Histórico vazio");
        }else{
            System.out.println("HISTÓRICO\n");
            for(int i=historico.size()-1; i>=0;i--){
                System.out.println(" > "+historico.get(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atv02 metodo = new Atv02();
        Stack<String> pilha = new Stack<>();
        ArrayList<String> historico = new ArrayList<>();
        String link=null;
        int op;
        boolean control=true;

        System.out.println("\n\n > Programa de gerenciamento de páginas da WEB acessada pelo usuário < \n");
        do{
            if (!pilha.isEmpty()) {
                System.out.println("-----------------------------");
                System.out.println(" > Você está em: "+pilha.peek());
            }
            System.out.println("-----------------------------");
            System.out.println("           Opções            ");
            System.out.println("-----------------------------");
            System.out.print(" > [1] Acessar um link\n > [2] Retornar Link\n > [3] Acessar histórico\n > [4] Sair\n > ");
            op=in.nextInt();
            in.nextLine();
            System.out.println("-----------------------------");
            switch (op) {
                case 1:
                    metodo.acessalink(pilha, historico, link, in);
                    break;
                case 2:
                    metodo.retornalink(pilha, link, historico);
                    break;
                case 3:
                    metodo.verhistorico(historico);
                    break;
                case 4:
                    control=false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
        }}while(control);
    in.close();
    }
}
