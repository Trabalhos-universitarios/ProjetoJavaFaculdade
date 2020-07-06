/**
 * @autor Johnny Carvalho - 18:04
 * @create 20/06/2020
 */
public class FuncionarioConc extends Funcionario{
    String color = "\u001B["; // funçãp que permite trocar cor no console

// ssh-keygen -t rsa -b 4096 -C "johnnycarvalhoem@gmail.com"
    // atributos como não havia necessidade não foram criados

    //construtores
    public FuncionarioConc(int tipo, int codigo, int tempoContrato, double salarioBase) {
        super(tipo, codigo, tempoContrato, salarioBase);
    }
    // getter e setter, como não havia necessidade não foram criados

    // caucula salário mensal sem dependente
    @Override
    public Double SalarioMensal(){
        return this.getSalarioBase()+this.getTempoContrato()*200;

    }

    //caucula o salário novo com dependente
    @Override
    public Double salarioNovo(){
        return (SalarioMensal()+dependentes.size()*100);
    }

    // inclui os dados que não são comuns entre as filhas, esses dados são acrescentado na super classe
    @Override
    public void saidaDeDados(){
        System.out.println();
        System.out.println(color+"36"+"m"+"***** FUNCIONÁRIO CONCURSADO *****"+color+"m");
        super.saidaDeDados();
        System.out.println(String.format("Salário mensal: R$ "+"%.2f", SalarioMensal())); // formata para duas casas decimais
        System.out.println("Quantidade de dependentes: "+ dependentes.size());
        for (Dependente dependente : this.dependentes) {
            System.out.println("Idade dependente: [" + dependente.idade+"] ");

        }
        double cauculaSalario = 0;
        for (Dependente dependente : this.dependentes){
            cauculaSalario = cauculaSalario * dependentes.size();
        }
        System.out.print("Sálario mensal atualizado é: R$ ");
        System.out.println(color+"32"+"m"+String.format("%.2f" ,salarioNovo())+color+"m"); // formata para duas casas decimais e pinta o valor numérico de verde
        System.out.println();
    }

}
