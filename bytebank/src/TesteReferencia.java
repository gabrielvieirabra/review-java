public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da primeiraConta: " + primeiraConta.saldo);

        System.out.println(primeiraConta);
        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.saldo);
        if (primeiraConta == segundaConta) {
            System.out.println("Iguais!");
        }
    }
}
