
public class Main {

    public static void main(String[] args) {

        MembresiaGimnasio socio = new MembresiaGimnasio(
                "40123456",
                "Gabriel Morales"
        );


        System.out.println("ESTADO INICIAL");
        socio.mostrarInformacion();


        socio.pagarCuota();


        System.out.println("\nESTADO ACTUALIZADO");
        socio.mostrarInformacion();
    }
}

