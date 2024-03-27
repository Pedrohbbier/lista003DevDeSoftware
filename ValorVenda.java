public class ValorVenda {
    double valor;
    double acresimo;

    public double ValorVenda(double valor, double acresimo){
        return (valor + (valor * acresimo / 100));
    }
}
