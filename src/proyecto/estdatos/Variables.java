/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estdatos;

import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Variables {

    public static String[] nombre = new String[10];
    public static String[] cedula = new String[10];
    public static String[] apellido1 = new String[10];
    public static String[] apellido2 = new String[10];
    public static double[] montopagar = new double[10];
    public static double[] comision = new double[10];
    public static int[] cajav = new int[10];
    public static int[] factura = new int[10];
    public static int[] tipo = new int[10];
    public static int[] numfactura = new int[10];
    public static double[] montopagado  = new double [10];
    public static double montodeducido;
    public static double vuelto;
    public static int servicio ;
    public static int numfac;
    public static int caja;

    //Hora
    public static LocalTime horaActual = LocalTime.now();
    public static String[] horaFormateada = new String[10];

    //Fecha
    public static String[] fecha = new String[10];
    public static SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");

    
    
}
