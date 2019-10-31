package principal;

import auxiliar.Aluno;
import structure.GilenoFilaComVetor;
import structure.ListaEncadeada;
import structure.pilhaGilenoLista;
import structure.pilhaVetorGileno;

public class Principal {
	public static void main(String[]args) {

		ListaEncadeada pilha= new ListaEncadeada();
		Aluno gileno = new Aluno("Gileno","25");
		Aluno paulina = new Aluno("Paulina","35625");
		Aluno wallquiria = new Aluno("Walquiria","625");
		Aluno paula = new Aluno("Paula","325");
		Aluno primeiro = new Aluno("primeiro","325");
		
		//Aluno aluno2 = new Aluno();

		pilha.inserir(gileno);
		pilha.inserir(paulina);
		pilha.inserir(wallquiria);
		pilha.inserir(paula);
		pilha.listar();


}
}
