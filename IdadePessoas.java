public class IdadePessoas {
    int idade;

    public String IdadePessoas(int idadePessoal) {
        if(idadePessoal >=18){
            return "Adulto";
        }
        else{
            return "Menor de Idade";
        }
    }
}
