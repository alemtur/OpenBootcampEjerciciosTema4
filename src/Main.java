public class Main {
    public static void main(String[] args) {
        
        //Ejercicio con IF
        int numeroIf=-1;
        if (numeroIf==0) {
            System.out.println("El número es igual a 0");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo");
        }
        else {
            System.out.println("El número es negativo");
        }

        //Ejercicio While
        int numeroWhile=0;
        while (numeroWhile<3){
            System.out.println("El valor del número es: " + numeroWhile);
            numeroWhile++;
        }


        //Ejercicio Do While
        do {
            System.out.println("El valor del número es: " + numeroWhile);
            numeroWhile++;
        }while (numeroWhile<3);


        //Ejercicio For
        for (int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println("numeroFor es igual a: " + numeroFor);
        }


        //Ejercicio Case
        var estacion="VERANO";
        switch (estacion) {
            case "VERANO":
                System.out.println("Es VERANO");
                break;
            case "OTOÑO":
                System.out.println("Es OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("Es INVIERNO");
                break;
            case "PRIMAVERA":
                System.out.println("Es PRIMAVERA");
                break;
            default:
                System.out.println("No se introdujo una estación válida.");
        }

    }
}