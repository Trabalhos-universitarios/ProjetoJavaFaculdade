import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FolhaPagamento {

    public static ArrayList<Funcionario> funcionarios;

    public static void main(String[] args) {
        String color = "\u001B["; // funçãp que permite trocar cor no console

        Locale.setDefault(Locale.US);// permite usuário digitar ponto para separar casas decimais ao inves de vírgulas

        Scanner input = new Scanner(System.in); // entrada de dados

        funcionarios = new ArrayList<Funcionario>();

        // aqui gera um contador para o loop for abaixo
        System.out.print("Digite a quantidade de colaboradores: ");
        int quantFunc = input.nextInt();
        input.nextLine();

        // loop que repede para o usuário inserir os dados de acordo com o contador acima
        for (int i = 0; i < quantFunc; i++) {
            System.out.println("\n**** DIGITE OS DADOS DO " + (i + 1) + "º COLABORADOR ****");

            System.out.print("Tipo: ");
            int tipo = input.nextInt();
            input.nextLine();

            /*
            nesse ponto, o código que o usuário ira inserir é como se fosse um id ou cpf, tem que ser único, por esse motivo eu escolhi
            acrescentar essa função que não deixa inserir um código repetido, o loop irá insistir até o usuário inserir um código que não seja repetido
            ou que não exista na lista
             */
            System.out.print("Código: ");
            int codigo = input.nextInt();
            input.nextLine();
            while (hasCodigo(funcionarios, codigo)) {
                System.out.println(color+"31"+"m"+"*********************** # ERRO! # ************************"+color+"m");
                System.out.println("ESSE CÓDIGO JÁ ESTÁ CADASTRADO DIGITE UM CÓGIGO DIFERENTE ");
                codigo = input.nextInt();
            }
            //String CSI = "\u001B[";

            System.out.print("Tempo de contratação: ");
            int tempoContr = input.nextInt();
            input.nextLine();

            System.out.print("Sálario base: ");
            double salarioBase = input.nextDouble();
            input.nextLine();

            // entrada de dependentes se holver
            System.out.println("\n## QUANTIDADE MÁXIMA DE 5 DEPENDENTES POR COLABORADOR ##");
            System.out.println(color+"36"+"m"+"\n****OBS: Se cadstrar uma quantidade acima da máxima permitida ****" +
                    "\n**** iremos retirar os últimos cadastrados e ficará somente os 5 primeiros ****"+color+"m");
            System.out.print("Digite a quantidade: ");
            int quantDep = input.nextInt();input.nextLine();


            // cria uma lista de dependentes para que sejam adicionados
            ArrayList<Dependente> dependente = new ArrayList<Dependente>();


            System.out.println("Idade dos dependentes!");
            System.out.println(color + "36" + "m"+"*** OBS: serão retirados da lista todas as idades que não se enquadram nas normas ***"+color + "m");
            if (tipo==1)
                System.out.println(color + "32" + "m"+"\nIdade máxima permitida 21 anos!"+color + "m");
            else if (tipo==2)
                System.out.println(color + "32"+"m"+"\nIdade máxima permitida 18 anos!"+color+"m");

            int contador = 0;// cria um contador para o loop "while"
            while (contador < quantDep) {
                System.out.print("\nDigite a idade do " + (contador + 1) + "º dependente: ");
                int idade = input.nextInt();
                input.nextLine();

                // cria um objeto dependente para inserir as idades na classe Dependente
                Dependente dep = new Dependente(idade);

                dependente.add(dep);

                contador++;
            }// fim da entrada de dependentes
            if (tipo == 1) {

                FuncionarioConc funcionario = new FuncionarioConc(tipo, codigo, tempoContr, salarioBase);

                // inclui os dependente na classe, primeiro faz o teste lógico na classe mãe, no método incluir dependente
                // se estiver tudo ok os dependentes serão inclusos na classe.
                for (Dependente dep : dependente) {
                    funcionario.incluirDependente(dep);

                }
                // fim da associação de dependentes para os funcionários concursado
                funcionarios.add(funcionario);

            } else if (tipo == 2) {

                FuncionarioTemp funcionario = new FuncionarioTemp(tipo, codigo, tempoContr, salarioBase);


                for (Dependente dep : dependente) {
                    funcionario.incluirDependente(dep);

                }
                // fim da associação de dependentes para os funcionários temporários
                funcionarios.add(funcionario);
            }
        }
        input.close(); // fecha entrada de dados

        // imprime todos os dados inseridos pela entrada padrão na tela
        for (Funcionario funcionario : funcionarios)
            funcionario.saidaDeDados();
    }
    // faz a verificação se o código não é repetido, se for ele retorna verdadeiro e executa o loop while no ponto específico do código
    public static boolean hasCodigo(List<Funcionario> list, int codigo) {
        Funcionario func = list.stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);
        return func != null;
    }
}