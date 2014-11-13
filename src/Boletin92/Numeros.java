package Boletin92;

import javax.swing.JOptionPane;

/* @author dpazolopez*/
public class Numeros {
    private double positivo;
    private double negativo;
    private double cero;
    
    public void ordenarNumeros(){
        for (int cont = 0; cont < 10; cont++) {
        String v= JOptionPane.showInputDialog("Introduce números");
        double valor= Double.parseDouble(v);
        if (valor > 0) {
             positivo++;
      } else if (valor == 0) {
            cero++;
      } else if (valor < 0) {
            negativo++;
}   } }
    public void contarNumeros(){
        JOptionPane.showMessageDialog(null,"Hay "+cero+ "numeros con ceros");
        JOptionPane.showMessageDialog(null,"Hay "+positivo+" numeros positivos");
        JOptionPane.showMessageDialog(null,"Hay "+negativo+" numeros negativos");
    }

}
