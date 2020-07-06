
/**
 * @autor Johnny Carvalho - 18:04
 * @create 20/06/2020
 */
public class FuncionarioTemp extends Funcionario{
    String color = "\u001B[";

    // atributos como não havia necessidade não foram criados

    //construtores
    public FuncionarioTemp(int tipo, int codigo, int tempoContrato, double salarioBase) {
        super(tipo, codigo, tempoContrato, salarioBase);
    }


    // getter e setter, como não havia necessidade não foram criados

    @Override
    public Double SalarioMensal(){
        return this.getSalarioBase()+this.getTempoContrato()*15;
    }

    @Override
    public Double salarioNovo(){
        return SalarioMensal()+dependentes.size()*50;
    }

    @Override
    public void saidaDeDados(){
        System.out.println();
        System.out.println(color+"32"+"m"+"***** FUNCIONÁRIO TEMPORÁRIO *****"+color+"m");
        super.saidaDeDados();
        System.out.println(String.format("Salário mensal: R$ "+"%.2f", SalarioMensal())); // formata para duas casas decimais
        System.out.println("Quantidade de dependentes: "+dependentes.size());
        for (Dependente dependente : dependentes){
            System.out.println("Idade dependente: ["+dependente.idade+"]");
        }
        double cauculaSalario = 0;
        for (Dependente dependente : this.dependentes){
            cauculaSalario = cauculaSalario * dependentes.size();
        }
        System.out.print("Sálario mensal atualizado é: R$ ");
        System.out.println(color+"32"+"m"+String.format("%.2f" ,salarioNovo())+color+"m"); // formata para duas casas decimais
        System.out.println();
    }
}
