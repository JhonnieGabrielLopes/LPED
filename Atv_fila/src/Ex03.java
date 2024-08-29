package Atv_fila.src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> fila1 = new LinkedList<>();
        Queue<Integer> fila2 = new LinkedList<>();
        Queue<Integer> fila3 = new LinkedList<>();
        String entrada, op;
        boolean controle=true;

        System.out.println("\nComandos:\n > [iniciar] Inicia a entrada de dados\n > [fim] Encerra a entrada de dados\n > [ver] Números intercalados\n > [sair] Encerra o programa\n");
        do{
        System.out.print(" > ");
        op=in.nextLine();
        if(op.equalsIgnoreCase("sair")){
            break;
        }else{
            if (op.equalsIgnoreCase("iniciar")) {
                if (!fila3.isEmpty()) {
                    fila3.clear();
                }
                System.out.println("Insira valores inteiros para a primeira fila:");
                do{
                    do{
                        System.out.print(" > ");
                        entrada=in.nextLine();
                        if (entrada.equalsIgnoreCase("fim")) {
                            break;
                        }else {
                            try{
                                fila1.offer(Integer.parseInt(entrada));
                                controle=true;
                            }catch(NumberFormatException e){
                                System.out.println("Dado inválido!\n");
                                controle=false;
                            }
                        }
                    }while(!controle);
                }while(!entrada.equalsIgnoreCase("fim"));
                System.out.println("");
                System.out.println("Insira valores inteiros para a segunda fila:");
                do{
                    do{
                        System.out.print(" > ");
                        entrada=in.nextLine();
                        if (entrada.equalsIgnoreCase("fim")) { 
                            break;
                        }else {
                                try{
                                    fila2.offer(Integer.parseInt(entrada));
                                    controle=true;
                                }catch(NumberFormatException e){
                                    System.out.println("Dado inválido!\n");
                                    controle=false;
                                }
                            }
                        }while(!controle);
                }while(!entrada.equalsIgnoreCase("fim"));
                System.out.println("");
                System.out.println("Digite o proximo comando");
            }else{
                if (op.equalsIgnoreCase("fim")&&(fila1.isEmpty()&&fila2.isEmpty())) {
                    System.out.println("Não foi inicializado a entrada de dados para ser finalizado!\n");}
                else{
                    if (op.equalsIgnoreCase("fim")&&(!fila1.isEmpty()||!fila2.isEmpty())) {
                            System.out.println("Entrada de dados já finalizada!");
                        }
                        else{
                            if (op.equalsIgnoreCase("ver")&&(fila1.isEmpty()&&fila2.isEmpty())) {
                            System.out.println("Não foi inserido dados nas filas 1 e 2, para gerar a fila intercalada!\n");
                            }else{
                                if (op.equalsIgnoreCase("ver")) {
                                    System.out.println(" > "+fila1);
                                    System.out.println(" > "+fila2);
                                    do{
                                    //if (!fila1.isEmpty()||!fila2.isEmpty()) {
                                        if (!fila1.isEmpty()) {
                                            fila3.offer(fila1.poll());
                                        }
                                        if (!fila2.isEmpty()) {
                                            fila3.offer(fila2.poll());
                                        }
                                    }while(!fila1.isEmpty()||!fila2.isEmpty());
                                    System.out.println(" > "+fila3);
                                }else{  
                                    System.out.println("Comando inválido!");
                                }
                            }
                        }
                    }
                }
            }
        }while(!op.equalsIgnoreCase("sair"));
        in.close();
    }   
}