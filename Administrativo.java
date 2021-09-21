/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecelagem;

/**
 *
 * @author Beatriz
 */
public class Administrativo extends Funcionario {
    int qtdFaltas;

    public Administrativo(String nome, String RG, double salarioBase) {
        super(nome, RG, salarioBase);
        qtdFaltas = 0;
    }

    @Override
    public double salarioLiquido() {
        return (salarioBase) - (qtdFaltas) * (salarioBase/30);
    }

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println(
            "Desconto do Salario: " + (qtdFaltas) * (salarioBase/30) + "\n"
            + "Salario Líquido: " + salarioLiquido() + "\n"
        );
    }

    @Override
    public void novoMes() {
        qtdFaltas = 0;
    }
    
    public void registrarFalta() {
        qtdFaltas++;
    }
    
}
