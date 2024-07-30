package EstruturasCondicionais;

public class IfElse {
    public  static  void main(String[] args) {
        double mediaFinal = 7.5;
        String resultado = "INDEFINIDO";

        if (mediaFinal >= 7) {
            resultado = "APROVADO";
        } else if (mediaFinal >= 6.0){
            resultado = "REALIZAR PROVA BÔNUS";
        } else {
            resultado = "REPROVADA";
        }
    }
}
