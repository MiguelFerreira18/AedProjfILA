public class Impressora
{
    //variaveis
    private Impressora next;
    private int idImp;
    private Documento first;
    private int docLimite;

    /**
     * construtor
     * @param idImp id
     */
    public Impressora(int idImp)
    {
        this.idImp = idImp;
        docLimite = Integer.MAX_VALUE;
    }

    /**
     * construtor
     * @param idImp id
     * @param docLimite limite dos jobs
     */
    public Impressora(int idImp,int docLimite)
    {
        this.idImp = idImp;
        this.docLimite=docLimite;
    }

    public Impressora getNext() {
        return next;
    }

    public void setNext(Impressora next) {
        this.next = next;
    }

    public int getIdImp() {
        return idImp;
    }
    /**
     * Este metodo imprime todos os Jobs
     */
    public void printTodosOsJobs()
    {
        if(first==null)
            {
                System.out.println("não tem documentos");
            }else
            {
                Documento temp = first;
                while(temp!=null)
                {
                    System.out.println(temp.getTitulo()+" tem- " + temp.getPaginas() + " paginas");
                    temp=temp.getNext();
                }
                first=null;
            }//fim do else
    }//fim do metodo

    /**
     * Este metodo processa o job com menos paginas
     */
    public void processDoc()
    {
        if(first==null)
        {
            System.out.println("não existem Documentos");
        }else
        {
            if(first!=null)
            {
                System.out.println(first);
                first=first.getNext();
            }
        }//fim do else
    }//fim do metodo

    /**
     * Este metodo adiciona um job á lista da impressora
     * @param titulo titulo do job
     * @param id  id do job
     * @param paginas numero de paginas do job
     */
    public void addJob(String titulo, int id , int paginas)
    {
        if(docLimite==0)
            return;
        if(first==null)
        {
            Documento doc = new Documento(titulo,id,paginas);
            first=doc;
            docLimite--;
        }else
        {
            Documento doc = new Documento(titulo,id,paginas);
            Documento temp = first;
            while(temp.getNext()!=null && !temp.getTitulo().equalsIgnoreCase(doc.getTitulo()))
            {
                temp=temp.getNext();
            }
            if (temp.getTitulo().equalsIgnoreCase(doc.getTitulo()))
            {
                System.out.println("Esse job já existe");
            }else
            {

                if (doc.getPaginas() < first.getPaginas())
                {
                    doc.setNext(first);
                    first = doc;
                    docLimite--;
                } else
                {
                    temp = first;
                    while (temp.getNext() != null && doc.getPaginas() > temp.getNext().getPaginas())
                    {
                        temp = temp.getNext();
                    }
                    if (temp != null && temp.getTitulo() != doc.getTitulo())
                    {
                        doc.setNext(temp.getNext());
                        temp.setNext(doc);
                        docLimite--;
                    }

                }//fim do else
            }//fim do else
        }//fim do else
    }//fim do metodo
}//fim da classe
