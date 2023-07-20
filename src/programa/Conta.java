package programa;

public class Conta {
    private static int idDeContas = 1;

    private int numeroConta;
    private Cliente cliente;
    private double saldo = 0;



    public Conta(int numeroConta, Cliente cliente, double saldo) {
        this.numeroConta = idDeContas;
        this.cliente = cliente;
        this.saldo = saldo;

        idDeContas = idDeContas++;
    }



    public int getNumeroConta() {
        return numeroConta;
    }



    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }



    public Cliente getCliente() {
        return cliente;
    }



    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public double getSaldo() {
        return saldo;
    }



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
public String toString() {
    return "\n Nome: " + this.getCliente().getNome() +
             "\n Numero da Conta: " + this.getNumeroConta() +
             "\n CPF: " + this.getCliente().getCpf() +
             "\n CPF: " + this.getCliente().getEmail() +
            
            "\n Saldo: " + utilitarios.Utils.doubleToString(this.getSaldo());
             
}



// Métodos 


public void depositar(double valor) {
 

if(valor >= 0.50) {
   
    setSaldo(getSaldo() + valor);
    System.out.println("Depósito Realizado!");
} else if (valor < 0.50) {

    System.out.println("É preciso colocar pelo menos 50 centavos para fazer algum depósito");
} else {
    System.out.println("É Preciso colocar dinheiro");
}

}


public void sacar(double valor) {

    if(valor >= 0.50 && this.getSaldo() >= valor) {
       setSaldo(getSaldo() - valor);
       System.out.println("Saque Realizado!");
    } else {
        System.out.println("Para Sacar Deve-se pelo menos sacar 0.50");
    }

}


public void transferir( Conta contaParaDeposito,  double valor) {

    if (valor > 0.50 && this.getSaldo() >= 0.50) {
        setSaldo(getSaldo() - valor);

        contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor; // Add o dinheiro p outra pessoa
    } else if (valor < 0.50 && this.getSaldo() <= 0.50){
        System.out.println("Não pode transferir menos do que 0.50");
    } else {
        System.out.println("Tranferência Não realizada");
    }

}
    


    
}
