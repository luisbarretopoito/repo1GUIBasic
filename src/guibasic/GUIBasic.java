/*
 * Introducción a la Interface Gráfica de Usuario
 */
package guibasic;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class GUIBasic {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Name"); //Nombre de usuario
        JOptionPane.showMessageDialog(null, "Your name is " + name);

        String lastname = JOptionPane.showInputDialog("Lastname"); //Apellido de usuario
        JOptionPane.showMessageDialog(null, "Your Lastname is " + lastname);

        String country = JOptionPane.showInputDialog("Where are you from?"); //Procedencia
        JOptionPane.showMessageDialog(null, "You are from " + country);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Age")); //Edad
        JOptionPane.showInternalMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Tall")); //Altura 
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

    }

}
