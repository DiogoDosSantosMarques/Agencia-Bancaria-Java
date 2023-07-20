package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
    static Scanner input = new Scanner(System.in);

    static ArrayList <Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
       operacoes();
    }


    public static void operacoes() {
        int operacao = input.nextInt();

        switch (operacao) {
            case 1: // Criar Conta
            criarConta();
                break;
        
            case 2: // Depositar
            depositar();
            
            break;

            case 3: // Sacar
            sacar();
                break;
        
            case 4:
            transferir();
            break;

            case 5: // Transferir
            listarContas();
                break;
        
            case 6: // Sair
            System.out.println("\n Saindo! ");
            System.exit(0);
            
            default:
            System.out.println("Opção Inválida");
            operacoes();
            break;

           
        }
    }

    public static void criarConta() {

        System.out.println("\n Nome: ");

        String nome = input.next();

         System.out.println("\n CPF: ");

        String cpf = input.next();

         System.out.println("\n Email: ");

        String email = input.next();

        Cliente cliente = new Cliente(nome, email, cpf);

        Conta conta = new Conta(0, cliente, 0);

        contasBancarias.add(conta);
        System.out.println("Conta Criada");

        operacoes();
    }


    private static Conta encontrarConta (int numeroConta) {
        Conta conta = null;

        

        if(contasBancarias.size() > 0) { // se tiver contabancaria dentro da agencia
            for (Conta c  : contasBancarias) {
                if(c.getNumeroConta() == numeroConta){
                    conta = c;
                }
                
            }
            return conta;
        }
        return conta;

}

public static void depositar() {
    System.out.println("Numero da Conta");

   int numeroConta = input.nextInt();

    Conta conta = encontrarConta(numeroConta);


if(conta !=null ) {
    System.out.println("Qual valor deseja depositar");

    Double valorDeposito = input.nextDouble();
    conta.depositar(valorDeposito);
    System.out.println("Valor deositado");
} else {
    System.out.println("Conta não encontrada");
}
operacoes();

}


public static void sacar() {
    System.out.println("Numero conta");

     int numeroConta = input.nextInt();

    Conta conta = encontrarConta(numeroConta);


if(conta !=null ) {
    System.out.println("Qual valor deseja Sacar");

    Double valorSaque = input.nextDouble();
    conta.sacar(valorSaque);
    System.out.println("Valor Sacado");
} else {
    System.out.println("Conta não encontrada");
}
operacoes();

}



public static void transferir() {
    System.out.println("Conta remetente Numero: ");

    int numeroContaRemetente = input.nextInt();

    Conta contaRemetente = encontrarConta(numeroContaRemetente);

    if(contaRemetente != null) {
        System.out.println("Numero conta destinatário");

        int contaNumeroDestinatário = input.nextInt();

        Conta contaDestinatario = encontrarConta(contaNumeroDestinatário);

        if(contaDestinatario != null) {
            System.out.println("Valor Transferência");
            double valor = input.nextDouble();

            contaRemetente.transferir(contaDestinatario, valor);
        }
    }
    operacoes();
}

public static void listarContas() {
    if(contasBancarias.size() > 0) {
        for (Conta conta: contasBancarias) {
            System.out.println(conta);
            
        } 
    } else {
            System.out.println("Não há contas cadastradas");
        }
        operacoes();
}
}
