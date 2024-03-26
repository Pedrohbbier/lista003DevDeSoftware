public class Ex002{
    public static void execute(){
        Automovel automovel = new Automovel();

        automovel.km = Prompt.lerDecimal("Digite a distancia percorrida pelo seu carro:");
        automovel.litros = Prompt.lerDecimal("Digite a quantidade de litros de gasolina gastos com a viagem");

        Prompt.imprimir("O consumo médio do seu veículo: " + automovel.consumoMedio(automovel.km, automovel.litros) + "km/l");
    }
}