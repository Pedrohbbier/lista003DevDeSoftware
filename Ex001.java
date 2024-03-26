public class Ex001 {
    public static void execute(){
        Aluno aluno = new Aluno();
        aluno.nome = Prompt.lerLinha("Qual o seu nome? ");
        double media = 0;
        for(int i = 0; i < 3; i++){
            aluno.nota[i] = Prompt.lerDecimal("Qual a sua nota "+(i+1));
            media += aluno.nota[i];
        }
        media /= 3;
        Prompt.imprimir("A média do aluno: "+aluno.nome+" e "+media);
        
    }
}
