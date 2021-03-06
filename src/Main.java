import java.util.Scanner;

public class Main{
    static GereFila gf = new GereFila();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        iniciaImp();
            impOpc();
            System.out.println("-------------------------");
            System.out.print("Escolha uma impressora:");
            int imp = in.nextInt();
            while(imp<1 || imp>5)
            {
                System.out.println("Escolha uma impressora dentro das possiveis:");
                imp = in.nextInt();
            }
            System.out.println("-------------------------");
                impMenu(imp);
                System.out.println("-------------------------");
                System.out.print("Qual ação deseja fazer:");
                int opDentroDaImp = in.nextInt();
                while (opDentroDaImp > 0 && imp != 0)
                {
                    switch (opDentroDaImp)
                    {
                        case 1:
                            System.out.print("titulo:");
                            String title = in.next();
                            System.out.print("id:");
                            int id = in.nextInt();
                            System.out.print("Paginas:");
                            int numPag = in.nextInt();
                            gf.insereJob(title,imp, id, numPag);
                            break;
                        case 2:
                            gf.processaJob(imp);
                            break;
                        case 3:
                            gf.printAll(imp);
                            break;
                        case 4:
                            impOpc();
                            System.out.println("-------------------------");
                            System.out.println("Escolha uma impressora:");
                            imp = in.nextInt();
                            while(imp<1 || imp>5)
                            {
                                System.out.println("Escolha uma impressora dentro das possiveis:");
                                imp = in.nextInt();
                            }
                            break;
                        default:
                            System.out.println("Essa opção não existe, selecione outra!");
                            System.out.println("-------------------------");
                            break;
                    }
                            impMenu(imp);
                            System.out.println("Qual ação deseja fazer");
                            opDentroDaImp = in.nextInt();
                }
    }//fim do metodo main
public static void iniciaImp()
{
    gf.adicionaImpressora(1);
    gf.adicionaImpressora(2);
    gf.adicionaImpressora(3);
    gf.adicionaImpressora(4);
    gf.adicionaImpressora(5);
}//fim metodo
    public static void impMenu(int imp)
    {
        if(imp==0 || imp>5)
            return;
        else
        {
            switch(imp)
            {
                case 1:
                    System.out.println("Impressora dos Alunos:");
                    System.out.println("1-Adiciona job");
                    System.out.println("2-Imprimir job com menos paginas");
                    System.out.println("3-Imprimir todos os jobs");
                    System.out.println("4-Sair da impressora");
                    System.out.println("0-Sair do programa");
                    break;
                case 2:
                    System.out.println("Impressora dos docentes:");
                    System.out.println("1-adiciona job");
                    System.out.println("2-imprimir job com menos paginas");
                    System.out.println("3-imprimir todos os jobs");
                    System.out.println("4-Sair da impressora");
                    System.out.println("0-Sair do programa");
                    break;
                case 3:
                    System.out.println("Impressora dos Funcionários dos serviços:");
                    System.out.println("1-Adiciona job");
                    System.out.println("2-Imprimir job com menos paginas");
                    System.out.println("3-Imprimir todos os jobs");
                    System.out.println("4-Sair da impressora");
                    System.out.println("0-Sair do programa");
                    break;
                case 4:
                    System.out.println("Impressora dos Continuos:");
                    System.out.println("1-Adiciona job");
                    System.out.println("2-Imprimir job com menos paginas");
                    System.out.println("3-Imprimir todos os jobs");
                    System.out.println("4-Sair da impressora");
                    System.out.println("0-Sair do programa");
                    break;
                case 5:
                    System.out.println("Impressora dos Reitores:");
                    System.out.println("1-Adiciona job");
                    System.out.println("2-Imprimir job com menos paginas");
                    System.out.println("3-Imprimir todos os jobs");
                    System.out.println("4-Sair da impressora");
                    System.out.println("0-Sair do programa");
                    break;
            }//fim do switch
        }//fim do else
    }//fim do metodo
    public static void impOpc()
    {
        System.out.println("1-Impressora dos alunos");
        System.out.println("2-Impressora dos docentes");
        System.out.println("3-Impressora dos Funcionários dos serviços");
        System.out.println("4-Impressora dos continuos");
        System.out.println("5-Impressora dos Reitores");
    }//fim do metodo
}//fim da classe
