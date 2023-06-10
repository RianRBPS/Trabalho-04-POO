package t4poo;

public class Principal {
    public static void main(String[] args) {
        
    	Professor maria = new ProfessorUniversitario("Maria", 2, 2000);
        Professor jose = new ProfessorDaEducacaoBasica("Jose", 3, 2000);
        Aluno primeiroAluno = new Aluno("PrimeiroNomedoEstudante", 12345);
        
        Estudante[] pessoasQueEstudam = new Estudante[3];
        
        pessoasQueEstudam[0] = maria;
        pessoasQueEstudam[1] = jose;
        pessoasQueEstudam[2] = primeiroAluno;

        for (Estudante estudante : pessoasQueEstudam) {
        	estudante.estudar();
        }

        Prova[] provasDaFaculdade = maria.elaborarProvas();
        primeiroAluno.fazerProva(provasDaFaculdade[0]);

        double nota = maria.corrigirProva(provasDaFaculdade[0]);
        
        System.out.println("João (primeiroAluno) tirou " + nota + " na prova");
        
        maria.receberSalario(maria.nTurmas);
        jose.receberSalario(jose.nTurmas);
    }
}

