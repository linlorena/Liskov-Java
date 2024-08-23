public class CursoPresencial extends Curso {
  private String local;

  public CursoPresencial(String nome, String descricao, String local) {
    super(nome, descricao);
    this.local = local;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  @Override
  public void iniciarCurso() {
    System.out.println("Iniciando curso presencial em: " + local);
  }

  @Override
  public String toString() {
    return super.toString() + ", Local: " + local;
  }
}
