package auxiliar;

public class No{
   private Aluno informacao;
   private No proximono;

    public Aluno getInformacao() {
        return informacao;
    }

    public No getProximono() {
        return proximono;
    }

    public void setInformacao(Aluno informacao) {
        this.informacao = informacao;
    }

    public void setProximono(No proximono) {
        this.proximono = proximono;
    }
   
}
