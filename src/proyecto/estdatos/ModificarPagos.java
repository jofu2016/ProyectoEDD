
package proyecto.estdatos;

import javax.swing.JOptionPane;

public class ModificarPagos {

    public static void serviciopublico() {

        int i = 0;
        String dato;
        boolean t = false;
        boolean obs = true;

        while (true) {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es la factura que desea modificar?"));

            for (int j = 0; j < 10; j++) {
                if (Variables.numfactura[j] == num && Variables.montopagar[j] > 0) {
                    obs = false;
                    String op = "                           Sistema para Pago de Servicios Publicos                           \n";
                   
                    op += "\n";
                    op += "Número de pago: " + Variables.numfactura[num] + " \n"; // + Pago 
                    op += "A- Hora: " + Variables.horaFormateada[num] + "                                  B -Fecha: " + Variables.fecha[num];
                    op += "\n";
                    op += "C-Cédula: " + Variables.cedula[num] + "                       D- Nombre: " + Variables.nombre[num] + "\n";
                    op += "E-Apellido 1: " + Variables.apellido1[num] + "                              F- Apellido 2: " + Variables.apellido2[num] + "\n";
                    op += "\n";
                    op += "G-Tipo de Servicio: " + Variables.tipo[num];
                    op += "\n";
                    op += "H-Número de factura: " + Variables.numfac + "                    Monto a pagar: " + Variables.montopagar[num] + " \n";
                    op += "Comisión autorizada: " + Variables.comision[num] + "                   I- Paga con: " + Variables.montopagado[num] + " \n";
                    op += "Monto deducido: " + Variables.montodeducido + "                             Vuelto: " + Variables.vuelto + " \n";
                    op += "\n";
                    op += "                        ¿Desea continuar a modificar S/N?                        \n\n";
                    op += "grupo 6 ";
                    
                    dato = JOptionPane.showInputDialog(op);
                    dato = dato.toLowerCase().trim();

                    if (dato.equals("s")) {
                        Imprimir2(dato, num, t);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "**Regresando al menú principal**");
                        Menu.menu();

                    }
                }
            }

            if (obs) {
                JOptionPane.showMessageDialog(null, "**La factura ingresada no existe**", "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
            }

        }

    }

    public static void Imprimir2(String s, int num, boolean t) {

        String[] tipo = {"Electricidad", "Teléfono", "Agua"};

        do {
            String modificar = JOptionPane.showInputDialog("**Seleccione la opción a modificar** \n" + "A- Hora: " + Variables.horaFormateada[num] + "\nB- Fecha: " + Variables.fecha[num] + "\nC- Cédula: " + Variables.cedula[num] + "\nD- Nombre: "
                    + Variables.nombre[num] + "\n" + "E- Apellido 1: " + Variables.apellido1[num] + "\nF- Apellido 2: " + Variables.apellido2[num] + "\n" + "G- Tipo de Servicio: " + Variables.tipo[num] + "\nH- Número de factura: " + Variables.numfac
                    + "\nI- Paga con: " + Variables.montopagado[num] + "\n\n");
            modificar = modificar.toLowerCase().trim();

            if (modificar.equals("a")) {
                String hora = JOptionPane.showInputDialog("¿Desea cambiar la hora? Formato: hh:mm:ss ");
                JOptionPane.showMessageDialog(null, "**Hora anterior: " + Variables.horaFormateada[num] + " Hora deseada: " + hora, "Confirmación", JOptionPane.OK_OPTION);
                Variables.horaFormateada[num] = hora;

            }

            if (modificar.equals("b")) {
                String fecha = JOptionPane.showInputDialog("¿Desea cambiar la fecha? Formato: dd/MM/yyyy");
                JOptionPane.showMessageDialog(null, "**Fecha anterior: " + Variables.fecha[num] + " Fecha deseada: " + fecha, "Confirmación", JOptionPane.OK_OPTION);
                Variables.fecha[num] = fecha;

            }

            if (modificar.equals("c")) {
                String cedula = JOptionPane.showInputDialog("¿Desea cambiar la cédula?");
                JOptionPane.showMessageDialog(null, "**Cédula anterior: " + Variables.cedula[num] + " Cédula cambiada a : " + cedula, "Confirmación", JOptionPane.OK_OPTION);
                Variables.cedula[num] = cedula;
            }
            if (modificar.equals("d")) {
                String nombre = JOptionPane.showInputDialog("¿Desea cambiar el Nombre?");
                JOptionPane.showMessageDialog(null, "**Nombre anterior: " + Variables.nombre[num] + " Nombre cambiado a: " + nombre, "Confirmación", JOptionPane.OK_OPTION);
                Variables.nombre[num] = nombre;

            }
            if (modificar.equals("e")) {
                String apellido1 = JOptionPane.showInputDialog("¿Desea cambiar el primer apellido?");
                JOptionPane.showMessageDialog(null, "**Primer apellido anterior: " + Variables.apellido1[num] + "  Primer apellido cambiado a: " + apellido1, "Confirmación", JOptionPane.OK_OPTION);
                Variables.apellido1[num] = apellido1;

            }
            if (modificar.equals("f")) {
                String apellido2 = JOptionPane.showInputDialog("¿Desea cambiar el segundo apellido?");
                JOptionPane.showMessageDialog(null, "**Segundo apellido anterior: " + Variables.apellido2[num] + " Segundo apellido cambiado a : " + apellido2, "Confirmación", JOptionPane.OK_OPTION);
                Variables.apellido2[num] = apellido2;

            }
            if (modificar.equals("g")) {
                int servicio = JOptionPane.showOptionDialog(null, "Seleccióne el servicio que desea pagar: ", "Tipo de dato", 0, 3, null, tipo, 2);
                servicio++;
                JOptionPane.showMessageDialog(null, "    [1- Electricidad   2-Teléfono    3-Agua]   \n"
                        + "**Servicio anterior: " + Variables.tipo[num] + " ││ Servicio deseado: " + servicio, "Confirmación", JOptionPane.OK_OPTION);
                Variables.tipo[num] = servicio;
            }

            if (modificar.equals("h")) {
                int numfactur = Integer.parseInt(JOptionPane.showInputDialog("¿Desea cambiar el numero de factura?"));
                JOptionPane.showMessageDialog(null, "**Número de factura anterior: " + Variables.numfac + " Número de factura a sido cambiado a : " + numfactur, "Confirmación", JOptionPane.OK_OPTION);
                Variables.numfac = numfactur;

            }

            if (modificar.equals("i")) {
                double pagarc;
                while (true) {
                    pagarc = Double.parseDouble(JOptionPane.showInputDialog(null, "Monto a cancelar de: " + Variables.montopagar[num] + "\nDigite con cuanto va a cancelar:"));
                    if (pagarc < Variables.montopagar[num]) {
                        JOptionPane.showMessageDialog(null, "**Monto digitado es menor al monto requerido**", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        break;
                    }
                }

                JOptionPane.showMessageDialog(null, "**Pago anterior: " + Variables.montopagado[num] + " Monto pagado a sido cambiado a : " + pagarc, "Confirmación", JOptionPane.OK_OPTION);
                Variables.montopagado[num] = pagarc;

            }

            JOptionPane.showMessageDialog(null, " *** Factura De Pago Modificada Con Exito *** ");

           
            s = s.toLowerCase().trim();

            if (s.equals("n")) {
                t = true;
                JOptionPane.showMessageDialog(null, "*** Volviendo al menú principal ***");
                Menu.menu();
            }

        } while (t == false);

    }

}
