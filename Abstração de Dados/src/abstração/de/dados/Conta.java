
package abstração.de.dados;

public class Conta {
    protected int numero;
    protected String dono;
    protected float saldo;
    protected float limite;

    protected  void setDono(String dono) {
        this.dono = dono;
    }

    protected  void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    protected  void setLimite(float limite) {
        this.limite = limite;
    }

    protected  void setNumero(int numero) {
        this.numero = numero;
    }
    
    protected void depositar(float saldo){
        this.saldo = this.saldo + saldo;
    }

    protected float getSaldo() {
        return saldo;
    }
    
    protected void sacar(float valor){
        if(valor > this.saldo){
            System.out.println("Quantia solicitada indisponivel. Seu saldo é de: " + this.saldo);
        }else if(valor <= this.saldo){
            System.out.println("Saldo anterior: " + this.saldo);
            System.out.println("Quantia solicitada: " + valor);
            this.saldo = this.saldo - valor;
            System.out.println("Saldo atual: " + this.saldo);
    }
    }
    
    protected void taxa(float taxa){
        this.saldo += saldo * taxa * 2;
    }
   
}



