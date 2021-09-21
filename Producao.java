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
public class Producao extends Funcionario{
    
    int horaDiurna;
    int horaNoturna;

    public Producao(String nome, String RG, double salarioBase) {
        super(nome, RG, salarioBase);
        horaDiurna = 0;
        horaNoturna = 0;
    }
    
    public void registrarHorasDiurnas(int horas){
        horaDiurna += horas;
    }
    
    public void registrarHorasNoturnas(int horas){
        horaNoturna += horas;
    }
    
    @Override
    public double salarioLiquido() {
        double horaNoturnaTotal = (salarioBase) * 1.3 * (horaNoturna);
        double horaDiurnaTotal = (salarioBase) * (horaDiurna);
        return horaDiurnaTotal + horaNoturnaTotal;
    }

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println(
            "Total de Horas Noturnas: " + (salarioBase) * 1.3 * (horaNoturna) + "\n"
            + "Total de Horas Diurnas: " + (salarioBase) * (horaDiurna) + "\n"
            + "Salário Líquido: " + salarioLiquido() + "\n"
        );
    }
    
    @Override
    public void novoMes() {
        horaDiurna = 0;
        horaNoturna = 0;
    }
    
}
