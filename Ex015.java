public class Ex015 {
    public static void execute(){
        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            Prompt.imprimir("Insira o valor do veículo:");
            double valor = Prompt.lerDecimal();

            if (valor == 0) {
                break;
            }

            Prompt.imprimir("Insira o tipo de combustível do veículo (álcool, gasolina, diesel):");
            String combustivel = Prompt.lerLinha();

            Veiculo veiculo = new Veiculo(valor, combustivel);
            double desconto = veiculo.calcularDesconto();
            double valorComDesconto = valor - desconto;

            Prompt.imprimir("O valor do desconto é: " + desconto);
            Prompt.imprimir("O valor a ser pago pelo cliente é: " + valorComDesconto);

            totalDesconto += desconto;
            totalPago += valorComDesconto;
        }

        Prompt.imprimir("Total de desconto: " + totalDesconto);
        Prompt.imprimir("Total pago pelos clientes: " + totalPago);
    }
}
