
package metordenacaopesquisa;

import Pessoas.Aluno;


public class Ordenar {
    
    public static void OrganizarListaSelectionSort(Aluno vetAluno[]){
          
          int i, j, minIndex, temp, comp = 0;
          
          for(i= 0; i < vetAluno.length; i++){
              minIndex = i;
              
              for(j = i+1; j < vetAluno.length; j++){
                  
                  if(vetAluno[j].getRa() < vetAluno[minIndex].getRa()){
                      minIndex = j;
                  }
              }    
                  if(minIndex !=i){
                      temp = i;
                      vetAluno[i] = vetAluno[minIndex];
                      vetAluno[minIndex] = vetAluno[temp];
                      
                  }
              
          }
                       
        
      }
    
}
