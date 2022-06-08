package lab6.pkg6;

import java.util.Scanner;

public class Lab66 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Auto a1 = new Auto();
        Rueda array[] = new Rueda[4];
        a1.setRuedas(array);
        int opcion, ruedita;
        double mt;

        for (int i = 0; i < array.length; i++) {
            Rueda r1 = new Rueda();
            array[i] = r1;
        }

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("**********************************************");
            System.out.println("                  BIENVENIDO                  ");
            System.out.println("**********************************************");
            System.out.println("Ingrese una opcion");
            System.out.println("1: Avanzar");
            System.out.println("2: Retroceder");
            System.out.println("3: Pichadura ");
            System.out.println("4: Rueda desinflada");
            System.out.println("5: Inflar rueda");
            System.out.println("6: Llenar tanque");
            System.out.println("7: Estado de las ruedas");
            System.out.println("0: SALIR");
            System.out.println("***********************************************");
            System.out.println("");
            System.out.println("");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de metros a avanzar");
                    mt = read.nextDouble();
                    a1.avanzar(mt);
                    continue;
                case 2:
                    System.out.println("Ingrese la cantidad de metros a retroceder");
                    mt = read.nextDouble();
                    a1.retroceder(mt);
                    continue;
                case 3:
                    System.out.println("Ingrese el número de rueda pinchada");
                    ruedita = read.nextInt();
                    array[ruedita-1].pinchar();
                    System.out.println("Rueda número " + ruedita + ",presión: " + array[ruedita-1].getPresion());
                    continue;
                case 4:
                    System.out.println("Ingrese el número de rueda desinflada");
                    ruedita = read.nextInt();
                    array[ruedita-1].desinflar();
                    System.out.println("Rueda número " + ruedita + ",presión: " + array[ruedita-1].getPresion());
                    continue;
                case 5:
                    System.out.println("Ingrese el número de rueda a inflar (1-2-3-4)");
                    ruedita = read.nextInt();
                    array[ruedita-1].inflar();
                    System.out.println("Rueda número " + ruedita + ",presión: " + array[ruedita-1].getPresion());
                    continue;
                case 6:
                    a1.LlenarTanque();
                    continue;
                case 7:
                    for(int i=0;i<array.length;i++){
                        System.out.println(array[i].toString(i));
                    }
                    continue;
                case 0:
                    System.out.println("***********");
                    System.out.println("   Adios!  ");
                    System.out.println("***********");
                    break;
                default:
                    System.out.println("-------------------------");
                    System.out.println("Opcion ingresada inválida");
                    System.out.println("-------------------------");
            }
        } while (opcion != 0);
    }

}
