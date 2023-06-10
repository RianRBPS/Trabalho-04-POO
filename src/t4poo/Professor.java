package t4poo;

public abstract class Professor implements FuncionarioAssalariado, Estudante {
    protected String nome;
    protected int nTurmas;
    protected double salario;

    public Professor(String nome, int nTurmas, double salario) {
        this.nome = nome;
        this.nTurmas = nTurmas;
        this.salario = salario;
    }

    public abstract Prova[] elaborarProvas();
    
    public double corrigirProva(Prova prova) {
        String[] respostas = prova.getRespostas();
        double pontuacaoPorQuestao = 10.0 / respostas.length;
        double pontuacaoTotal = 0;

        for (int i = 0; i < respostas.length; i++) {
            String resposta = respostas[i];
            String respostaCorreta = "R" + (i + 1);

            if (resposta.equals(respostaCorreta)) {
                pontuacaoTotal += pontuacaoPorQuestao;
            }
        }

        prova.setNota(pontuacaoTotal);
        return pontuacaoTotal;
    }
    
    
    public int getNTurmas() {
        return this.nTurmas;
    }

    public void setNTurmas(int nTurmas) {
        this.nTurmas = nTurmas;
    }

    @Override
    public void receberSalario(int nTurmas) {
        double salario = this.salario + (nTurmas * this.salario * 0.05);
        System.out.println(nome + ": Receber salario de R$" + salario);
    }

    @Override
    public void estudar() {
        System.out.println(nome + ": Professor tambem estuda.");
    }
}