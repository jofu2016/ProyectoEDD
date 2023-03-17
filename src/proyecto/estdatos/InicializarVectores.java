/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estdatos;

import javax.swing.JOptionPane;
import static proyecto.estdatos.ProyectoEstDatos.i;

public class InicializarVectores {

    public static void serviciopublico() {
        for (int z = 0; z < 10; z++) {
            Variables.nombre[z] = "";
            Variables.cedula[z] = "";
            Variables.apellido1[z] = "";
            Variables.apellido2[z] = "";
            Variables.montopagar[z] = 0;
            Variables.montopagado[z] = 0;
            Variables.cajav[z] = 0;
            Variables.factura[z] = 0;
            Variables.tipo[z] = 0;
            Variables.numfactura[z] = 0;
            Variables.comision[z]  = 0;
            Variables.montodeducido = 0;
            i = 0;

        }
        JOptionPane.showMessageDialog(null, "**** Variables Correctamente Inicializadas ****");
    }

}
