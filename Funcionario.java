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
public abstract class Funcionario {

    public Funcionario(String nome, String RG, double salarioBase) {
        this.nome = nome;
        this.RG = RG;
        this.salarioBase = salarioBase;
    }
    
    String nome;
    String RG;
    double salarioBase;
    
    public abstract double salarioLiquido();
    
    public void hollerith() {
        System.out.println("Nome: " + nome + "\n"
         + "RG: " + RG + "\n"
         + "Salário Base: " + salarioBase + "\n"
        );
    }
    
    public abstract void novoMes();
}
