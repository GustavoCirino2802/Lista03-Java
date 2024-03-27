public class Exercicio7 {
    public static void executar(){
        Imposto carro = new Imposto();

        carro.vlrDeFab = Prompt.lerDecimal("Digite o valor do carro:");

        double vlrFinal = carro.carro(carro.vlrDeFab);

        Prompt.separador();
        Prompt.imprimir("Valor final do carro com o acréscimo dos impostos: " + vlrFinal);
        Prompt.separador();

    }
}
