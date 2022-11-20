public class CondicionaisBoolean {
    public static void main(String[] args) {
        int idade = 16;
        int quantidadePessoas = 2;
        boolean acompanhando = idade >= 18 || quantidadePessoas >= 2;
        if (acompanhando){ // || = OR: 1verdades, && = AND: 2verdades
            System.out.println("Seja bem vindo.");
        } else {
            System.out.println("Infelizmente voce nao pode entrar.");
        }
    }
}
