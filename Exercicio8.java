
public class Exercicio8 {
    public static void executar(){
        Aluno aluno = new Aluno();

        aluno.nome = Prompt.lerLinha("Digite o nome do aluno:");

        for (int i = 0; i < 3; i++) {
            aluno.notas[i] = Prompt.lerDecimal("Digite a " + (i + 1) + "  nota do Aluno - " + aluno.nome + " :");
        }

        double notaFinal = aluno.notaFinal(aluno.notas);

        if(notaFinal >= 7){
            Prompt.separador();
            Prompt.imprimir(aluno.nome + " foi aprovado com a média de: " + notaFinal);
            Prompt.separador();
        } else if (notaFinal <=5 ){
            Prompt.separador();
            Prompt.imprimir(aluno.nome + " reprovado com a média de: " + notaFinal);
            Prompt.separador();
        } else if (notaFinal >= 5.1 && notaFinal <=6.9){
            Prompt.separador();
            Prompt.imprimir(aluno.nome + " está de recuperação com a média de: " + notaFinal);
            Prompt.separador();
        }
    }
}
