public class Exercicio2 {

    public static void executar(){

        Carro carro = new Carro();

        carro.distPerc = Prompt.lerDecimal("Digite quanto foi percorrido em metros: ");
        carro.comb = Prompt.lerDecimal("Digite quanto de combustível foi gasto: ");

        Prompt.imprimir("O Consumo médio do carro é: " + carro.distPerc / carro.comb + " km/l");
        
    }
}
