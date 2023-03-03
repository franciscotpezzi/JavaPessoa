/**
 * main
 */
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome="Célia";
        p1.idade=25;
        p1.profissao="Estilista";
        p2.nome = "Francisco";
        p2.idade=63;
        p2.profissao="Cientista";

        p1.ola();
        p2.ola();
        }
    
}