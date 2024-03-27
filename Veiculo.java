public class Veiculo {
    double valor;
    String combustivel;

    Veiculo(double valor, String combustivel) {
        this.valor = valor;
        this.combustivel = combustivel;
    }

    double calcularDesconto() {
        switch (combustivel.toLowerCase()) {
            case "álcool":
                return valor * 0.25;
            case "gasolina":
                return valor * 0.21;
            case "diesel":
                return valor * 0.14;
            default:
                return 0;
        }
    }
}
