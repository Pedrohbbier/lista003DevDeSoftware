public class Ex005 {
    public static void execute(){
        Prestacao prestacao = new Prestacao();

        prestacao.valor = Prompt.lerDecimal("Digite o valor da prestacao: ");

        prestacao.nPrestacao = Prompt.lerDecimal("Digite o numero de prestacoes: ");

        Prompt.imprimir("O valor da prestacao: " + prestacao.prestacao(prestacao.valor, prestacao.nPrestacao));
    }
}
