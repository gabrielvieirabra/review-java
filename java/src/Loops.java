public class Loops {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }
        System.out.println("Acessando contador fora: " + contador);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Loop do For: " + i);
        }
        // System.out.println(i); variavel fora do escopo

        // lacos encadeados(um dentro do outro)
        for (int j = 1; j <= 10 ; j++) {
            for (int k = 0; k <= 10; k++) {
                System.out.print(j * k);
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (coluna > linha)
                    break;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
