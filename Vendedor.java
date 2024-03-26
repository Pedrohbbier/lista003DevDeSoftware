public class Vendedor{
    public String nome;
    public Double salario;
    public Double vendas;

    public Double comissao (Double salario, Double vendas){
        Double porcentual = (vendas * 15) / 100;
        return salario + porcentual;
    }
}