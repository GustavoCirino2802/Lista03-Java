public class Idade {
    public Integer idade;

    public String verificar(Integer idade){
        if (idade>=18){
            return "Maior de Idade";
        } else{
            return "Menor de idade";
        }
    }


}
