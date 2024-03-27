public class Produto{
    public double valor;
    public double vlrPorcentagem;

    public double acrescimo(double valor, double vlrPorcentagem){
        double porcentagem = (valor * vlrPorcentagem)/100;
        return valor + porcentagem;
    }
}