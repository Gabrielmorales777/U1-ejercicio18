
public class MembresiaGimnasio {

    private String dniSocio;
    private String nombreCompleto;
    private boolean cuotaAlDia;


    public MembresiaGimnasio(String dniSocio, String nombreCompleto) {
        this.dniSocio = dniSocio;
        this.nombreCompleto = nombreCompleto;
        this.cuotaAlDia = false;
    }


    public void pagarCuota() {
        cuotaAlDia = true;
    }


    public void registrarVencimiento() {
        cuotaAlDia = false;
    }


    public void mostrarInformacion() {
        System.out.println("DNI del socio: " + dniSocio);
        System.out.println("Nombre completo: " + nombreCompleto);

        if (cuotaAlDia) {
            System.out.println("Estado de la cuota: Al día");
        } else {
            System.out.println("Estado de la cuota: Pendiente");
        }
    }
}
