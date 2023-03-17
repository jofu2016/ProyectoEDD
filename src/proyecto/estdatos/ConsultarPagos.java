/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estdatos;

import javax.swing.JOptionPane;

public class ConsultarPagos {

    public static String dato;

    //Hora
    public static void serviciopublico() {

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de factura que desea consultar: "));

        for (int j = 0; j < 10; j++) {
            if (Variables.numfactura[j] == num && Variables.montopagado[j] > 0) {

                String opciones = "                          PAGO SERVICIOS PUBLICOS                        \n";
                opciones += "                                   EL PUNTO PODEROSO                     \n";
                opciones += "\n";
                opciones += "Número de pago:   " + Variables.numfactura[num] + " \n" + " \n"; // + Pago 
                opciones += "                      Dato Encontrado Posicion Vector  " + Variables.numfactura[j] + "\n";
                opciones += " \n";
                opciones += " \n";
                opciones += "                            ¿Desea ver el registro S/N?\n\n";
                opciones += "grupo 6 ";

                dato = JOptionPane.showInputDialog(opciones);
                dato = dato.toLowerCase().trim();

                if (dato.equals("s")) {
                    Imprimir(dato, num);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "**Regresando al menú principal**");
                    break;
                }

            } else {
                if (j == 9) {
                    JOptionPane.showMessageDialog(null, "**Pago no se encuentra registrado**", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
        }
    }

    public static void Imprimir(String s, int num) {

        String op = "                          Sistema para Pago de Servicios Publicos                         \n";
        
        op += "\n";
        op += "\n";
        op += "Número de pago: " + Variables.numfactura[num] + " \n"; // + Pago 
        op += "Hora: " + Variables.horaFormateada[num] + "                                  Fecha: " + Variables.fecha[num];
        op += "\n";
        op += "Cédula: " + Variables.cedula[num] + "                         Nombre: " + Variables.nombre[num] + "\n";
        op += "Apellido 1: " + Variables.apellido1[num] + "                               Apellido 2: " + Variables.apellido2[num] + "\n";
        op += "\n";
        op += "Tipo de Servicio: " + Variables.tipo[num];
        op += "\n";
        op += "Número de factura: " + Variables.numfac + "                    Monto a pagar: " + Variables.montopagar[num] + " \n";
        op += "Comisión autorizada: " + Variables.comision[num] + "                    Paga con: " + Variables.montopagado[num] + " \n";
        op += "Monto deducido: " + Variables.montodeducido + "                             Vuelto: " + Variables.vuelto + " \n";
        op += "\n";
        op += "                        **Pago consultado con éxito**                        \n\n";
        op += "grupo 6 ";
        JOptionPane.showMessageDialog(null, op);
    }

}
