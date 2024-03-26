public class Ex003 {
    public static void execute(){
        Vendedor vendedor = new Vendedor();

        vendedor.nome = Prompt.lerLinha("Nome do vendedor:");

        vendedor.salario = Prompt.lerDecimal("Salário do vendedor em reais:");
        vendedor.vendas = Prompt.lerDecimal("Quantidade de dinheiro em reais que esse vendedor gerou com as vendas:");

        double salarioFinal = vendedor.comissao(vendedor.salario, vendedor.vendas);

        Prompt.imprimir("Salario do vendedor + comissao de 15% das vendas:" + salarioFinal);
    }
}
