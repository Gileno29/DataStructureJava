package structure;
import auxiliar.Aluno;
import auxiliar.No;

public class ListaEncadeada {
    private No primeiro;
    private int tamanho = 0;
   
    
    public ListaEncadeada() {
    	this.primeiro=null;
    }
    public boolean eVazia(){
        if(tamanho == 0){
        return true;
        }
        return false;
    }
    
   //retorna o tamanho da lista
    public int tamanho(){
        return tamanho;
    }
   //mstra o primeiro elemento da Lista
    public No MostraPrimeiro(){
        return primeiro;
    }  
    //insere o aluno
    public void inserir(Aluno al){
        No novoNo = new No();
        novoNo.setInformacao(al);
        novoNo.setProximono(null);
        if(this.primeiro==null) {
        	this.primeiro=novoNo;
        	tamanho++;
        }else {
        	No aux=primeiro;
        	while(aux.getProximono()!=null) {
        		aux=aux.getProximono();	
        	}
        	aux.setProximono(novoNo); 
        }
        
        tamanho ++;
    }
   
   
    
    public Aluno buscar(Aluno al){
    No aux = primeiro;
    while(aux != null){
        if(aux.getInformacao().equals(al)){
           System.out.print(aux.getInformacao());
           break;
        }else{
       
        aux = aux.getProximono();
        }
   
    }
    return null;
}
    	

    public void listar() {
    	No aux= primeiro;
    	while(aux!=null) {
    		System.out.println(aux.getInformacao());
    		aux=aux.getProximono();
    	}
    }
     
public void RemoveDado(Aluno dado){
  No atual;
  No antes;
  if (this.eVazia()){
      System.out.println("lista vazia: "+eVazia());
  }else{   //Caso a lista nao esteja vazia
      atual = primeiro;
      antes = null;
      while (atual != null){
    	  if (atual.getInformacao().equals(dado)) {
    		  if (atual == primeiro) {
    			  if(primeiro.getProximono() != null){
    				  primeiro = primeiro.getProximono();
    				  tamanho --;
    				  break;
    				  }else{
    					  primeiro = null;
    					  tamanho --;
    					  break;
    				  }
    		  }else{
    			  antes.setProximono(atual.getProximono());
    			  tamanho --;
    			  break;
    			  }
    	 }else{
    		 antes = atual;
    		 atual = atual.getProximono();
}
      }
  }
}
}