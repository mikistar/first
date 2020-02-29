package miko;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Jestem Mikołaj");

        int rok = 2008;
        String roks = "2008";

//        String val = JOptionPane.showInputDialog("Podaj liczbe");
//        int wart = Integer.parseInt(val);
//
//        System.out.println("Podałeś " + wart);
//        JOptionPane.showMessageDialog(null, "Podałeś " + val + " i " + wart);

        String rokUrodzenia = JOptionPane.showInputDialog("w którym roku sie urodziles");
        int roku = Integer.parseInt(rokUrodzenia);
        int lat = 2020 - roku;
        JOptionPane.showMessageDialog(null, "masz " + lat + " lat");
    }

    static void ciasta(){
        int ciast = Integer.parseInt(JOptionPane.showInputDialog("Ile ciast"));
        for (int i = 1; i <= ciast; i++) {
            JOptionPane.showMessageDialog(null, "Podaj moje " + i + " ciasto");
        }
    }
}
