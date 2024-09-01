package Atv_fila.src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        String entrada;
        boolean control=true;
        
        System.out.println("\nInsira números inteiros e o programa irá colocá-los em ordem crescente. \nDigite [fim] para encerrar a entrada de dados! ");
        do{
            do{
                System.out.print(" > ");
                entrada=in.nextLine();
                if (entrada.equalsIgnoreCase("fim")) {
                    break;
                }else{
                    try{
                    fila.offer(Integer.parseInt(entrada));
                    control=true;
                    }catch(NumberFormatException e){
                        System.out.println("Dado inválido! Insira um número inteiro!\n");
                        control=false;
                    }
                }
            }while(!control);
        }while(!entrada.equalsIgnoreCase("fim"));
        pilha.push(fila.poll());
        do{
            if (pilha.peek()<fila.peek()) {
                fila.offer(pilha.pop());
                if (pilha.isEmpty()) {
                    pilha.push(fila.poll());
                }
            }else{
                pilha.push(fila.poll());
            }
        }while(!fila.isEmpty());
        do{
            fila.offer(pilha.pop());
        }while(!pilha.isEmpty());
        System.out.println("\n > "+fila+"\n");
        in.close();
    }
}
