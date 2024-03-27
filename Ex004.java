public class Ex004 {
    public static void execute(){
        Convercao convercao = new Convercao();

        convercao.dolar = Prompt.lerDecimal("Digite o valor em dolar: ");

        convercao.precoDolar = Prompt.lerDecimal("Digite o valor do dolar: ");

        Prompt.imprimir(convercao.convercaoRealDolar(convercao.dolar, convercao.precoDolar));

    }
}
