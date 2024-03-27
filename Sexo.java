public class Sexo {

    public char sexo;
    public Integer qtdFem = 0;
    public Integer qtdMasc = 0;

    public void contSexo (char sexo){
        if (sexo == 'F'||sexo == 'f'){
            qtdFem ++;
        } else if(sexo=='M'||sexo =='m'){
            qtdMasc ++;
        }
    }
}
