package structure;

import auxiliar.Aluno;
import auxiliar.No;

public class Pilha {
    private No topo = null;
    private No ultimo = null;
    private int quantidade = 0;
    
    public int quan(){
    return quantidade;
    }
    
    public void inserir(Aluno aluno){ 
       No NovoNo = new No();//objeto da classe No
       if(this.isEmpty()){//testa se a pilha está vazia
           this.ultimo = NovoNo;
       }
       NovoNo.setInformacao(aluno);
       NovoNo.setProximono(topo);
      // anterior = topo;
       topo = NovoNo;  
       quantidade ++;
    }
    
    public boolean isEmpty(){
        if(topo == null){
            return true;
        }
        return false;
    }
    
    public No ultimo(){
     return ultimo;
    }
    
    public void remover(){
        if(topo.getInformacao().equals(null)){
            System.out.println("Pilha vazia");
        }else{
           topo = topo.getProximono();
           quantidade--;
           //anterior = anterior.getProximo();
            //topo = anterior;
            //topo.setProximo(anterior);
            
        }
    }
    
    
    
         public String toString() {
		String texto = "";
		
		No auxiliar = topo;
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
