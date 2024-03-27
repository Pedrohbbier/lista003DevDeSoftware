public class Ex008 {
    public static void execute(){
        MediaNota mediaNota = new MediaNota();

        mediaNota.nome = Prompt.lerLinha("Digite o nome: ");

        mediaNota.nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        mediaNota.nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        mediaNota.nota3 = Prompt.lerDecimal("Digite a terceira nota: ");


        double media = mediaNota.CalcularMedia(mediaNota.nota1, mediaNota.nota2, mediaNota.nota3);

        if (media >= 7) {
            Prompt.imprimir(mediaNota.nome + " Aprovado");
        } else if (media <= 5) {
            Prompt.imprimir(mediaNota.nome + " Reprovado");
        } else {
            Prompt.imprimir(mediaNota.nome + " Em recuperacão");
        }

    }
}
