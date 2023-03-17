/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estdatos;

import java.util.Random;
import javax.swing.JOptionPane;

import static proyecto.estdatos.ProyectoEstDatos.i;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class RealizarPagos {

    public static void serviciopublico() {
        String dato;
        Date date = new Date();
        
        if (i == 10) {
            JOptionPane.showMessageDialog(null, "**Vectores llenos, favor de inicializar nuevamente**", "ERROR", JOptionPane.ERROR_MESSAGE);
            Menu.menu();
        }
        
        //Hora
        Variables.horaFormateada[i] =  Variables.horaActual.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        //Fecha
        Variables.fecha[i] = Variables.formateadorFecha.format(date);
        
        
        String[] tipo = {"Electricidad", "Teléfono", "Agua"};
        Variables.cedula[i] = (JOptionPane.showInputDialog(null, "Ingrese su numero de cedula"));
        Variables.nombre[i] = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        Variables.apellido1[i] = JOptionPane.showInputDialog(null, "Ingrese su primer apellido");
        Variables.apellido2[i] = JOptionPane.showInputDialog(null, "Ingrese su segundo apellido");
        Variables.numfac = (int) (Math.random() * 1000 + 1);

        Random random = new Random();

        Variables.caja = random.nextInt(3);
        Variables.cajav[i] = Variables.caja;

        String opciones = "                           Pago de Servicios Públicos                            \n";
        
        opciones += "\n";
        opciones += "Número de pago: " + i + " \n"; // + Pago 
        opciones += "Hora:   " + Variables.horaFormateada[i] + "                                  Fecha:   " + Variables.fecha[i] ;
        opciones += "\n";
        opciones += "Cédula: " + Variables.cedula[i] + "                         Nombre: " + Variables.nombre[i] + "\n";
        opciones += "Apellido 1:   " + Variables.apellido1[i] + "                               Apellido 2: " + Variables.apellido2[i] + "\n";
        opciones += "\n";
        opciones += "\n";
        opciones += "                        ¿Desea continuar a pagar S/N?                        \n\n";
        opciones += "grupo 6 ";

        dato = JOptionPane.showInputDialog(opciones);
        dato = dato.toLowerCase().trim();

        if (dato.equals("s")) {
            Variables.servicio = JOptionPane.showOptionDialog(null, "Seleccióne el servicio que desea pagar", "Tipo de dato", 0, 3, null, tipo, 2);
            Variables.servicio++;

            if (Variables.servicio == 1) {
                Variables.tipo[i] = Variables.servicio;
                Variables.montopagar[i] = (Math.round(Math.random() * 20000 + 5000));
                Variables.comision[i] = (Variables.montopagar[i] * 0.04);
            }
            if (Variables.servicio == 2) {
                Variables.tipo[i] = Variables.servicio;
                Variables.montopagar[i] = (Math.round(Math.random() * 20000 + 5000));
                Variables.comision[i] = (Variables.montopagar[i] * 0.055);
            }
            if (Variables.servicio == 3) {
                Variables.tipo[i] = Variables.servicio;
                Variables.montopagar[i] = (Math.round(Math.random() * 20000 + 5000));
                Variables.comision[i] = (Variables.montopagar[i] * 0.065);
            }

            Variables.montodeducido = Variables.montopagar[i] - Variables.comision[i];

            while (true) {
                Variables.montopagado[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Monto a cancelar de " + Variables.montopagar[i] + "\nDigite con cuanto va a cancelar:"));
                if (Variables.montopagado[i] < Variables.montopagar[i]) {
                    JOptionPane.showMessageDialog(null, "**Monto digitado es menor al monto requerido**", dato, i);
                } else {
                    break;
                }
            }
            Variables.vuelto = Variables.montopagado[i] - Variables.montopagar[i];
            Variables.numfactura[i] = i;
            
            
           JOptionPane.showMessageDialog(null, "**** Pago Realizado Con Exito ****");

            

        } else {
            i--;
            JOptionPane.showMessageDialog(null, "**Volviendo al Menu principal**");
        }
        
        i++;

    }

}
