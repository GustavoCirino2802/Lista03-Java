public class Imposto {

    public Double vlrDeFab;
    public Double imposto = 0.45;
    public Double distribuidor = 0.28;

    public Double carro(Double vlrDeFab){

        Double vlrImposto = vlrDeFab * imposto;

        Double vlrCarro = vlrImposto + vlrDeFab;

        Double vlrDistribuidor = vlrCarro * distribuidor;

        Double vlrFinal = vlrCarro + vlrDistribuidor;
        return vlrFinal;
}
}