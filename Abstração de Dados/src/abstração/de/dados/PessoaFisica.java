
package abstração.de.dados;


public class PessoaFisica extends Pessoa{
    private String CPF;
    
    public PessoaFisica(String nome,String endereco, String email, String telefone, String CMPJ) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.CPF = CPF;
    }
}
