public class Exercicio3{
    public static void executar(){

        Vendedor vendedor = new Vendedor();

        vendedor.nome = Prompt.lerLinha("Digite o nome do vendedor:");
        vendedor.salario = Prompt.lerDecimal("Digite o salario do vendedor:");
        vendedor.venda = Prompt.lerDecimal("Digite quanto esse vendedor vendeu: ");

        Double salarioF = vendedor.comissao(vendedor.salario, vendedor.venda);

        Prompt.imprimir("Salario final do vendedor + 15%:" + salarioF);

    }
}