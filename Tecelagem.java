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
public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrativo adm = new Administrativo("Rafael", "12354678-4", 145);
        adm.registrarFalta();
        adm.registrarFalta();
        adm.hollerith();
        adm.novoMes();
        adm.hollerith();
        Producao prod = new Producao("Paulo", "12356897-5", 50);
        prod.horaDiurna = 6;
        prod.horaNoturna = 6;
        prod.registrarHorasDiurnas(35);
        prod.registrarHorasNoturnas(25);
        prod.hollerith();
        prod.novoMes();
        prod.hollerith();
        Vendedor ven = new Vendedor("Cris", "12547896-1", 600);
        ven.registrarVenda(2500);
        ven.registrarVenda(3400);
        ven.registrarVenda(250);
        ven.registrarVenda(640);
        ven.hollerith();
        ven.novoMes();
        ven.hollerith();
    }
    
}
