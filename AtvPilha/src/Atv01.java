package AtvPilha.src;
import java.util.Scanner;
import java.util.Stack;

public class Atv01 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();
        String verif1, verif2, testa="null", mostra="";
        int i=0, tam;
        boolean control=false;
        System.out.println("\n\n==========================================================================");        
        System.out.println("Informe uma expressão de parênteses, chaves ou colchetes um dígito por vez\nO programa irá dizer se estão balanceados ou não");
        System.out.println("==========================================================================");
        System.out.println(" > Para encerrar a entrada de dados, digite [fim]\n > Para apagar um dado inserido errado, digite [apagar]\n");
        System.out.println("==========================================================================");
        do{
            do{
                System.out.print(" > ");
                verif1=in.nextLine();
                if (verif1.equalsIgnoreCase("fim")) {
                    break;
                }else{
                    if (verif1.equals("(")||verif1.equals(")")||verif1.equals("[")||verif1.equals("]")||verif1.equals("{")||verif1.equals("}")) {
                                pilha.push(verif1);
                            }else{
                                if (verif1.equalsIgnoreCase("apagar")) {
                                    if (!pilha.isEmpty()) {
                                        pilha.pop();
                                    }else
                                    System.out.println("nenhum dado foi inserido para ser apagado");
                                }else{
                                System.out.println("Entrada inválida");
                                control=true;}}}
                }while(control);
        }while(!verif1.equalsIgnoreCase("fim"));
        System.out.println("\n");
        for(int k=0; k<pilha.size();k++){
            mostra+=pilha.get(k);
        }
        if(pilha.size()==0){
            System.out.println("Tchau");
        }else{
            System.out.println("Foi inserido: "+mostra);
            tam=pilha.size();
            if (pilha.size()%2!=0) {
                System.out.println("Não está balanceado!");
            }else{
                for(int j=0; j<pilha.size();j++){
                    verif1=pilha.peek();
                    pilha.pop();
                    verif2=pilha.get(j);
                    switch (verif1) {
                        case ")":
                            testa="(";
                            break;
                        case "}":
                            testa="{";
                            break;
                        case "]":
                            testa="[";
                            break;
                        default:
                            break;
                    }
                        if (testa.equalsIgnoreCase(verif2)) {
                            i++;
                        }else{
                            System.out.println("Não está balanceado!");
                            j=pilha.size();
                        }
                }
                if (i==(tam/2)) {
                    System.out.println("Tudo certo!");
                }
            }
        }
        System.out.println("\n\n\n\n");
        in.close();
    }
}