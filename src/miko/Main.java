package miko;

import javax.swing.*;

public class Main {

    static int[] dniMies = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        System.out.println("Jestem Mikołaj");

//        String val = JOptionPane.showInputDialog("Podaj liczbe");
//        int wart = Integer.parseInt(val);
//
//        System.out.println("Podałeś " + wart);
//        JOptionPane.showMessageDialog(null, "Podałeś " + val + " i " + wart);

        ileDoKonca();
//        roku();
//        int latu = roku();
//        long seku = odPoczątkuNE();
//        JOptionPane.showMessageDialog(null, "minęło " + seku + " sekund od początku naszej ery");
    }

    static int ileDoKonca(){
        int dzien = Integer.parseInt(JOptionPane.showInputDialog("Podaj dzień miesiąca"));
        int miesiac = Integer.parseInt(JOptionPane.showInputDialog("Podaj miesiąc"));;

        int dni = 0;
        for (int i = 0; i < miesiac - 1; i++) {
            dni = dni + dniMies[i];
        }
        dni = dni + dzien;
        dni = 365 - dni;
        JOptionPane.showMessageDialog(null, "Do końca  roku jest " + dni + " dni");
        return dni;
    }

    static long odPoczątkuNE(){
        int godzina = Integer.parseInt(JOptionPane.showInputDialog("Podaj godzinę"));
        int dzien = Integer.parseInt(JOptionPane.showInputDialog("Podaj dzień miesiąca"));
        int miesiac = Integer.parseInt(JOptionPane.showInputDialog("Podaj miesiąc"));;
        int rok = Integer.parseInt(JOptionPane.showInputDialog("Podaj rok"));;

        int dni = 0;
        for (int i = 0; i < miesiac - 1; i++) {
            dni = dni + dniMies[i];
        }
        dni = dni + dzien;
        dni = dni + (rok-1)*365;
        int godziny =  godzina + (dni-1) * 24;
        JOptionPane.showMessageDialog(null, "Upłynęło " + dni + " dni od początku naszej ery");
        JOptionPane.showMessageDialog(null, "Upłynęło " + godziny + " godzin od początku naszej ery");
        JOptionPane.showMessageDialog(null, "Upłynęło " + godziny*3600L + " sekund od początku naszej ery");
        return godziny*3600L;
    }
    static int roku(){
        String rokUrodzenia = JOptionPane.showInputDialog("w którym roku sie urodziles");
        int roku = Integer.parseInt(rokUrodzenia);
        int lat = 2020 - roku;
        JOptionPane.showMessageDialog(null, "masz " + lat + " lat");
        return roku;
    }

    static void ciasta(){
        int ciast = Integer.parseInt(JOptionPane.showInputDialog("Ile ciast"));
        for (int i = 1; i <= ciast; i++) {
            JOptionPane.showMessageDialog(null, "Podaj moje " + i + " ciasto");

        }
    }
}
