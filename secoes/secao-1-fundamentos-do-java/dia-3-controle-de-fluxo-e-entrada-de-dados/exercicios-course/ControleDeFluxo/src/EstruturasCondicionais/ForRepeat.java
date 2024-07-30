package EstruturasCondicionais;

public class ForRepeat {
    public static  void main(String[] args) {
        int numero;
        String log;

        for (numero = 1; numero <= 10; numero += 1) {
            log = "O número atual é: " + numero + "\n";
            System.out.println(log);
        }

        String[] alunos = {"MARCOS", "ALINE", "LUCAS", "PATRICIA", "RODRIGO"};
        String log2;

        int totalAlunos = alunos.length;

        log2 = "A lista de chamadas possui " + totalAlunos + " alunos\n";

        int matricula;
        for (int posicao = 0; posicao < totalAlunos; posicao++) {
            matricula = posicao + 1;
            log = "Matrícula: " + matricula + " Aluno: " + alunos[posicao] + "\n";
            System.out.println(log);
        }
    }
}
