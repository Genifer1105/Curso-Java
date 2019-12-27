/*
Si trabaja 40 horas o menos se le paga $16 por hora
si trabaja más de 40 horas se le paga %16 por cada hora de las primeras 40 y $20 
por cada hora extra
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author genifer.moreno
 */
public class SalarioSemanal {
    
    public static void main(String[] args) {
    
    int horasTrabajadas, salario;
    
    horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Cuántas horas trabajo"));
    
    if (horasTrabajadas <= 40) {
       salario = horasTrabajadas * 16;
    } 
    else {
        salario = (40*16) + ((horasTrabajadas-40) * 20);
    }
      JOptionPane.showMessageDialog(null, "Su salario es" + salario);
    }
}
