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
public class Vendedor extends Funcionario{
    
    double valorVendas;

    public Vendedor(String nome, String RG, double salarioBase) {
        super(nome, RG, salarioBase);
        valorVendas = 0;
    }

    @Override
    public double salarioLiquido() {
        return salarioBase + (valorVendas) * 0.03;
    }
    
    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println(
            "Valor das Vendas: " + (valorVendas) + "\n"
            + "Comissão: " + (valorVendas) * 0.03 + "\n"
            + "Salário Líquido: " + salarioLiquido() + "\n"
        );
    }

    @Override
    public void novoMes() {
        valorVendas = 0;
    }
    
    public void registrarVenda(double valor){
        valorVendas += valor;
    }
    
}
