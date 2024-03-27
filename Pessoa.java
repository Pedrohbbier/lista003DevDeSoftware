public class Pessoa {
    String nome;
    char sexo;
    int idade;
    String saude;

    Pessoa(String nome, char sexo, int idade, String saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    boolean estaAptoParaServicoMilitar() {
        return sexo == 'M' && idade >= 18 && idade <= 25 && saude.equals("saudavel");
    }
}
