public class Exercicio5{
    public static void executar(){
        LojaMamao item = new LojaMamao();

        item.compra = Prompt.lerDecimal("Digite o valor da compra:");
        Double vlrParcela = item.parcela(item.compra);

        Prompt.separador();
        Prompt.imprimir("O valor das Parcelas é: " + vlrParcela + " R$");
        Prompt.separador();

    }
}