public class Impressora
{
    //variaveis
    private Impressora next;
    private int idImp;
    private Job first;
    private int jobLimite;

    /**
     * construtor
     * @param idImp id
     */
    public Impressora(int idImp)
    {
        this.idImp = idImp;
        jobLimite = Integer.MAX_VALUE;
    }

    /**
     * construtor
     * @param idImp id
     * @param docLimite limite dos jobs
     */
    public Impressora(int idImp,int docLimite)
    {
        this.idImp = idImp;
        this.jobLimite =docLimite;
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
                System.out.println("não tem jobs");
            }else
            {
                Job temp = first;
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
    public void processJob()
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
        if(jobLimite ==0)
            return;
        if(first==null)
        {
            Job job = new Job(titulo,id,paginas);
            first=job;
            jobLimite--;
        }else
        {
            Job job = new Job(titulo,id,paginas);
            Job temp = first;
            while(temp.getNext()!=null && !temp.getTitulo().equalsIgnoreCase(job.getTitulo()))
            {
                temp=temp.getNext();
            }
            if (temp.getTitulo().equalsIgnoreCase(job.getTitulo()))
            {
                System.out.println("Esse job já existe");
            }else
            {
                if (job.getPaginas() < first.getPaginas())
                {
                    job.setNext(first);
                    first = job;
                    jobLimite--;
                } else
                {
                    temp = first;
                    while (temp.getNext() != null && job.getPaginas() > temp.getNext().getPaginas())
                    {
                        temp = temp.getNext();
                    }
                    if (temp != null && temp.getTitulo() != job.getTitulo()) {
                        job.setNext(temp.getNext());
                        temp.setNext(job);
                        jobLimite--;
                    }
                }//fim do else
            }//fim do else
        }//fim do else
    }//fim do metodo
}//fim da classe
