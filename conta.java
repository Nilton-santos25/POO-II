public class conta {

    private int numero;
    private String titular;
    private double saldo;
    private double limiteSaque;

    //construtor vazio
    public conta() {

    }
    //construtor parametrizado
    public conta(int numero, String titular, double saldo, double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    //get
    public int getNumero(){
        return numero;
    }

    //set
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular) {
        this.getTitular();
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLiminiteSaque(double limiteSaque){
        this.limiteSaque=limiteSaque;
    }

    public void saque(Double valor) throws ContaExceptions{
        if(valor > limiteSaque) {
            throw new ContaExceptions("O valor nao pode exceder o limite de saque!"); //lancando as exceções
        }
        if(valor > saldo) {
            throw  new ContaExceptions("seu saldo não e suficiente"); //lancando exceções
        }
        saldo -= valor;
    }




}
