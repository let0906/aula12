public class Aluno {
    String nome;
    String curso;
    int faltas;
    int Nota;

    public void darFaltas(int numFaltas) {
        if (faltas <= 50) {
            faltas += numFaltas;

        } else {
            System.out.println("o aluno estorou em faltas");
        }
    }


        public void darNota ( int nota){

            this.Nota = nota;

    }
}
