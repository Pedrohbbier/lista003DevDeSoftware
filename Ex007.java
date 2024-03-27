public class Ex007 {
    public static void execute(){
        ValorFinalCarro valorFinalCarro = new ValorFinalCarro();

        valorFinalCarro.custoFabrica = Prompt.lerDecimal("Digite o custo para produzir o carro: ");

        Prompt.imprimir("O valor do carro: " + valorFinalCarro.ValorVenda(valorFinalCarro.custoFabrica));
    }
}
