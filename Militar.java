
public class Militar {

    public String nome;
    public char sexo;
    public Integer idade; 
    public String saude;
    public Integer apto = 0;
    public Integer naoApto = 0;

    public String qtdAptos(char sexo, Integer idade, String saude){
        if(sexo == 'M' || sexo == 'm' && idade == 18 && saude.equals("saudavel")){
            apto ++;
            Prompt.separador();
            return "Está apto para cumprir o serviço militar obrigatorio!";
            
        } else {
            naoApto ++;
            Prompt.separador();
            return "Não está apto para cumprir o serviço militar obrigatorio!";
            
        }
    }
}
