/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

/**
 *
 * @author junior
 */
public class Bolsista extends Aluno {
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno "+this.getName());
    }
    
    // Sobreposicao de metodo
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getName()+" e bolsista! pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

//    @Override
//    public String toString() {
//        return "Bolsista{" + "bolsa=" + bolsa + '}';
//    }
    
}
