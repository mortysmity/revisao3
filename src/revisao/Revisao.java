/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import javax.swing.JOptionPane;

/**
 *
 * @author Meu Computador
 */
public class Revisao {

    /**
     * A granja Frangotech possui um controle automatizado de cada frango da sua
     * produção. No pé direito do frango há um anel com um chip de
     * identificação; no pé esquerdo são dois anéis para indicar o tipo de
     * alimento que ele deve consumir. Sabendo que o anel com chip custa R$4,00
     * e o anel de alimento custa R$3,50, faça um algoritmo para calcular o
     * gasto total da granja para marcar todos os seus frangos.
     *
     * @param args
     */
    public static void main(String[] args) {
        double chip,frago,gasto;
        chip = 11;
        frago = Double.parseDouble(JOptionPane.showInputDialog("Digite o número das frago"));
        gasto = chip * frago; 
        JOptionPane.showMessageDialog(null, "O resultado da soma é " + gasto);
)
        

    }

}
