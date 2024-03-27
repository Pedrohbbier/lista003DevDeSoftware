public class Ex012 {
    public static void execute(){
        int totalCarrosAte2000 = 0;
        int totalCarros = 0;

        while (true) {
            Prompt.imprimir("Insira o ano do carro:");
            int ano = Prompt.lerInteiro();

            Prompt.imprimir("Insira o preço do carro:");
            double preco = Prompt.lerDecimal();

            Carro carro = new Carro(ano, preco);
            double desconto = carro.calcularDesconto();
            double precoComDesconto = preco - desconto;

            Prompt.imprimir("O valor do desconto é: " + desconto);
            Prompt.imprimir("O valor a ser pago pelo cliente é: " + precoComDesconto);

            if (ano <= 2000) {
                totalCarrosAte2000++;
            }
            totalCarros++;

            Prompt.imprimir("Deseja continuar calculando desconto? (S) Sim / (N) Não");
            char resposta = Prompt.lerCaractere();

            if (resposta == 'N' || resposta == 'n') {
                break;
            }
        }

        Prompt.imprimir("Total de carros com ano até 2000: " + totalCarrosAte2000);
        Prompt.imprimir("Total geral de carros: " + totalCarros);

    }
}
