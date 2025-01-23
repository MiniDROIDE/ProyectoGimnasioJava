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

    public void registrarUsuario(String usuario) {
        System.out.println("Usuario " + usuario + " registrado en el gimnasio " + nombre + ".");
    }

    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        miGimnasio.mostrarActividades();
        miGimnasio.registrarUsuario("Juan Perez");

        Cafeteria miCafeteria = new Cafeteria("FitLife Cafe");
        miCafeteria.mostrarMenu();
        miCafeteria.atenderCliente("Juan Perez");
    }
}

class Cafeteria {
    private String nombre;
    private String[] menu = {"Café", "Té verde", "Smoothie de frutas", "Barrita energética"};

    public Cafeteria(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarMenu() {
        System.out.println("Menú disponible en la cafetería " + nombre + ":");
        for (String item : menu) {
            System.out.println("- " + item);
        }
    }

    public void atenderCliente(String cliente) {
        System.out.println("Atendiendo al cliente " + cliente + " en la cafetería " + nombre + ".");
    }
}
