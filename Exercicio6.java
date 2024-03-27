
public class Exercicio6{
    public static void executar(){
        Produto produto = new Produto();

        produto.valor = Prompt.lerDecimal("Digite o valor da venda do produto:");
        produto.vlrPorcentagem = Prompt.lerDecimal("Digite o acrescimo porcentuaal:");

        Double valorFinal = produto.acrescimo(produto.valor, produto.vlrPorcentagem);

        Prompt.separador();
        Prompt.imprimir("O valor final com o acrescimo do porcentual:" + valorFinal);
        Prompt.separador();
    }
}
