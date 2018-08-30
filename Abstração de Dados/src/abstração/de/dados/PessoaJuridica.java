
package abstração.de.dados;


public class PessoaJuridica extends Pessoa{
    private String CMPJ;

    public PessoaJuridica(String nome,String endereco, String email, String telefone, String CMPJ) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.CMPJ = CMPJ;
    }
    
    
}
