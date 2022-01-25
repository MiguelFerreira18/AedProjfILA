public class GereFila  {
    //varivaveis
    private Impressora firstImp;

    /**
     * metodo para adicionar uma impressora
     * @param id id atribuido a uma impressora
     */
    public void adicionaImpressora(int id)
    {
        Impressora newImp = new Impressora(id);
        if(firstImp ==null)
        {
            firstImp = newImp;
        }
        else
        {
            Impressora temp = firstImp;
            if(newImp.getIdImp() < firstImp.getIdImp())
            {
                newImp.setNext(firstImp);
                firstImp=newImp;
            }else
            {
                while (temp.getNext() != null && newImp.getIdImp() > temp.getNext().getIdImp())
                {
                    temp = temp.getNext();
                }
                if (temp.getNext() != null)
                {
                    newImp.setNext(temp.getNext());
                    temp.setNext(newImp);

                }else
                {
                    temp.setNext(newImp);
                }
            } //fim do else
        }//fim do else
    }//fim do metodo

    /**
     * Este metodo insere um job na impressora
     * @param titulo
     * @param idImp
     * @param idUtilizador
     * @param paginas
     */
    public void insereJob(String titulo, int idImp, int idUtilizador, int paginas)
    {
        if(firstImp==null)
        {
            System.out.println("AS IMPRESSORAS NÃO ESTÃO A FUNCIONAR");
        }else
        {
            Impressora temp = firstImp;
            while(temp!=null)
            {
                if(temp.getIdImp()==idImp)
                {
                    temp.addJob(titulo,idUtilizador,paginas);
                }
                temp = temp.getNext();
            }//fim do while
        }//fim do else
    }//fim do metodo

    /**
     * metodo para processar jobs
     * @param idImpressora id da impressora a encontrar
     */
    public void processaJob(int idImpressora)
    {
        Impressora temp=firstImp;
        while(temp!=null)
        {
            if(temp.getIdImp() ==idImpressora)
            {
                temp.processJob();
            }
            temp=temp.getNext();
        }//fim do while
    }//fim do metodo

    /**
     * Este metodo imprime todos os jobs de uma impressora
     * @param idImp id da impressora a encontrar
     */
    public void printAll(int idImp)
    {
        Impressora temp = firstImp;
        while(temp!=null && idImp !=temp.getIdImp())
        {
            temp=temp.getNext();
        }
        if(temp.getIdImp()==idImp)
        {
            System.out.println(temp.getIdImp() + ":");
            temp.printTodosOsJobs();
            System.out.println("______________________________________________ ");
        }
    }//fim do metodo
}//fim da classe
