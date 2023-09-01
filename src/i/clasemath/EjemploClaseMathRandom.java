package i.clasemath;

import java.util.Random;

public class EjemploClaseMathRandom {

    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("colores = " + colores[(int)random]);

        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15 + 1); // Para incluir numeros de 15 a 25, se suma y luego se resta, ademas se adiciona uno porque el 25 no es incluido en el rango
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
