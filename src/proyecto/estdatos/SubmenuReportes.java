/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estdatos;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class SubmenuReportes {

    public static int serviciopublico() {

        while (true) {
            int submenureportes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite una de las opciones"
                    + "\n 1. Ver todos los pagos."
                    + "\n 2. Ver pagos por tipo de servicio."
                    + "\n 3. Ver pagos por código de caja."
                    + "\n 4. Ver dinero comisionado por servicios."
                    + "\n 5. Regresar Menú Principal.\n\n"));
            switch (submenureportes) {
                case 1:
                    VerPagos.submenureportes();
                    break;
                case 2:
                    VerTipoServicio.submenureportes();
                    break;
                case 3:
                    VerCodigoCaja.submenureportes();
                    break;
                case 4:
                    VerDineroComisionadoServicios.submenureportes();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "**Regresando al Menu principal**");
                    return submenureportes;

            }
        }

    }

}//Fin
