public class Senha{
String nomePessoa;
int senha;

public void defineNomePessoa(String nomePes){
  this.nomePessoa = nomePes;
}

public String retornaNomePessoa(){
    return this.nomePessoa;
}

public void defineSenha(int senhaNova){
    this.senha = senhaNova;
}

public int retornaSenha(){
    return this.senha;
}

}