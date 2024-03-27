public class Ex013 {
    public static void execute(){
        int totalPessoas = 0;
        int totalAptos = 0;

        while (true) {
            Prompt.imprimir("Insira o nome da pessoa:");
            String nome = Prompt.lerLinha();

            Prompt.imprimir("Insira o sexo da pessoa (M para masculino, F para feminino):");
            char sexo = Prompt.lerCaractere();

            Prompt.imprimir("Insira a idade da pessoa:");
            int idade = Prompt.lerInteiro();

            Prompt.imprimir("Insira a saúde da pessoa (saudavel ou doente):");
            String saude = Prompt.lerLinha();

            Pessoa pessoa = new Pessoa(nome, sexo, idade, saude);
            if (pessoa.estaAptoParaServicoMilitar()) {
                totalAptos++;
                Prompt.imprimir(nome + " está apto(a) para o serviço militar obrigatório.");
            } else {
                Prompt.imprimir(nome + " não está apto(a) para o serviço militar obrigatório.");
            }

            totalPessoas++;

            Prompt.imprimir("Deseja continuar inserindo pessoas? (S) Sim / (N) Não");
            char resposta = Prompt.lerCaractere();

            if (resposta == 'N' || resposta == 'n') {
                break;
            }
        }

        Prompt.imprimir("Total de pessoas: " + totalPessoas);
        Prompt.imprimir("Total de pessoas aptas para o serviço militar obrigatório: " + totalAptos);
    }
}
