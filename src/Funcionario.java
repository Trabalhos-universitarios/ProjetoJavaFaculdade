import java.util.ArrayList;

/**
 * @autor Johnny Carvalho - 18:03
 * @create 20/06/2020
 */
public class Funcionario {

    // atributos
    private int tipo, codigo, tempoContrato;
    private double salarioBase;
    public ArrayList<Dependente> dependentes = new ArrayList<Dependente>(); // lista para incluir os dependentes na classe Dependente

    //construtores
    public Funcionario(){

    }
    public Funcionario(int tipo, int codigo, int tempoContrato, double salarioBase) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.tempoContrato = tempoContrato;
        this.salarioBase = salarioBase;
    }

    // métodos de encrementação e encapsulamento getters e setters
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTempoContrato() {
        return tempoContrato;
    }
    public void setTempoContrato(int tempoContrato) {
        this.tempoContrato = tempoContrato;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // metodos de cauculo do salário, cada método está sendo sobrescrito por uma classe filha
    public Double SalarioMensal(){
        return 0.0;
    }
    public Double salarioNovo(){
        return 0.0;
    }

    /*
    método de incluir a cada funcionário, esse método tem como objetivo além de incluir o dependente nos seu respectivo funcionário
    também conferir se a quantidade não excedeu o limite de dependente e se as idades estão dentro da idade máxima permitida
     */
    public boolean incluirDependente(Dependente quant){
        if (dependentes.size()>=5) {// se o número de depentente for maior do que 5 a mensagem aparecerá na tela e retornará falso
            return false;
        }
        else if (this.getTipo()==1&&quant.getIdade()>21){// se o funcionário for concursado a idade não pode ultrapassar 21 anos
            return false;
        }
        else if (this.getTipo()==2&&quant.getIdade()>18){// se o funcionário for concursado a idade não pode ultrapassar 18 anos
            return false;
        }
        // se nenhuma das condições acima forem verdadeiras é sinal de que tanto as idades quanto o
        // limite de dependente por pessoa foi respeitado, nesse caso os dependentes serão
        // acrecentados na lista e o método retornará verdadeiro
        else
            dependentes.add(quant);
        return true;
    }


    /*
    metodo de saida de dados, essa saída de dados está imprmindo oque é comun nas sub classes
    e as sub classes estão sobreescrevendo oque é particular de cada uma nesse método da classe mãe.
     */
    public void saidaDeDados(){// imprime todos os dados que são semelhantes entre as classes filhas
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Código: "+this.getCodigo());
        System.out.println("Tempo de contratação: "+this.getTempoContrato());
        System.out.println(String.format("Salário base: R$ "+"%.2f", salarioBase)); // formata para duas casas decimais

    }
}
