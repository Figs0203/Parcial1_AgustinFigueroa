public class ObjetosDePersona {

    // Método que se encarga de crear los objetos de la clase persona y ejecutar métodos con ellos
    public static void main(String[] args){
        Persona estu1 = new Persona("David", "Perez", 16, "Cabezón", "Estudiante");
        Persona doce1 = new Persona("Jorge", "Correa", 47, "Jorgito", "Docente");
        Persona admin1 = new Persona("Clara", "Pelaez", 56, "Lala", "Administrativo");

        estu1.imprimir_info();
        admin1.imprimir_info();
        estu1.hablar();
        doce1.hablar();
        admin1.hablar();
        estu1.que_hizo("bañandose", "6AM");
        admin1.que_hizo("Atendiendo una reunion", "4PM");
    }
}
