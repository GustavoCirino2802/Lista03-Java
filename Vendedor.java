public class Vendedor{

    public String nome;
    public Double salario;
    public Double venda;

    public Double comissao (Double salario, Double vendas){
        Double porcento = (venda * 0.15);
        return salario + porcento;
    }
}