package structure;

import auxiliar.Aluno;

public class GilenoFilaComVetor {
	    private int ultimo=0;
	    private int inicio=0;
	    private int tamanho=0;
	    
	    private Aluno[] alunos;
	    
	    public  GilenoFilaComVetor(int tamanho){
	        alunos = new Aluno[tamanho];
	    }
	    public int tamanho(){
	        return tamanho; 
	    }
	    public void aumentarTamanho(){
	        if(ultimo == alunos.length){//se o ultimo for igual ao tamanho do vetor
	           Aluno[] NovosAlunos = new Aluno[alunos.length*2];
	           for(int i= 0;i<alunos.length;i++){
	               NovosAlunos[i] = this.alunos[i];
	           }
	           this.alunos = NovosAlunos;
	            System.out.println("Vetor com tamanho duplicado");
	        }
	    }
	     public String toString() {
			String texto = "";
			for(int i=0; i<ultimo;i++){
	                texto = texto + alunos[i].toString() + "\n";
	                
	                }
			
			return texto;
		}
	     
	        public void inserir(Aluno al){
	            if((this.tamanho !=0) && (tamanho== alunos.length)){
	                this.aumentarTamanho();
	            }
	            alunos[ultimo++] =al;
	            System.out.println(alunos[tamanho]);
	           
	            tamanho++;
	            
	     
	        }
	        
	        public void remover(){
	            if(ultimo == 0){
	                System.out.println("Lista vazia");
	            }else{
	                alunos[inicio] = null;
	                
	                for(int i=1; i<this.quantidade();i++){
	                    alunos[i-1] = alunos[i];
	                }
	                alunos[ultimo--] = null;
	                tamanho --;
	            }
	        }
	        
	        public int quantidade(){
	            return this.tamanho;
	        }
	    
	}


