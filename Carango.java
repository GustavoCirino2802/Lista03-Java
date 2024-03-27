public class Carango {
    
    public double valor;
    public int ano;

    public double vlrDesc() {
        if (ano <= 2000){
            return valor * 0.12;
        } else {
            return valor * 0.07;
        }
    }

    public double vlrCarro() {
        return valor - vlrDesc();
    }
}