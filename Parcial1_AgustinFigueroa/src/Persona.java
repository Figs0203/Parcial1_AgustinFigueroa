public class Persona {

    // Definiendo los atributos (abstracción)
    private String nombre;
    private String apellido;
    private int edad;
    private String apodo;
    private String rol;
    private String universidad;

    // Constructor para la clase persona
    public Persona(String nombre, String apellido, int edad, String apodo, String rol){

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.apodo = apodo;
        this.rol = rol;

        // (Herencia)
        this.universidad = "EAFIT";
    }

    // (Encapsulamiento)
    // Getters y setters para el atributo nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters para el atributo apellido
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Getters y setters para el atributo edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getters y setters para el atributo apodo
    public String getApodo() {
        return apodo;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    // Getters y setters para el atributo rol
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }

    // Metodo imprimir_info, el cual se encarga de imprimir la información de la persona
    public void imprimir_info(){
        System.out.println(this.nombre + " | " + this.apellido + " | " + this.edad + " | " + this.apodo + " | " +
                this.rol + " | " + this.universidad);
    }

    // (Polimorfismo)
    // Metodo hablar, el cual se encarga de decir una línea de dialogo por persona según su rol
    public void hablar(){
        if (this.rol.equals("Estudiante")){
            System.out.println("Soy estudiante de " + this.universidad + ", estudio mucho.");
        }
        else if (this.rol.equals("Docente")){
            System.out.println("Soy profesor, me encanta enseñar.");
        }
        else if (this.rol.equals("Administrativo")){
            System.out.println("Soy administrativo, me gusta la plata.");
        }
        else{
            System.out.println("No se que soy, auxilio!");
        }
    }

    // Metodo que_hizo, el cual se encarga de decir que hizo cierta persona a determinada hora
    public void que_hizo(String accion, String hora){
        System.out.println(this.nombre + " estaba " + accion + " a las " + hora);
    }


}
