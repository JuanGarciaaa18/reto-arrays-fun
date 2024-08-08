public class CalificacionesEstudiantes {
    public static void main(String[] args) {

        String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};
        String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};
        double[][] notas = {
                {8.5, 7.0, 9.0, 8.0, 7.5},  // Notas de Ana
                {7.0, 6.5, 8.0, 9.0, 8.5},  // Notas de Carlos
                {9.5, 9.0, 9.5, 8.5, 9.0},  // Notas de Sofía
                {6.0, 7.0, 7.5, 8.0, 7.0},  // Notas de David
                {8.0, 8.5, 7.5, 9.0, 8.5}   // Notas de Elena
        };

        // Mostramos la información de los estudiantes
        mostrarInformacionEstudiantes(estudiantes, materias, notas);

        // Calculamos y mostramos los promedios de cada estudiante
        calcularPromedios(estudiantes, notas);

        // Encontramos y mostramos al estudiante con el promedio más alto
        encontrarMejorEstudiante(estudiantes, notas);

        // Encontramos y mostramos la materia con el promedio más alto
        encontrarMejorMateria(materias, notas);
    }

    public static void mostrarInformacionEstudiantes(String[] estudiantes, String[] materias, double[][] notas) {
        for (int x = 0; x < estudiantes.length; x++) {
            System.out.print(estudiantes[x] + ": "+ "\n");
            for (int i = 0; i < materias.length; i++) {
                System.out.print(materias[i] + "=" + notas[x][i] + " \n");
            }
            System.out.println();
        }
    }

    public static void calcularPromedios(String[] estudiantes, double[][] notas) {
        System.out.println("\nPromedios de los estudiantes:");

        for (int x = 0; x < estudiantes.length; x++) {
            System.out.print(estudiantes[x] + ": ");

            double suma=0;
            for (double nota : notas[x]) suma += nota;
            System.out.println(estudiantes[x] + ": " + suma / notas[x].length);
        }
    }

    public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {
        System.out.println("\n");

        int mejorestudiante = 0;
        double mejorPromedio = 0;

        for (int x= 0; x < estudiantes.length; x++) {
            double suma = 0;
            for (double nota : notas[x]) suma += nota;
            double promedio = suma / notas[x].length;

            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorestudiante = x;
            }
        }

        System.out.println("Mejor estudiante: " + estudiantes[mejorestudiante] + " con promedio " + mejorPromedio);
    }

    public static void encontrarMejorMateria(String[] materias, double[][] notas) {
        int mejormateria = 0;
        double mejorPromedio = 0;

        for (int x = 0; x < materias.length; x++) {
            double suma = 0;
            for (double[] nota : notas) suma += nota[x];
            double promedio = suma / notas.length;

            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejormateria = x;
            }
        }

        System.out.println("Mejor materia: " + materias[mejormateria] + " con promedio " + mejorPromedio);
    }
}


