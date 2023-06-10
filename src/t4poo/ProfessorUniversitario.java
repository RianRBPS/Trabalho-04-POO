package t4poo;

public class ProfessorUniversitario extends Professor {
    public ProfessorUniversitario(String nome, int nTurmas, double salario) {
        super(nome, nTurmas, salario);
    }

    
    public Prova[] elaborarProvas() {
        Prova[] provas = new Prova[3];

        for (int i = 0; i < provas.length; i++) {
            String[] questoes = new String[2];
            questoes[0] = "P" + (i + 1) + "Q1";
            questoes[1] = "P" + (i + 1) + "Q2";
            provas[i] = new Prova(questoes);
        }

        return provas;
    }

}