package tallerherencia;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {

    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;

    public Estudiante() {

    }

    public Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public double calcularPromedio(double promedioMaterias, int numeroMaterias) {
        return promedioMaterias / numeroMaterias;
        
    }

    public double leerNotasEstudiante(int nNotas) {
        double cont = 0;
        for (int i = 0; i < nNotas; i++) {
            double not = Double.parseDouble(JOptionPane.showInputDialog("digite la nota de la meteria " + (i+1)));
            cont = not + cont;
        }
        return cont;
    }

    public Estudiante ingresarDstosEstudiante() {
        Estudiante nuevoEstudiante = new Estudiante();
        //datos basico
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        //datos de notas, nNotas y carnet
        double promedioNotas = 0;
        int numeroMaterias;
        String carnet;
        
        //pedir datos basicos
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
        //pedir datos de notas, nNotas y carnet
        carnet = leerDatoTipoCadena("Ingrese el carnet del estudiante: ");
        numeroMaterias = leerDatoTipoEntero("Ingrese el numero de materias: ");
        promedioNotas = leerNotasEstudiante(numeroMaterias);
        promedioNotas = calcularPromedio(promedioNotas, numeroMaterias);
        //setear datos basicos
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        //setear datos de notas, nNotas y carnet
        nuevoEstudiante.setNumeroMaterias(numeroMaterias);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setPromedioNotas(promedioNotas);
        //return del objeto
        return (nuevoEstudiante);
    }

    public void imprimirReporteNotasEstudiante() {
        imprimirDatosPersona();
        String reporte = "Canet " + carnet + "\n"
                + "Numero de materias " + numeroMaterias + "\n"
                + "Promedio del estudiante " + promedioNotas + "\n";
        JOptionPane.showMessageDialog(null, reporte);
        
    }

}
