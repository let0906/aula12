public class Main {
    public static void main(String[] args) {
        int vavriavel =1;
        String teste = "aaaa" ;
        Aluno aluno1 = new Aluno();

        aluno1.nome ="lando";
        aluno1.curso = "Ti";

                System.out.println("o Aluno"+aluno1.nome+ "esta fazendo curso de "+ aluno1.curso);
                System.out.println("Tem "+ aluno1.faltas+"faltas");

                aluno1.darFaltas(2);
                System.out.println("Tem "+ aluno1.faltas+"faltas");

                aluno1.darFaltas(49);
                System.out.println("Tem "+ aluno1.faltas+"faltas");

                aluno1.darNota(80);
                System.out.println("Tem "+ aluno1.faltas+"faltas");

                aluno1.darNota(50);
                System.out.println("Tem "+ aluno1.faltas+"faltas");


        String teste = "aaaa" ;
        Aluno aluno2 = new Aluno();

        aluno2.nome ="lando";
        aluno2.curso = "Ti";

        System.out.println("o Aluno"+aluno1.nome+ "esta fazendo curso de "+ aluno1.curso);
        System.out.println("Tem "+ aluno1.faltas+"faltas");

        aluno1.darFaltas(2);
        System.out.println("Tem "+ aluno1.faltas+"faltas");

        aluno1.darFaltas(49);
        System.out.println("Tem "+ aluno1.faltas+"faltas");

        aluno1.darNota(80);
        System.out.println("Tem "+ aluno1.faltas+"faltas");

        aluno1.darNota(50);
        System.out.println("Tem "+ aluno1.faltas+"faltas");




    }

}
