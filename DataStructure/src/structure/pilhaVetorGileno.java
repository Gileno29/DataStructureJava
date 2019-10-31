package structure;

import auxiliar.Aluno;

public class pilhaVetorGileno {
	private int topo=0;
	private int ultimo=0;
	private int tamanho;
	
	Aluno[] alunos= new Aluno[10];
	
	public pilhaVetorGileno( int tamanho){
		this.tamanho=tamanho;
		Aluno[] alunos= new Aluno[tamanho];
		
	}
	
	
	public boolean isEmpty() {
		if(this.ultimo==0) {
			return true;
		}
		return false;
	}
	
	public void inserir(Aluno aluno) {
		if(isEmpty()) {
			alunos[topo]=aluno;
			topo++;
		}else {
			if(topo==alunos.length) {
				aumentarTamanho();
				alunos[topo]=aluno;
				topo++;
			}else {
				alunos[topo]=aluno;
				topo++;
				tamanho++;
			}
		}
		
	}
	
	public void remover(Aluno aluno) {
		alunos[topo]=null;
		topo--;
		
	}
	public void aumentarTamanho() {
		int tamanho2= (alunos.length)*2;
		Aluno[] novaListaDeAlunos= new Aluno[tamanho2];
		for(int i=0; i<alunos.length;i++) {
			novaListaDeAlunos[i]= alunos[i];
			tamanho=tamanho2;
		}
	}
	
	public void exibir() {
		int i;
		for(i=alunos.length-1;i>=0;i--) {
			if(alunos[i]!=null)
				System.out.println(alunos[i]);
			
			
		}
	}
	
		
}
