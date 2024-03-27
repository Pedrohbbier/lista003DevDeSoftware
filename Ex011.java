public class Ex011 {
    public static void execute(){
        Sexo sexo = new Sexo();

        sexo.qtd = Prompt.lerInteiro("Quantas pessoas?");

        int m = 0;
        int f = 0;

        for(int i = 0; i < sexo.qtd; i++){
            Prompt.lerLinha("Digite o nome da pessoa:");
            sexo.sexo = Prompt.lerInteiro("Qual o sexo da pessoa? 1 = MASCULINO, 2 = FEMININO");
            if(sexo.sexo == 1){
                m++;
            } else {
                f++;
            }
        }

        Prompt.imprimir("Masculino: " + m);
        Prompt.imprimir("Feminino: " + f);
    }
}
