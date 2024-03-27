public class Exercicio4{

    public static void executar(){

        Dolar real = new Dolar();

        real.cotacaoDolar = Prompt.lerDecimal("Digite a cotação do dolar:");
        real.quantDolar = Prompt.lerDecimal("Digite a quantidade de dinheiro em dolar:");

        Double valorReal = real.real(real.quantDolar, real.cotacaoDolar);

        Prompt.separador();
        Prompt.imprimir("Conversão em reais: "  + valorReal);
        Prompt.separador();
    }
}