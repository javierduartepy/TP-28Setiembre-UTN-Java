package flotaLogistica;

public class MainFlota {
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[3];

        // Estas tarifas base producen los costos del ejemplo del enunciado.
        flota[0] = new Camion("AA123BB", "Scania", 128500.0 / 285.0, 18.0);
        flota[1] = new Furgoneta(
                "AF456CD", "Mercedes-Benz", 416.6666666666667, true);
        flota[2] = new MotoEnvios("A099XYZ", "Honda", 180.0);

        double costoTotal = 0;

        System.out.println("=== Reporte de Operaciones de Flota ===");

        for (Vehiculo v : flota) {
            double costo = v.calcularCostoViaje(150.0);
            v.mostrarFicha();
            System.out.println("Costo de viaje (150.0 km): $" + costo);
            System.out.println("--------------------------------------------------");

            costoTotal += costo;
        }

        System.out.println("Costo total operativo de la flota: $" + costoTotal);
    }
}
