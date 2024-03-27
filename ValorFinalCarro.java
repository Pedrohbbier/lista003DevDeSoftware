public class ValorFinalCarro {

    double custoFabrica;

    public double ValorVenda(double custoFabrica){
        double percentualDistribuidor = 28.0 / 100.0;
        double impostos = 45.0 / 100.0;
        double custoImpostos = custoFabrica * impostos;
        double custoDistribuidor = (custoFabrica + custoImpostos) * percentualDistribuidor;

        double custoConsumidor = custoFabrica + custoImpostos + custoDistribuidor;
        return custoConsumidor;
    }


}
