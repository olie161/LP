
package abstração.de.dados;

public class Principal {

   
    public static void main(String[] args) {
     
        ContaC conta1 = new ContaC("Daniel", 1000, 1, 500);
        conta1.depositar(200);
        System.out.println(conta1.getSaldo());
        conta1.sacar(400);
        conta1.sacar(500);
        
        
        
    
        
        
    }
    
}
