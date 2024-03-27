public class Ex014 {
    public static void execute(){
        double totalPrecoCusto = 0;
        double totalPrecoVenda = 0;

        for (int i = 0; i < 40; i++) {
            Prompt.imprimir("Insira o preço de custo do produto " + (i + 1) + ":");
            double precoCusto = Prompt.lerDecimal();

            Prompt.imprimir("Insira o preço de venda do produto " + (i + 1) + ":");
            double precoVenda = Prompt.lerDecimal();

            Produto produto = new Produto(precoCusto, precoVenda);
            String resultado = produto.calcularResultado();

            Prompt.imprimir("Resultado para o produto " + (i + 1) + ": " + resultado);

            totalPrecoCusto += precoCusto;
            totalPrecoVenda += precoVenda;
        }

        double mediaPrecoCusto = totalPrecoCusto / 40;
        double mediaPrecoVenda = totalPrecoVenda / 40;

        Prompt.imprimir("Média do preço de custo: " + mediaPrecoCusto);
        Prompt.imprimir("Média do preço de venda: " + mediaPrecoVenda);
    }
}
