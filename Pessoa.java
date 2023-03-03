/**
 * Pessoa
 */
public class Pessoa {

    //Atributos
    String nome;
    int idade;
    String profissao;
    //Método
    void ola(){
        System.out.println("Olá, eu sou "+ this.nome + ", tenho "+ this.idade+" anos e sou "+ this.profissao);
    }
}