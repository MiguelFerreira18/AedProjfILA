public class GereFila
{
    private Impressora firstImp;



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
            if(newImp.getIdImp()< firstImp.getIdImp())
            {
                newImp.setNext(firstImp);
                firstImp=newImp;

            }else{
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
            }
        }
    }
    public void insereDocumento(String titulo,int idImp,int idUtilizador,int paginas)
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
                    temp.addDoc(titulo,idUtilizador,paginas);
                }
                temp = temp.getNext();
            }
        }
    }
    public void processaDoc(int idImpressora)
    {
        Impressora temp=firstImp;
        while(temp!=null)
        {
            if(temp.getIdImp() ==idImpressora)
            {
                temp.processDoc();
            }
            temp=temp.getNext();
        }
    }
    public void printImpressoras()
    {
        Impressora temp = firstImp;
        while(temp!=null)
        {
            System.out.println(temp.getIdImp());
            temp = temp.getNext();
        }
    }
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
            temp.printTodosOsDocs();
            System.out.println("___________");
        }
        System.out.println("coisa");
    }
}
