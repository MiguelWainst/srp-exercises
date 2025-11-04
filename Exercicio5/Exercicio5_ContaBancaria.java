public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void gerarExtrato() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void salvarNoBanco() {
        System.out.println("Salvando conta no banco de dados...");
    }

    public void enviarEmail(String email) {
        System.out.println("Enviando notificação para " + email);
    }
}
