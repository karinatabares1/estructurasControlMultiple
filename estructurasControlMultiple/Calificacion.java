package estructurasControlMultiple;

public class Calificacion {
    public static void main(String[] args) {
        int calificacion = 85;

        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 80) {
            System.out.println("Bueno");
        } else if (calificacion >= 70) {
            System.out.println("Regular");
        } else if (calificacion >= 60) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Insuficiente");
        }
    }
}
