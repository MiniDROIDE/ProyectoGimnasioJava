public class Gimnasio {
    private String nombre;
    private String[] actividades = {"Yoga", "Boxeo", "Funcional"};

    public Gimnasio(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombre + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }

    public void registrarUsuario(String usuario, int edad) {
        if (edad >= 18) {
            System.out.println("Usuario " + usuario + " registrado en el gimnasio " + nombre + ".");
        } else {
            System.out.println("Lo sentimos, " + usuario + " no puede registrarse porque es menor de edad.");
        }
    }

    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        miGimnasio.mostrarActividades();
        
        // Ejemplo de registro de usuarios
        miGimnasio.registrarUsuario("Juan Perez", 16); // Menor de edad
        miGimnasio.registrarUsuario("Maria Gomez", 22); // Mayor de edad
    }
}
