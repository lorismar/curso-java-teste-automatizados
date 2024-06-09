package curso_java_teste_automatizados.com.br.teste;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double quantia){
        if(quantia < 0){
            throw new IllegalArgumentException("Quantia para deposito deve ser positiva");
        }
        this.saldo += quantia;
    }

    public void sacar(double quantia){
        if(quantia > this.saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    public double obterSaldo(){
        return this.saldo;
    }




}
