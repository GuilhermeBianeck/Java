package Cliente;

public class Conta{
    private int numeroConta,senha;
    private double saldo;
    
    public Conta(int numeroConta, int senha) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldo = 0;
    }
    
    public boolean saque(double valor){
        if (saldo>=valor){
            saldo=saldo-valor;
            return true;
        }
        return false;
    }
    
    public void depositar(double valor){
        saldo=saldo+valor;
    }
    
    public boolean tranferir(double valor, Conta destino){
        if (valor>0){
            this.saque(valor);
            destino.depositar(valor);
            return true;
        }
        return false;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
}
