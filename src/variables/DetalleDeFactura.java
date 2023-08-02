package variables;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la factura: ");
        String factura = "";
        String inputPrecio1 = "Ingrese el precio del primer producto: ";
        double precioBruto = 0;
        String inputPrecio2 = "Ingrese el precio del segundo producto: ";
        double precio2 = 0;
        double impuesto = 0;
        double totalSinImpuesto = 0;
        double total = 0;

        factura = scanner.next();
        System.out.print(inputPrecio1);
        precioBruto = scanner.nextDouble();
        System.out.print(inputPrecio2);
        precio2 = scanner.nextDouble();

        totalSinImpuesto = precioBruto + precio2;
        impuesto = (precioBruto + precio2) * 0.19;
        total = totalSinImpuesto + impuesto;
        System.out.println("La factura " + factura + " tiene un total bruto de " + totalSinImpuesto + ", con un impuesto de 19% y el monto despues de impuesto es de " + total + ".");
    }
}
