public class Ex006 {
    public static void execute(){
        ValorVenda valorVenda = new ValorVenda();

        valorVenda.valor = Prompt.lerDecimal("Digite o valor do produto: ");
        valorVenda.acresimo = Prompt.lerDecimal("Digite o valor do acresimo: ");

        Prompt.imprimir("O valor da venda: " + valorVenda.ValorVenda(valorVenda.valor, valorVenda.acresimo));
    }
}
