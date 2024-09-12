package ico.fes.aragon.unam.mx.clases;

public class Wallet {
    private Double saldo;

    public Wallet(double saldo) {
        this.saldo = saldo;
    }

    public void withdraw(double amount) {
        if (amount <= saldo) {
            saldo -= amount;
        } else {
            System.out.println("Saldo insuficiente para retirar " + amount);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    @Override
    public String toString() {
        return "Wallet{ saldo=" + saldo + " }";
    }

}