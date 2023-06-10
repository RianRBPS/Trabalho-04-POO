package t4poo;

public class ProfessorDaEducacaoBasica extends Professor {
    public ProfessorDaEducacaoBasica(String nome, int nTurmas, double salario) {
        super(nome, nTurmas, salario);
    }

    @Override
    public Prova[] elaborarProvas() {
    	
    	// Numero de provas
    	int numProvas = 4;
    	// Numero de questoes
        int numQuestoes = 5;
        
    	// Criando uma array com 4 provas
        Prova[] provas = new Prova[numProvas];
        // Iterando por cada uma das provas na array provas       
        for (int i = 0; i < provas.length; i++) {
        	// Criando uma array com 5 questoes  	
            String[] questoes = new String[numQuestoes];
            // Iterando por cada umas das questoes na array questoes         
            for (int j = 0; j < questoes.length; j++) {
            	// Inserindo questoes na array questoes no formato "Pi+1Qj+1"
                questoes[j] = "P" + (i + 1) + "Q" + (j + 1);
            }
            // Inserindo um objeto Prova iniciado com as questoes geradas acima em cada uma posicao da array provas             
            provas[i] = new Prova(questoes);
        }

        return provas;
    }
}
