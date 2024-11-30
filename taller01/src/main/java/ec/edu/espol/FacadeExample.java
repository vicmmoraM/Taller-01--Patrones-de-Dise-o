package ec.edu.espol;

public class FacadeExample {
    private void realizarOpPresencial() {
        System.out.println("Operación realizada en el Subsistema Presencial.");
    }

    private void realizarOpWeb() {
        System.out.println("Operación realizada en el Subsistema Web.");
    }

    private void realizarOpMovil() {
        System.out.println("Operación realizada en el Subsistema Móvil.");
    }

    private void realizarOpTelefonico() {
        System.out.println("Operación realizada en el Subsistema Telefónico.");
    }

    public void realizarOp(String tipo) {
        switch (tipo.toLowerCase()) {
            case "presencial":
                realizarOpPresencial();
                break;
            case "web":
                realizarOpWeb();
                break;
            case "movil":
                realizarOpMovil();
                break;
            case "telefonico":
                realizarOpTelefonico();
                break;
            default:
                System.out.println("Tipo de operación no soportado.");
        }
    }
}
