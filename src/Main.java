import java.util.Scanner;

public class Main
{
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
                            gf.insereDocumento(title,imp, id, numPag);
                            break;
                        case 2:
                            gf.processaDoc(imp);
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
        }
//fim do else
    // fim do metodo
        //    {
//        gf.adicionaImpressora(1);
//        gf.adicionaImpressora(5);
//        gf.adicionaImpressora(3);
//        gf.adicionaImpressora(4);
//        gf.adicionaImpressora(2);
//        gf.adicionaImpressora(6);
//        gf.insereDocumento("casfdoisa",1,10,5);
//        gf.insereDocumento("csdfoisa",2,10,10);
//        gf.insereDocumento("cosdfisa",5,10,15);
//        gf.insereDocumento("coisdfvsdfsa",3,10,20);
//        gf.insereDocumento("cosdcvsdisa",5,10,3);
//
//
//gf.processaDoc(1);
//       gf.printAll();
//       gf.printAll();
        //gf.printImpressoras();
public static void iniciaImp()
{
    gf.adicionaImpressora(1);
    gf.adicionaImpressora(2);
    gf.adicionaImpressora(3);
    gf.adicionaImpressora(4);
    gf.adicionaImpressora(5);
}
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
            }
        }
    }
    public static void impOpc()
    {
        System.out.println("1-Impressora dos alunos");
        System.out.println("2-Impressora dos docentes");
        System.out.println("3-Impressora dos Funcionários dos serviços");
        System.out.println("4-Impressora dos continuos");
        System.out.println("5-Impressora dos Reitores");
    }//fim do metodo
}
