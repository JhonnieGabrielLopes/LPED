package Atv_fila.src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Queue<Character> fila = new LinkedList<>();
    String nome, testenome,opc;
    System.out.println("\nPrograma para verificar se um nome é um palindromo ou não.\n\nInstruções: \nDigite [sair] para finalizar o programa\nDigite [Nome] para inserir um nome\n");
    do{
    opc=in.nextLine();
        testenome="";
        if (opc.equalsIgnoreCase("sair")) {
            break;
        }else if (opc.equalsIgnoreCase("nome")) {
            System.out.print("\n > nome: ");
            nome=in.nextLine();
            for(int i=1; i<=nome.length();i++){
            fila.offer(nome.charAt(nome.length()-i));
            }
            for(int i=1; i<=nome.length();i++){
            fila.offer(fila.poll());
            }
            for (Character character : fila) {
            testenome+=character;
            }
            fila.clear();
            if (testenome.equals(nome)) {
                System.out.println("\nÉ um palindromo\n");
            } else {
                System.out.println("\nNão é um palindromo\n");
            }
        }else {
        System.out.println("\nOpção inválida");}
    }while(!opc.equalsIgnoreCase("sair"));
    in.close();
    }
}
