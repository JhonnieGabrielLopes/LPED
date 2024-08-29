package Atv_fila.src;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {
    
    public String pegarsenha(int senha, Queue<Integer> fila, Scanner in, String senhas){
        System.out.println(" > Sua senha é: "+senha);
        senhas+="0"+senha+"; ";
        fila.offer(senha);
        return senhas;
    }
    public void proxdafila(Queue<Integer> fila){
        if (!fila.isEmpty()) {
            System.out.println(">>>>>> Próxima senha <<<<<<\n\n > Senha: 0"+fila.poll());
        }else{
            System.out.println("Fila vazia!");
        }   
    }
    public void senhagerada(String senhas, Queue<Integer> fila){
        if (!senhas.equals("")) {
            System.out.println(" > Senhas geradas: "+senhas);
        }else{
            System.out.println("Não foi gerado nenhuma senha!");
        }
    }
    public void tamanhofila(Queue<Integer> fila){
        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
        }else{
        System.out.println(" > Tamanho da fila: 0"+fila.size());}
    }
    public void apagarfila(Queue<Integer> fila){
        do{
            fila.poll();
            if (fila.isEmpty()) {
                System.out.println("Apagado! Fila vazia!");
            }
        }while(!fila.isEmpty());
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();
        Ex01 metodo = new Ex01();
        String senhas="";
        int senha=0, op=0;
        boolean control=true;
        System.out.println("\n");
        do {
            do{
            System.out.println("\n===========================");
            System.out.print(" > [1] Pegar uma senha\n > [2] Chamar próxima senha\n > [3] Senhas geradas\n > [4] Tamanho da fila\n > [5] Apagar fila\n > [6]Sair\n > ");
            try {
                op=in.nextInt();
                control=true;
            } catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Insira um valor válido");
                control=false;
            }}while(!control);
            System.out.println("===========================\n");
            switch (op) {
                case 1:
                    senha++;
                    senhas=metodo.pegarsenha(senha, fila, in, senhas);
                    break;
                case 2:
                    metodo.proxdafila(fila);
                    break;
                case 3:
                    metodo.senhagerada(senhas, fila);
                    break;
                case 4:
                    metodo.tamanhofila(fila);
                    break;
                case 5: 
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia!");
                    break;
                    }else{
                        metodo.apagarfila(fila);
                        break;
                    }
                case 6:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op!=6);
        in.close();
    }
}
