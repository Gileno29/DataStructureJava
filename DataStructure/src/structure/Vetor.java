package structure;

import auxiliar.Aluno;
import auxiliar.ElementoInexistente;
import auxiliar.EstruturaCheia;
import auxiliar.PosicaoInexistente;
import auxiliar.PosicaoVazia;
import auxiliar.VetorInterface;


public class Vetor implements VetorInterface{
	private Aluno[] alunos;
	private Aluno  aux[]= new Aluno[10];
	
	
	public Vetor(int tamanho) {
		alunos = new Aluno[tamanho];
	}
	

	
	public void inserir(Aluno aluno) throws EstruturaCheia {
		boolean arrayCheio=true;
		for(int i=0; i<this.alunos.length; i++) {
			if(this.alunos[i]==null) {
				this.alunos[i]=aluno;
				arrayCheio=false;
				break;
			}
		}
		if(arrayCheio)
			throw new EstruturaCheia();
	}

	
	public void inserir(Aluno aluno, int indice) throws EstruturaCheia, PosicaoInexistente {
		boolean arrayCheio=true;
		boolean existe=false;
		int i= 0;
		while(i<this.alunos.length) {
			if(this.alunos[i]==null) { 
				arrayCheio=false;
				break;
			}
			i++;
		}			
		if(!arrayCheio) {
			int j=0;
			while(j<this.alunos.length) {
				if(indice==j) {//testa se o i
					existe=true;
					break;
					}
				j++;
			}
		}
		if(!existe) {
			throw new PosicaoInexistente();
		}
		if(!arrayCheio) {
			if(existe) {
				int t= 0;	
				if(this.alunos[indice]!=null) {
					for(t=0; t<alunos.length;t++) {
						if(alunos[t]==null) {
							alunos[t]=alunos[indice];
							alunos[indice]=aluno;
							break;
						}
					}
				}else {
					this.alunos[indice]=aluno;
				}
			}
			}else{
				throw new EstruturaCheia();
		}
	}

	
	public Aluno buscar(int indice) throws PosicaoInexistente, PosicaoVazia {
		boolean vazia= false;
		boolean inexistente= true;
		
		for(int i= 0;i<this.alunos.length; i++){ 
			if(indice==i) {
				if(this.alunos[indice]==null) 
					vazia= true;
					inexistente=false;
					break;
		}
	}
	if(vazia)  
			throw new PosicaoVazia();
	else  
		System.out.println(this.alunos[indice]);
	
		if(inexistente) 
			throw new PosicaoInexistente();
		return null;
}
	


	
	public int buscar(Aluno aluno) throws ElementoInexistente {
		boolean noElement=true;
		aux[0]=aluno;
		
		for(int i= 0;i<this.alunos.length; i++){ 
			if(this.alunos[i]!=null) {
				if(this.alunos[i].equals(aluno)) {
					System.out.println("O aluno "+this.alunos[i]+" Foi encontrado na Posição "+i);
					noElement=false;
					break;
			}
			}
		}
		if(noElement) {
			System.out.print("Entrou Oporra");
			throw new ElementoInexistente();
		}
		return 0;
	}
	@Override
	public void remover(int indice) throws PosicaoInexistente, PosicaoVazia {
		boolean vazia=false;
		boolean inexistente= true;
		int i=0;
		while(i<this.alunos.length) {
			if(indice==i) {
				//System.out.println("Entrei no primeiro laço");
				inexistente=false;
				if(this.alunos[indice]==null)		
					vazia=true;
			}
			i++;
		}
		if(!inexistente) {
			if(!vazia) {
				/*System.out.println(this.alunos[indice]);
				System.out.println("===================");*/
				this.alunos[indice]=null;
				/*System.out.println(this.alunos[indice]);
				System.out.println("===================");*/
			for(i=0; i<(this.alunos.length)-1;i++) {
				if(this.alunos[i]==null){
					//System.out.println("Entrei na vez numero "+i);
					this.aux[i]=this.alunos[i];
					this.alunos[i]=this.alunos[i+1];
					this.alunos[i+1]=this.aux[i];
				}
			}
			}else {
				throw new PosicaoVazia();
			}
		}else {
			throw new PosicaoInexistente();
		}
	}
	
	public void remover(Aluno aluno) throws ElementoInexistente {
		
	}
	
}


