public class Documento
{
    //variaveis
    private Documento next;
    private String titulo;
    private int id;
    private int paginas;

    /**
     * Construtor
     * @param titulo titulo do job
     * @param id id do job
     * @param paginas numero de paginas
     */
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

    public int getPaginas() {
        return paginas;
    }

}
