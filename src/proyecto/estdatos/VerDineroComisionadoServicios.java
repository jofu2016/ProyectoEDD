package proyecto.estdatos;

import javax.swing.JOptionPane;

public class VerDineroComisionadoServicios {

    public static void submenureportes() {

        int contElec = 0;
        int sumaElec = 0;
        int contTel = 0;
        int sumaTel = 0;
        int contAg = 0;
        int sumaAg = 0;
        int contador = 0;
        int suma = 0;
        
        
        String opciones = "                                 Sistema para Pago de Servicios Publicos                    \n";
        opciones += "\n";
        opciones += "#ITEM                                Cant. Transacciones                         Total Comisionado\n";
        opciones += "===============================================================\n";

        for (int i = 0; i < 10; i++) {
            if (Variables.montopagar[i] > 0) {
                if (Variables.tipo[i] == 1) {
                    contElec++;
                    sumaElec += Variables.comision[i];
                    suma += Variables.comision[i];
                    contador++;
                    
                }
                if (Variables.tipo[i] == 2) {
                    contTel++;
                    sumaTel += Variables.comision[i];
                    suma += Variables.comision[i];
                    contador++;
                }
                if (Variables.tipo[i] == 3) {
                    contAg++;
                    sumaAg += Variables.comision[i];
                    suma += Variables.comision[i];
                    contador++;
                }
            }
        }

        if (contador == 0) {
            opciones += "                                          No hay pagos registrados\n";
        } else {
            opciones += "1-Electricidad                                    " + contElec + "                                             " + sumaElec + "\n";
            opciones += "1-Teléfono                                          " + contTel + "                                             " + sumaTel + "\n";
            opciones += "1-Agua                                                 " + contAg + "                                             " + sumaAg + "\n";
        }

        opciones += "===============================================================\n";
        opciones += "Total de registros: " + contador + "                                                                  Monto Total: " + suma + "\n";
        opciones += "===============================================================\n";

        JOptionPane.showMessageDialog(null, opciones);

    }
}
