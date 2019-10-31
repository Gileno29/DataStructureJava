package structure;

import auxiliar.Aluno;
import auxiliar.No;

public class pilhaGilenoLista {
	private No topo;
	private No ultimo;
	private int tamanho;
	
	
	public pilhaGilenoLista() {
		this.tamanho=-1;
		this.topo=null;
		this.ultimo=null;
	}
	public void inserir(Aluno aluno) {
		No novo = new No();
		if(isEmpty()) {
			this.ultimo=novo;
		}
		novo.setInformacao(aluno);
		novo.setProximono(topo);
		topo = novo;  
		System.out.println(this.topo.getInformacao());
	     tamanho ++;
		
	}
	public void remover() {
		if(isEmpty()) { 
			System.out.println("Pilha Vazia");
		}else{
			topo=topo.getProximono();
			tamanho--;
			
		}
	}
	public void exibir() {
		int i=0;
		
		No aux= this.topo;
		while(aux!=null){
			System.out.println(aux.getInformacao());
			aux=aux.getProximono();
			i++;
			
		}
		
	}
	public boolean isEmpty() {
		if(this.tamanho==-1)
			return true;
		return false;
	}

}
