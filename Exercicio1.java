public class Exercicio1 {
    public static void executar() {

        Aluno aluno = new Aluno();

        aluno.nome = Prompt.lerLinha("Digite o nome do aluno:");

        for (int i = 0; i < aluno.notas.length; i++) {
            aluno.notas[i] = Prompt.lerDecimal("Digite a nota da prova " + (i + 1) + " do aluno:");
        }

        double soma = 0;
        for (double nota : aluno.notas) {
            soma += nota;
        }
        double media = soma / aluno.notas.length;

        Prompt.separador();
        Prompt.imprimir("Nome do aluno: " + aluno.nome);
        Prompt.imprimir("Média do aluno: " + media);
        Prompt.separador();
    }
}
