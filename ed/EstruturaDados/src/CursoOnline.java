public class CursoOnline extends Curso {
  private String plataforma;

  public CursoOnline(String nome, String descricao, String plataforma) {
    super(nome, descricao);
    this.plataforma = plataforma;
  }

  public String getPlataforma() {
    return plataforma;
  }

  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  @Override
  public void iniciarCurso() {
    System.out.println("Iniciando curso online na plataforma: " + plataforma);
  }

  @Override
  public String toString() {
    return super.toString() + ", Plataforma: " + plataforma;
  }
}
