public class Documento
{
    private Documento next;
    private String titulo;
    private int id;
    private int paginas;

    public Documento(String titulo, int id, int paginas) {
        this.titulo = titulo;
        this.id = id;
        this.paginas = paginas;
    }

    public Documento getNext() {
        return next;
    }

    public void setNext(Documento next) {
        this.next = next;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
