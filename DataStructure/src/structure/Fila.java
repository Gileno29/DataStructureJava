package structure;

import auxiliar.Aluno;
import auxiliar.No;

public class Fila {
      private No cabeca = null;
      private No calda = null;
  
    public void inserir(Aluno aluno){
        No NovoNo = new No();
        NovoNo.setInformacao(aluno);
        
        if(cabeca==null){
            cabeca = NovoNo;
        }else{
            calda.setProximono(NovoNo);
        }
            calda = NovoNo;
        
    }
    
    public void remover(){
        if(cabeca == null){
            System.out.println("Lista vazia");
        }else{
            if(cabeca == calda){
                cabeca = null;
                calda =null;
            }else{
                cabeca = cabeca.getProximono();
            }
            
        
        }
    
    }
    
    
      public String toString() {
		String texto = "";
		
		No auxiliar = cabeca;
		No seguinte = null;
		Aluno aluno = null;
		
		while(auxiliar != null) {
			aluno = auxiliar.getInformacao();
			
			texto = texto + aluno.toString() + "\n";
			
			seguinte = auxiliar.getProximono();
			auxiliar = seguinte;
		}
		
		return texto;
	}
  
    
}