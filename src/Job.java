public class Job
{
    //variaveis
    private Job next;
    private String titulo;
    private int id;
    private int paginas;

    /**
     * Construtor
     * @param titulo titulo do job
     * @param id id do job
     * @param paginas numero de paginas
     */
    public Job(String titulo, int id, int paginas) {
        this.titulo = titulo;
        this.id = id;
        this.paginas = paginas;
    }

    public Job getNext() {
        return next;
    }

    public void setNext(Job next) {
        this.next = next;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

}
