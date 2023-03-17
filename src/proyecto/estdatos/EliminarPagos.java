/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estdatos;

import javax.swing.JOptionPane;

import static proyecto.estdatos.ProyectoEstDatos.i;

public class EliminarPagos {

    public static void serviciopublico() {

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número de factura a eliminar: "));
        boolean test = true;

        for (int j = 0; j < 10; j++) {
            if (Variables.numfactura[j] == num && Variables.montopagado[j] > 0) {
                int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere eliminar la factura?", "**Confirmación**", JOptionPane.YES_NO_OPTION);

                if (resp == JOptionPane.YES_OPTION) {
                    Variables.numfactura[num] = 0;
                    Variables.fecha[num] = "";
                    Variables.cedula[num] = "";
                    Variables.nombre[num] = "";
                    Variables.apellido1[num] = "";
                    Variables.apellido2[num] = "";
                    Variables.tipo[num] = 0;
                    Variables.montopagar[num] = 0;
                    Variables.montopagado[num] = 0;
                    Variables.cajav[num] = 0;
                    Variables.factura[num] = 0;
                    Variables.comision[num] = 0;
                    JOptionPane.showMessageDialog(null, "**Factura eliminada correctamente**");
                    test = false;
                    i = num;
                    
                    break;
                    
                } else{
                    JOptionPane.showMessageDialog(null, "**Volviendo al menú principal**");
                    test = false;
                    break;
                    
                }
            }
        }

        if (test) {
            JOptionPane.showMessageDialog(null, "**Factura no encontrada, no se han podido eliminar correctamente los datos**");
        }

    }
}
