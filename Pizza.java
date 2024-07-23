import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //declaração de variáveis
        int ver, i=0, codigomeia, cont=0, controle=0; 
        int codigo, distancia,quantidade;               
        String op=null, tempo;                      
        String escolha=null;                  
        String desc[]= new String[10];        
        String descmeia="";
        String pagamento[]={"","Cartão de crédito","Pix","Vale refeição"};
        double valormeia=0, frete, total=0;     
        String endereço;

        //menu de opções
        System.out.println("CARDÁPIO");
        System.out.println("CÓDIGO   PIZZA   VALOR");
        System.out.println("101      JAVA    R$75,90 \n102      C++     R$88,15 \n103      PYTHON  R$79,90 \n104      SQL     R$90,87\n");
        System.out.println("Digite o código da pizza para ver a descrição!  \nPara fazer o pedido, digite 0.");
        ver=in.nextInt();
        System.out.println("================================================================");
        while (ver!=0){
            switch (ver) {
                case 101:
                    System.out.println("");
                    System.out.println("JAVA - MUSSARELA, CHOCOLATE BRANCO E CAFÉ GRANULADO");
                    break;
                case 102:
                    System.out.println("");    
                    System.out.println("C++ - MOLHO DE TOMATE, MUSSARELA, CALABRESA, CEBOLA, ORÉGANO E MUITA PIMENTA");
                    break;
                case 103:
                    System.out.println("");
                    System.out.println("PYTHON - MOLHO DE TOMATE RÚSTICO, MUSSARELA, CARNE DE COBRA, CEBOLA E ORÉGANO");
                    break;
                case 104:
                    System.out.println("");
                    System.out.println("SQL -  MOLHO, MUSSARELA, CALABRESA, TOMATE, PIMENTÃO, COGUMELOS, CEBOLA E ORÉGANO");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Código não encontrado, tente novamente!");
                    break;
            }
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("Para ver o sabor, digite novamente o código da pizza. \nPara fazer o pedido, digite 0.");
            ver=in.nextInt();
            System.out.println("================================================================");
        }

        //pedidos 
        System.out.println("==============CARDÁPIO=============");
        System.out.println("");
        System.out.println("CÓDIGO   PIZZA              VALOR");
        System.out.println("101      JAVA               R$75,90 \n102      C++                R$88,15 \n103      PYTHON             R$79,90 \n104      SQL                R$90,87");
        System.out.println("===================================");
        System.out.println("==============BEBIDAS==============");
        System.out.println("");
        System.out.println("CÓDIGO   ITEM               VALOR");
        System.out.println("303      ÁGUA               R$05,00 \n304      SUCO DE LARANJA    R$10,00 \n305      REFRIGERANTE       R$12,00\n306      REFRI. ZERO        R$12,00");
        System.out.println("===================================");
        System.out.println("Faça seu pedido!");
        do{
            do{
                System.out.println("Insira o código do produto que deseja:");
                codigo=in.nextInt();
                cont++;
                if (codigo==101||codigo==102||codigo==103||codigo==104||codigo==303||codigo==304||codigo==305||codigo==306) {
                    controle=1;

                    // VERIFICA SE O PRODUTO QUE O CLIENTE QUER É UMA PIZZA
                    if (codigo==101||codigo==102||codigo==103||codigo==104) {
                        in.nextLine();
                        do{
                            System.out.println("");
                            System.out.print("Inteira ou meia? "); //ESCOLHA ENTRE MEIA E INTEIRA
                            escolha=in.nextLine();
                            if (escolha.equalsIgnoreCase("inteira")){
                                break;
                            }else if (escolha.equalsIgnoreCase("meia")) {
                                do{
                                    System.out.println("");
                                    System.out.print("Informe o código do outro sabor: "); //ARMAZENA O VALOR DA MEIA CASO ESCOLHA DO CLIENTE
                                    codigomeia=in.nextInt();
                                    in.nextLine();
                                    switch (codigomeia) {
                                        case 101:
                                            descmeia="/Java  ";
                                            valormeia=(37.95);
                                            break;
                                        case 102:
                                            descmeia="/C++   ";
                                            valormeia=(44.075);
                                            break;
                                        case 103:
                                            descmeia="/Python";
                                            valormeia=(39.95);
                                            break;
                                        case 104:
                                            descmeia="/SQL   ";
                                            valormeia=(45.435);
                                            break;
                                        default:
                                            System.out.println("Código inválido! Tente novamente.");
                                            break;
                                    }  
                                }while(codigomeia!=101&&codigomeia!=102&&codigomeia!=103&&codigomeia!=104);
                            }else{
                                System.out.println("Escolha inválida!");
                        }
                        }while (!escolha.equalsIgnoreCase("inteira")&&!escolha.equalsIgnoreCase("meia"));
                    }
                    System.out.print("Quantidade: ");
                    quantidade=in.nextInt();

                    // ARMAZENA INFORMAÇÕES DO ITEM
                    switch (codigo) {
                        case 101:
                            if (escolha.equalsIgnoreCase("inteira")) {
                                desc[i]="           Java             0"+quantidade+"   R$75,90  R$"+(75.90*quantidade);
                                total+=(75.90*quantidade);
                            }else{
                                desc[i]="         Java"+descmeia+"        0"+quantidade+"     R$"+(37.95+valormeia)+"  R$"+((37.95+valormeia)*quantidade);
                                total+=((37.95+valormeia)*quantidade);}
                            break;
                        case 102:
                            if (escolha.equalsIgnoreCase("inteira")) {
                                desc[i]="           C++              0"+quantidade+"   R$88,15  R$"+(88.15*quantidade);
                                total+=(88.15*quantidade);
                            }else{
                                desc[i]="         C++"+descmeia+"         0"+quantidade+"   R$"+(44.075+valormeia)+"  R$"+((44.075+valormeia)*quantidade);
                                total+=((44.075+valormeia)*quantidade);}
                            break;
                        case 103:
                            if (escolha.equalsIgnoreCase("inteira")) {
                                desc[i]="           Python           0"+quantidade+"   R$79,90  R$"+(79.90*quantidade);
                                total+=(79.90*quantidade);
                            }else{
                                desc[i]="         Python"+descmeia+"      0"+quantidade+"     R$"+(39.95+valormeia)+"  R$"+((39.95+valormeia)*quantidade);
                                total+=((39.95+valormeia)*quantidade);}
                            break;
                        case 104:
                            if (escolha.equalsIgnoreCase("inteira")) {
                                desc[i]="           SQL              0"+quantidade+"   R$90,87  R$"+(90.87*quantidade);
                                total+=(90.87*quantidade);
                            }else{
                                desc[i]="         SQL"+descmeia+"         0"+quantidade+"     R$"+(45.435+valormeia)+"  R$"+((45.435+valormeia)*quantidade);
                                total+=((45.435+valormeia)*quantidade);}
                            break;
                        case 303:
                            desc[i]="           Água             0"+quantidade+"   R$05,00  R$"+(5.00*quantidade);
                            total+=(5.00*quantidade);
                            break;
                        case 304:
                            desc[i]="        Suco de laranja     0"+quantidade+"   R$10,00  R$"+(10.00*quantidade);
                            total+=(10.00*quantidade);
                            break;
                        case 305:
                            desc[i]="        Refrigerante        0"+quantidade+"   R$12,00  R$"+(12.00*quantidade);
                            total+=(12.00*quantidade);
                            break;
                        case 306:
                            desc[i]="        Refri. Zero         0"+quantidade+"   R$12,00  R$"+(12.00*quantidade);
                            total+=(12.00*quantidade);
                            break;
                        default:
                            break;
                    }
                }else{ 
                    System.out.println("Código inválido! Tente novamente.");
                    System.out.println("");
                    controle=0;
                }
            }while (controle==0); 

            //controle de loop, adicionar mais alguma coisa ao carrinho
            in.nextLine();
            do{
                System.out.println("================================================================");
                System.out.println("");
                System.out.println("Continuar comprando? sim/nao");
                op=in.nextLine();
                System.out.println("");
                switch (op) {
                    case "sim":
                        i++; //alterando a posição dos vetores - deu 9 tem que encerrar
                        break;
                    case "nao":
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }while (!op.equalsIgnoreCase("sim")&& !op.equalsIgnoreCase("nao"));
        }while(op.equalsIgnoreCase("sim")&&i<10);

        if (i==10){
            System.out.println("Desculpe, mas você atingiu o limite de pedidos.");
        }
        do {
            System.out.println("================================================================");
            System.out.println("Forma de pagamento: \n1.Crédito \n2.Pix \n3.Vale refeição");
            System.out.print("Opção: ");
            i=in.nextInt();
            if (i!=1&&i!=2&&i!=3) {
                System.out.println("Opção inválida!");
            }
        } while (i!=1&&i!=2&&i!=3);
        in.nextLine();
        System.out.println("\nEndereço para entrega: ");
        endereço=in.nextLine();
        System.out.println("Qual a distância entre sua residência e a pizzaria? *metros*");
        distancia=in.nextInt();
        System.out.println("\n");

        if (distancia<1000) {
            frete=0.00;
            tempo="40 minutos";
        }else if (distancia>=1000&&distancia<=5000) {
            frete=5.00;
            tempo="50 minutos";
        }else{
            frete=10.00;
            tempo="1 hora e 5 minutos";
        }
        //nota do pedido
            System.out.println("============================NOTA================================\n");
            System.out.println("ITEM-------DESCRIÇÃO----------QTD---VALOR----TOTAL");
        for(int j=0;j<cont;j++){
            System.out.println("0"+(j+1)+desc[j]);}
        System.out.println("\nvalor do frete..............................R$"+frete);
        System.out.println("valor total.................................R$"+(total+frete));
        System.out.println("==================Informações adicionais========================\n");
        System.out.println("Forma de pagamento: "+pagamento[i]);
        System.out.println("Endereço de entrega: "+endereço);
        System.out.println("Previsão de entrega em "+(tempo));
        System.out.println("================================================================");
        System.out.println("\n\n");
        in.close();
    }
}