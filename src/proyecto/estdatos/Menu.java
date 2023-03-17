/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estdatos;

import javax.swing.JOptionPane;

public class Menu {
    public static void  menu() {
        while (true) {
            
            int menuprincipal = Integer.parseInt(JOptionPane.showInputDialog(null, " ** Digite una opcion ** "
                    + "\n 1. Inicializar vectores. "
                    + "\n 2. Realizar Pagos. "
                    + "\n 3. Consultar Pagos. "
                    + "\n 4. Modificar Pagos. "
                    + "\n 5. Eliminar Pagos. "
                    + "\n 6. Submenú Pagos. "
                    + "\n 7. Salida. \n\n"));
            switch (menuprincipal) {//Menu de Servicios Públicos
                case 1:
                    InicializarVectores.serviciopublico();
                    break;
                case 2:
                    RealizarPagos.serviciopublico();
                    break;
                case 3:
                    ConsultarPagos.serviciopublico();
                    break;
                case 4:
                    ModificarPagos.serviciopublico();
                    break;
                case 5:
                    EliminarPagos.serviciopublico();
                    break;
                case 6:
                    SubmenuReportes.serviciopublico();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, " **Saliendo De la App** ");
                    System.exit(0);

            }

        }
}
}
