import java.util.Scanner;
import java.util.Stack;

public class App {
        public static Scanner in = new Scanner(System.in);
        public static Stack<String> pilha = new Stack<>();
    public void inserirpilha(int op, String sla){
        do{
            System.out.print("Insira um dado para a pilha: \n > ");
            sla=in.nextLine();
            pilha.push(sla);
            System.out.println("");
            System.out.print("Adicionar outro dado \n > [1]sim \n > [2]não\n > ");
            op=in.nextInt();
            in.nextLine();
            }while (op==1);
    }
    public void obtertarefa(){
        if (pilha.isEmpty()) {
            System.out.println("PILHA VAZIA!");
        }else
        System.out.println(pilha.peek());
    }
    public static void main(String[] args) throws Exception {
        App metodo = new App();
        String sla=null;
        int op;
        do{
        System.out.print("OPÇÕES\n > [1]INSERIR TAREFA NA PILHA\n > [2]OBTER A PRIMEIRA TAREFA DA PILHA \n > [3]SAIR \n > ");
        op=in.nextInt();
        in.nextLine();
            switch (op) {
                case 1:
                    metodo.inserirpilha(op, sla);
                    op=0;
                    break;
                case 2:
                    metodo.obtertarefa();
                    op=0;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Dado inválido!");
                    break;
            }
        }while (op==0);
        in.close();
    }
}
