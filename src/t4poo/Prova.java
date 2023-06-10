package t4poo;

public class Prova {
    private String[] questoes;
    private String [] respostas;
    private double nota;

    public Prova(String[] questoes) {
        this.questoes = questoes;  
        this.respostas = new String[questoes.length];
        this.nota = 0;
    }

    public void setQuestoes(String[] questoes) {
        this.questoes = questoes;
    }
    
    public String[] getQuestoes() {
        return questoes;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

	public String [] getRespostas() {
		return respostas;
	}

	public void setRespostas(String [] respostas) {
		this.respostas = respostas;
	}
}