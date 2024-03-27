
public class Exercicio13 {

    public static void executar(){

    Militar infos = new Militar();

    Integer qtd = Prompt.lerInteiro("De quantas pessoas quer preencher dados: ");

    for (Integer i = 0; i < qtd; i ++){
        infos.nome = Prompt.lerLinha("Digite o nome da pessoa " + (i+1) + " :");
        infos.sexo = Prompt.lerCaractere("Digite o sexo da pessoa " + (i+1) + " (M para masculino/ F para feminino): ");
        infos.idade = Prompt.lerInteiro("Digite a idade da pessoa " + (i+1) + " :");
        infos.saude = Prompt.lerLinha("Digite a saude da pessoa " + (i+1) + " saudavel ou não saudavel");

        Prompt.imprimir(infos.qtdAptos(infos.sexo, infos.idade, infos.saude));
    }
    Prompt.imprimir("\nQuantidade aptos: " + infos.apto);
    Prompt.imprimir("Quantidade não aptos: " + infos.naoApto);
}
}
