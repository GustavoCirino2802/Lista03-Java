public class Aluno {
    
    public String nome;
    public Double[] notas = new Double[3];
    
    public Double notaFinal(Double[] notas) {
        double notaFinal = 0;
        for (int i = 0; i < 3; i++) {
            notaFinal += notas[i] / 3;
        }
        return notaFinal;
    }
}

