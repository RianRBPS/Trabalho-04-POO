package t4poo;

public class Aluno implements Estudante {
    private String nome;
    private int nMatricula;
    private String[] respostas;

    public Aluno(String nome, int nMatricula) {
        this.nome = nome;
        this.nMatricula = nMatricula;
    }

    public void fazerProva(Prova prova) {
        String[] questoes = prova.getQuestoes();
        String[] respostas = new String[questoes.length];
        for (int i = 0; i < questoes.length; i++) {
            respostas[i] = "R" + (i + 1);
        }
        prova.setRespostas(respostas);
    }
    
    @Override
    public void estudar() {
        System.out.println(nome + " - " + nMatricula + ": Oh vida, quanto estudo!");
    }

	public int getNMatricula() {
		return nMatricula;
	}

	public void setNMatricula(int nMatricula) {
		this.nMatricula = nMatricula;
	}

	public String[] getRespostas() {
		return respostas;
	}

	public void setRespostas(String[] respostas) {
		this.respostas = respostas;
	}
}