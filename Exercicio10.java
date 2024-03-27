public class Exercicio10 {
    public static void executar(){
        Idade idadePessoas = new Idade();

        Integer pessoas = Prompt.lerInteiro("Digite a quantidade de pessoas:");

        for(int i = 0; i < pessoas; i++){
            idadePessoas.idade = Prompt.lerInteiro("Digite a idade da pessoa " + (i+1) + " :");
            
            Prompt.separador();
            Prompt.imprimir(idadePessoas.verificar(idadePessoas.idade));
            Prompt.separador();
        }

    }

}
