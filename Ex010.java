public class Ex010 {
    public static void execute(){
        int nPessoas = Prompt.lerInteiro("Quantas pessoas?");

        IdadePessoas idade = new IdadePessoas();

        for(nPessoas = 0; nPessoas < 10; nPessoas++){
            int idadePessoal = Prompt.lerInteiro("Idade da pessoa " + (nPessoas + 1) + ": ");
            String age = idade.IdadePessoas(idadePessoal); 
            System.out.println("A pessoa " + (nPessoas + 1) + " é " + age);
    }
}}
