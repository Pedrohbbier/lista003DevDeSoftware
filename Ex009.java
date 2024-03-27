public class Ex009 {
    public static void execute(){
        ValidarValor valor = new ValidarValor();
        int a = 0;


        for(int i = 0 ; i < 80 ; i++){
            valor.valor[i] = Prompt.lerDecimal("Digite o valor da posicao " + (i+1) + " :");

            if(valor.valor[i] >= 10 && valor.valor[i] <= 150){
                a++;
            }
        }


        Prompt.imprimir("O número aparece no intervalo entre 10 e 150 " + a + " vezes.");

    }
}
