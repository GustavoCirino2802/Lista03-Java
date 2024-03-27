public class Num {
    public double[] num = new double[80];
    public int contador = 0;

    public int qtdNum(double[] num){
        for (int i = 0; i < 80; i ++){
            num[i] = Prompt.lerDecimal("Digite o" + (i+1) + "número :");
            if(num[i]>=10 && num[i] <=150){
                contador++;
            }
        }
        return contador;
    }

}