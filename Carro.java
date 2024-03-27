public class Carro {
    int ano;
    double preco;

    Carro(int ano, double preco) {
        this.ano = ano;
        this.preco = preco;
    }

    double calcularDesconto() {
        if (ano <= 2000) {
            return preco * 0.12;
        } else {
            return preco * 0.07;
        }
    }
}
