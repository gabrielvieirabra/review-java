public class Main {
    public static void main(String[] args) {
        // instanciacao de uma nova conta
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        System.out.println(conta1);
        System.out.println(conta2);

        conta1.saldo = 100;
        System.out.println(conta1.saldo);
        System.out.println("Agencia Conta 1: " + conta1.agencia);

        conta2.saldo = 300;
        System.out.println(conta2.saldo);
    }
}