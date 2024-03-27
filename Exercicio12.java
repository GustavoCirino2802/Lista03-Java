public class Exercicio12 {
    public static void executar() {
        Carango carro = new Carango();

        char res;
        int carro2000 = 0; 
        int tltCarro = 0; 

        do {
            carro.ano = Prompt.lerInteiro("Qual o ano do carro:");
            carro.valor = Prompt.lerDecimal("Qual o preço do carro:");

            Prompt.separador();
            Prompt.imprimir("O valor do desconto é: " + carro.vlrDesc());
            Prompt.imprimir("O valor final do carro fica: " + carro.vlrCarro() + " R$");
            Prompt.separador();

            if (carro.ano <= 2000) {
                carro2000++;
            }
            tltCarro++;

            Prompt.separador();
            res = Prompt.lerCaractere("Deseja continuar calculando desconto? (S) Sim / (N) Não ");
            Prompt.separador();
        } while (res != 'N' && res != 'n');

        Prompt.separador();
        Prompt.imprimir("Total de carros até o ano 2000: " + carro2000);
        Prompt.imprimir("Total de carros: " + tltCarro);
        Prompt.separador();Prompt.separador();
    }
}
