
public class Exercicio11 {
    public static void executar(){
        Sexo mascFem = new Sexo();
    
        for ( int i = 0; i < 56; i++){
            String nome = Prompt.lerLinha("Digite o nome da pessoa " + (i+1) + " :");
    
            char sexo = Prompt.lerCaractere("Digite sexo da pessoa " + (i+1) + " (m para sexo masculino/ f para sexo feminino:)");
            mascFem.contSexo(sexo);
            
            if (sexo == 'm' || sexo ==  'M') {
                Prompt.separador();
                Prompt.imprimir("O Sr " + nome + " é do sexo: Masculino");
                Prompt.separador();
            }
            else if (sexo == 'F' || sexo == 'f') {
                Prompt.separador();
                Prompt.imprimir("A Sra " + nome + " é do sexo: Feminino ");
                Prompt.separador();
            }
    }
    Prompt.imprimir("Total de homens: " + mascFem.qtdMasc);
    Prompt.imprimir("Total de mulheres: " + mascFem.qtdFem);
}
}
