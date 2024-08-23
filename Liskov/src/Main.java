public class Main {
  public static void main(String[] args) {
    Curso presencial = new CursoPresencial("Curso Java", "Curso de introdução ao Java", "Sala 101");
    Curso online = new CursoOnline("Curso Python", "Curso de introdução ao Python", "Coursera");

    Aluno aluno1 = new Aluno("João Silva", "joao.silva@example.com");
    Aluno aluno2 = new Aluno("Maria Oliveira", "maria.oliveira@example.com");

    System.out.println(presencial);
    presencial.iniciarCurso();

    System.out.println(online);
    online.iniciarCurso();

    System.out.println(aluno1);
    System.out.println(aluno2);
  }
}