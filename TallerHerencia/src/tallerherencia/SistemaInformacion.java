package tallerherencia;

import javax.swing.JOptionPane;

public class SistemaInformacion {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        int opcion = 0;
        Persona sistemaInformacion = new Persona();
        
        try {
//Usamos la herencia de la superclase para acceder a los
//métodos de lectura de datos
            do {
                opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción: " + "\n" 
                                                               +"   1 para procesar los datos del empleado"+ "\n" 
                                                               +"   2 para procesar los datos del estudiante"+"\n"
                                                               +"   3 para salir");
                if (opcion == 1) {
                    JOptionPane.showMessageDialog(null, "Procesando datos del empleado");
                    Empleado manejadorEmpleado = new Empleado();
//Leemos los datos
                    manejadorEmpleado = manejadorEmpleado.ingresarDatosEmpleado();
//Mostramos el reporte de datos
                    manejadorEmpleado.imprimirReporteEstadoEmpleado();
                    } else if (opcion == 2) {
                    JOptionPane.showMessageDialog(null, "Procesando datos del estudiante");
                    Estudiante estu = new Estudiante();
                    estu=estu.ingresarDstosEstudiante();
                    estu.imprimirReporteNotasEstudiante();
                    
                } else if (opcion == 3) {
                    JOptionPane.showMessageDialog(null, "Saliendo del Sistema");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                }
            } while (opcion <= 1 || opcion >= 3);//fin del do-while
        }//Fin del try
        catch (Exception errorMain) {
            JOptionPane.showMessageDialog(null, "Error en la digitación: ");
            errorMain.printStackTrace();
        }
        /**
         * *****************************
         */
    }

}
