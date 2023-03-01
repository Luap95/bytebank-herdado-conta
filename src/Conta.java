public abstract class Conta{
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    private static int totalContas = 0;

    public Conta(int agencia, int numero){
        totalContas++;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta");
    }

    public abstract void deposita(double valor);
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
