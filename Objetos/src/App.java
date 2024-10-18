import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Senha novaSenha = new Senha();

        novaSenha.defineNomePessoa("Alan");
        novaSenha.defineSenha(0);

        System.out.println(novaSenha.retornaNomePessoa());


    Queue<Senha> filaSenhas = new LinkedList<>();
    filaSenhas.offer(novaSenha);
    System.out.println(filaSenhas);

    Senha alan = filaSenhas.poll();

    System.out.println(alan.retornaNomePessoa());
    System.out.println(alan.retornaSenha());

    Senha jhonnie = new Senha();
    jhonnie.defineNomePessoa("Jhonnie");
    jhonnie.defineSenha(1545654);
    filaSenhas.offer(jhonnie);
    }
}
