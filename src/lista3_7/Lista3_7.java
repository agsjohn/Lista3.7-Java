package lista3_7;

import javax.swing.JOptionPane;

public class Lista3_7 {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor: "));
        int cem=0, cinquenta=0, dez=0, cinco=0, um=0;
        int valorTotal = valor;
        cem = valor / 100;
        valor -= (cem * 100);
        cinquenta = valor / 50;
        valor -= (cinquenta * 50);
        dez = valor / 10;
        valor -= (dez * 10);
        cinco = valor / 5;
        valor -= (cinco * 5);
        um = valor;
        JOptionPane.showMessageDialog(null, "Valor total: " +valorTotal+ "\nNotas de cem: " +cem+ "\nNotas de cinquenta: " 
                +cinquenta+ "\nNotas de dez: " +dez+ "\nNotas de cinco: " +cinco+ "\nNotas de um: " +um);
    }
}
