package programa;

/**
 * Cliente
 */
public class Cliente {

    private static int counter = 1;

    private String nome;
    private String cpf;
    private String email;



    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        counter = counter++;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getCpf() {
        return cpf;
    }



    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    
}


@Override
public String toString() {
    return "\n Nome: " + this.getNome() +
            "\n CPF: " + this.getCpf() + 
            "\n Email: " + this.getCpf();
             
}



    


    
}