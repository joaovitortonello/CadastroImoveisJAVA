/*  
    PROGRAMA EM JAVA, NESTE PROJETO VISUALIZAMOS O DESENVOLVIMENTO DE UM REQUISITO, AONDE FOI DEFINIDO NO PRODUCT BACKLOG 
    E IMPLEMENTADO EM UMA SPRINT, AQUI VEMOS ELE CRIANDO O NOME DO PROPIETÁRIO, NÚMERO DO IMÓVEL, NÚMERO DE QUARTOS, O VALOR
    QUE O PROPIETÁRIO DESEJA RECEBER E A TAXA NA QUAL A SEGURADORA COBRA PARA ALOCAR, ISSO OCORRE PELA INTERAÇÃO E DEFINIÇÃO 
    ENTRE OBJETOS POR ISSO CHAMAMOS DE PROGRAMAÇÃO ORIENTADO A OBJETOS.

*/

/* BIBLIOTECA PARA UTILIZAÇÃO DA FUNÇÃO SCANNER */

import java.util.Scanner;

/*  FUNÇÃO MAIN, SERIA A 'MATRIZ' DO CÓDIGO, FORMA PRINCIPAL */

public class App {

    public static void main(String[] args) {

        /* ESSA FUNÇÃO SCANNER PARA LER A ENTRADA DO TECLADO*/

        Scanner leitor = new Scanner(System.in);

        /* VAI PEDIR O NÚMERO DE IMÓVEIS QUE DESEJA CADASTRAR, LOGO EM SEGUIDA ALOCAR MEMÓRIA EM CADA OBJETO*/

        System.out.println("Informe quantos imóveis deseja cadastrar: ");

        int qtde = leitor.nextInt();

        Proprietario[] proprietario = new Proprietario[qtde];

        ContratoLocacao[] contratoLocacao = new ContratoLocacao[qtde];

        Imovel[] imovel = new Imovel[qtde];

        /* USANDO LAÇO DE REPETIÇÃO 'FOR' PARA CRIAR TODOS OS CADASTROS, USANDO INTERAÇÃO DO USUÁRIO COM O SISTEMA IN/OUT */

        for (int i = 0; i < qtde; i++) {

            proprietario[i] = new Proprietario();

            imovel[i] = new Imovel();

            contratoLocacao[i] = new ContratoLocacao(0);

            System.out.println("========== Cadastro Imóvel ========== ");

            System.out.println("CONTA ID [" + i + "]");

            System.out.println("Informe o nome do propietário: ");

            leitor.nextLine(); // limpar buffer

            proprietario[i].setNome(leitor.nextLine());
            
            System.out.println("Informe o número do imóvel: ");

            imovel[i].setNumero(leitor.nextInt());

            System.out.println("Informe o número de quartos do imóvel: ");

            imovel[i].setNroquartos(leitor.nextInt());

            System.out.println("Informe o Valor do líquido do aluguel (Valor que o propietário deseja receber): ");

            contratoLocacao[i].setValorAluguel(leitor.nextFloat());

            System.out.println("Informe a taxa da corretora sobre o imóvel (Valor na qual a corretora recebe): ");

            contratoLocacao[i].setTaxaLocacao(leitor.nextFloat());

            contratoLocacao[i].calcularContrato(contratoLocacao[i].taxaLocacao);

        }

        /* LIMPAR TERMINAL */

        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* IMPRESSÃO DETALHADA DOS IMÓVEIS */

        for (int i = 0; i < qtde; i++) {

            System.out.println("========== DETALHES DO IMÓVEL ==========");

            System.out.println("CONTA ID [" + i + "]");

            System.out.println("Nome: " + proprietario[i].getNome());

            System.out.println("Número imóvel: " +imovel[i].getNumero());

            System.out.println("Número de quartos: " +imovel[i].getNroquartos());

            System.out.println("Valor do aluguel, já com a taxa: " +contratoLocacao[i].getValor());

            System.out.println("Situação: " +contratoLocacao[i].getSituacao());

        }

    }

}