
package Pessoas;


public class Aluno {
    
    private int ra;
    private String nome;
        
    public Aluno(int ra, String nome){
        
        this.ra = ra;
        this.nome = nome;       
        
    }

   
    public int getRa() {
        return ra;
    }

   
    public void setRa(int ra) {
        this.ra = ra;
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString(){
        
        return "RA: \t" + getRa()+ "\nNome: \t" + getNome()+"\n";
        
    }
}
