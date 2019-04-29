
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Juegos {
    private static void check(int[] arr, int toCheckValue) {
        // sort given array
        Arrays.sort(arr);

        // check if the specified element
        // is present in the array or not
        // using Binary Search method
        int res = Arrays.binarySearch(arr, toCheckValue);

        boolean test = res > 0 ? true : false;

        // Print the result
        System.out.println("Is " + toCheckValue + " present in the array: " + test);
    }

    public static Jugador jugador1;
    public static Jugador jugador2;
    public static int partidas;
    public static Scanner keyboard = new Scanner(System.in);

    /**
     * pide nombre de jugador, 1 o 2 crea objeto "Jugador" y lo asigna a jugador1 o
     * jugador2
     */
    public static void pideJugador(int numJugador) {
        // pedimos nombre de jugador
        String pregunta = String.format("Nombre para el jugador %d: ", numJugador);
        System.out.println(pregunta);
        String nombre = keyboard.next();
        Jugador j = new Jugador(nombre);

        if (numJugador == 1) {
            Juegos.jugador1 = j;
        } else {
            Juegos.jugador2 = j;
        }
    }

    /**
     * muestra menu de juegos y pide opción
     */
    public static void menu() {
        System.out.println("*******************");
        System.out.println("JUEGOS DISPONIBLES:");
        System.out.println("*******************");
        System.out.println("1: Cara o Cruz");
        System.out.println("2: Piedra, Papel y Tijera");
        System.out.println("3: Ruleta");
        System.out.println("*******************");
        // pedimos opcion de juego, comprobando validez
        int opcion = 0;
        do {
            System.out.print("Introduce juego: ");
            opcion = keyboard.nextInt();
        } while (opcion < 1 || opcion > 3);

        switch (opcion) {
        case 1:
            Juegos.caraCruz();
        case 2:
            Juegos.PiedraPapelTijera();
        case 3:
            Juegos.Ruleta();
            break;
        }
    }

    /**
     * juego caraCruz
     */
    public static void caraCruz() {
        Juegos.pideJugador(1); // solo interviene un jugador en este juego
        Juegos.partidas = 5; // partidas por defecto en este juego

        System.out.println();
        System.out.println("CARA O CRUZ:");
        System.out.println("************");
        System.out.printf("Bienvenido %s!", Juegos.jugador1.nombre);
        System.out.println();
        System.out.printf("Vamos a jugar %d partidas", Juegos.partidas);
        System.out.println();

        Random rnd = new Random();
        // bucle de partidas
        for (int i = 0; i < Juegos.partidas; i++) {
            System.out.print("Cara (C) o cruz(X) ?  ");
            // pedimos apuesta aunque no se utiliza
            String apuesta = keyboard.next();
            // sea cual sea la probabilidad es un 50%...
            // obtenemos un boolean aleatorio
            boolean ganador = rnd.nextBoolean();
            if (ganador) {
                System.out.println(" Has acertado!");
                Juegos.jugador1.ganadas++;
            } else {
                System.out.println(" Lo siento...");
            }
            Juegos.jugador1.partidas++;
        }
        // creamos string con el resumen final de juego y lo mostramos
        String resumen = String.format("Jugador %s, %d partidas, %d ganadas.", Juegos.jugador1.nombre,
                Juegos.jugador1.partidas, Juegos.jugador1.ganadas);
        System.out.println(resumen);
    }

    /**
     * juego Piedra,papel o tijera
     */
    public static void PiedraPapelTijera() {
        Juegos.pideJugador(1); // solo interviene un jugador en este juego
        Juegos.partidas = 10; // partidas por defecto en este juego

        System.out.println();
        System.out.println("Bienvenido a Piedra, papel o tijera:");
        System.out.println("************");
        System.out.printf("Bienvenido %s!", Juegos.jugador1.nombre);
        System.out.println();
        System.out.printf("Vamos a jugar %d partidas", Juegos.partidas);
        System.out.println();

        // bucle de partidas
        for (int i = 0; i < Juegos.partidas; i++) {
            System.out.print("Piedra (1),Papel(2) o tijeras(3) ?  ");
            int mano = keyboard.nextInt();
            Random rand = new Random();
            int Rival = rand.nextInt(3 + 1);
            if (mano == 1) {
                if (Rival == 1) {
                    System.out.println("Super máquina saca piedra. Piedra con piedra = empate pa ti");
                    Juegos.jugador1.partidas++;
                } else if (Rival == 2) {
                    System.out.println("La máquina sacó Papel. Has perdido.");
                    Juegos.jugador1.partidas++;
                } else if (Rival == 3) {
                    System.out.println("La máquina ha sacado tijeras. La has apalizado!");
                    Juegos.jugador1.ganadas++;
                }
            } else if (mano == 2) {
                if (Rival == 1) {
                    System.out.println("La máquina sacó piedra.La has apalizado!");
                    Juegos.jugador1.partidas++;
                } else if (Rival == 2) {
                    System.out.println("Super máquina saca papel. Piedra con piedra = empate pa ti");
                    Juegos.jugador1.partidas++;
                } else if (Rival == 3) {
                    System.out.println("La máquina sacó tijeras. Has perdido.");
                    Juegos.jugador1.ganadas++;
                }
            } else if (mano == 3) {
                if (Rival == 1) {
                    System.out.println("Super máquina saca piedra.Te ha reventado. ");
                    Juegos.jugador1.partidas++;
                } else if (Rival == 2) {
                    System.out.println("La máquina sacó Papel.Le machacas.");
                    Juegos.jugador1.partidas++;
                } else if (Rival == 3) {
                    System.out.println("La máquina ha sacado tijeras.Tijera con tijera = empate pa ti");
                    Juegos.jugador1.ganadas++;
                }
            }
            // pedimos apuesta aunque no se utiliza
            String apuesta = keyboard.next();
            // sea cual sea la probabilidad es un 50%...
            // obtenemos un boolean aleatorio

        }
        // creamos string con el resumen final de juego y lo mostramos
        String resumen = String.format("Jugador %s, %d partidas, %d ganadas.", Juegos.jugador1.nombre,
                Juegos.jugador1.partidas, Juegos.jugador1.ganadas);
        System.out.println(resumen);
    }

    /**
     * juego Ruleta
     */
    public static void Ruleta() {
        Juegos.pideJugador(1); // solo interviene un jugador en este juego
        Juegos.partidas = 5; // partidas por defecto en este juego

        System.out.println();
        System.out.println("Ruleta");
        System.out.println("************");
        System.out.printf("Bienvenido %s!", Juegos.jugador1.nombre);
        System.out.println();
        System.out.printf("Vamos a jugar %d partidas", Juegos.partidas);
        System.out.println();

        Random rnd = new Random();
        int[] rojo = { 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 };
        // bucle de partidas
        int cash = 100;
        while (cash > 0) {
            int numero = rnd.nextInt(37);
            System.out.print("Tienes " + cash + "euros .Cuanto quieres apostar? \n");
            String apuestaescrita = keyboard.next();
            int apuesta = Integer.parseInt(apuestaescrita);
            if (apuesta > cash || apuesta < 0) {
                System.out.println("Lo siento, eres demasiado pobre para apostar eso. Saca dinero PORFAVOR ");
            } else if (apuesta <= cash) {
                System.out.println("Apuestas " + apuesta + "euros");
                System.out.println(
                        "Dime si quieres apostar por pares/impares (1), rojo/negro(2), falta/pasa(3), docenas(4) o numero en concreto(5)?");
                int Decision = keyboard.nextInt();
                if (apuesta == 0) {
                    System.out.println("Vas a apostar 0 euros? Esto es un casino!!!");
                } else if (Decision == 1) {
                    System.out.println("Pares (1) o impares(2)?");
                    int ParesImpares = keyboard.nextInt();
                    if (ParesImpares == 1) {
                        if (numero % 2 == 0) {
                            System.out.println("El numero es " + numero);
                            System.out.println("Muy bien, has acertado! Ganas " + apuesta + "euros. En total tienes "
                                    + (apuesta + cash) + "euros");
                            cash = cash + apuesta;
                        } else {
                            System.out.println("El numero es " + numero);
                            System.out.println(
                                    "Fatal. Has perdido " + apuesta + "euros. Tienes " + (cash - apuesta) + "euros");
                            cash = cash - apuesta;
                        }
                    } else if (ParesImpares == 2) {
                        if (numero % 2 == 1) {
                            System.out.println("El numero es " + numero);
                            System.out.println("Muy bien, has acertado! Ganas " + apuesta + "euros. En total tienes "
                                    + (apuesta + cash) + "euros");
                            cash = cash + apuesta;
                        } else if (numero == 0) {
                            cash = cash - apuesta;
                            System.out.println(
                                    "Ha salido un 0!! Me llevo todo tu dinero y te quedas con " + cash + " euros.");
                        } else {
                            System.out.println("El numero es " + numero);
                            System.out.println(
                                    "Fatal. Has perdido " + apuesta + "euros. Tienes " + (cash - apuesta) + "euros");
                            cash = cash - apuesta;
                        }
                    }
                } else if (Decision == 2) {
                    System.out.println("Rojo(1) o Negro(2)?");
                    int RojoNegro = keyboard.nextInt();
                    if (RojoNegro == 1) {
                        for (int n : rojo) {
                            if (n == numero) {
                                cash = cash + apuesta;
                                System.out.println("El numero es " + numero);
                                System.out.println("Muy bien, has acertado! Ganas " + apuesta
                                        + " euros. En total  tienes " + cash);
                            } else {
                                cash = cash - apuesta;
                                System.out.println("El numero es " + numero);
                                System.out
                                        .println("Fatal. Has perdido " + apuesta + "euros. Tienes " + (cash) + "euros");
                            }
                        }

                    } else if (RojoNegro == 2) {
                        for (int n : rojo) {
                            if (n == numero) {
                                cash = cash - apuesta;
                                System.out.println("El numero es " + numero);
                                System.out
                                        .println("Fatal. Has perdido " + apuesta + "euros. Tienes " + (cash) + "euros");
                            } else if (numero == 0) {
                                cash = cash - apuesta;
                                System.out.println(
                                        "Ha salido un 0!! Me llevo todo tu dinero y te quedas con " + cash + " euros.");
                            } else {
                                cash = cash + apuesta;
                                System.out.println("El numero es " + numero);
                                System.out.println("Muy bien, has acertado! Ganas " + apuesta
                                        + " euros. En total  tienes " + cash);

                            }
                        }
                    }
                } else if (Decision == 3) {
                    System.out.println("Falta(1)(del numero 1-16) o Pasa(2)( del numero 17-36)");
                    int FaltaPasa = keyboard.nextInt();
                    if (FaltaPasa == 1) {
                        if (numero > 0 && numero < 17) {
                            cash = cash + apuesta;
                            System.out.println("El numero es " + numero);
                            System.out.println(
                                    "Muy bien, has acertado! Ganas " + apuesta + " euros. En total  tienes " + cash);
                        } else {
                            cash = cash - apuesta;
                            System.out.println("El numero es " + numero);
                            System.out.println("Fatal. Has perdido " + apuesta + "euros. Tienes " + (cash) + "euros");
                        }
                    } else if (FaltaPasa == 2) {
                        if (numero < 37 && numero > 16) {
                            cash = cash + apuesta;
                            System.out.println("El numero es " + numero);
                            System.out.println(
                                    "Muy bien, has acertado! Ganas " + apuesta + " euros. En total  tienes " + cash);
                        } else if (numero == 0) {
                            cash = cash - apuesta;
                            System.out.println(
                                    "Ha salido un 0!! Me llevo todo tu dinero y te quedas con " + cash + " euros.");
                        } else {
                            cash = cash - apuesta;
                            System.out.println("El numero es " + numero);
                            System.out.println("Fatal. Has perdido " + apuesta + "euros. Tienes " + (cash) + "euros");
                        }
                    }
                } else if (Decision == 4) {
                    System.out.println("Primera docena(1), segunda (2) o tercera(3)");
                    int Docenas = keyboard.nextInt();
                    if (Docenas == 1) {
                        if (numero < 13 && numero > 0) {
                            cash = cash + apuesta * 2;
                            System.out.println("El numero es " + numero);
                            System.out.println(
                                    "Muy bien, has acertado! Ganas " + apuesta + " euros. En total  tienes " + cash);
                        } else {
                            cash = cash - apuesta;
                            System.out.println("El numero es " + numero);
                            System.out.println("Fatal. Has perdido " + apuesta + "euros. Tienes " + (cash) + "euros");
                        }
                    } else if (Docenas == 2) {
                        if (numero < 25 && numero > 12) {
                            cash = cash + apuesta * 2;
                            System.out.println("El numero es " + numero);
                            System.out.println(
                                    "Muy bien, has acertado! Ganas " + apuesta + " euros. En total  tienes " + cash);
                        } else {
                            cash = cash - apuesta;
                            System.out.println("El numero es " + numero);
                            System.out.println("Fatal. Has perdido " + apuesta + "euros. Tienes " + (cash) + "euros");
                        }
                    } else if (numero == 0) {
                        cash = cash - apuesta;
                        System.out.println(
                                "Ha salido un 0!! Me llevo todo tu dinero y te quedas con " + cash + " euros.");
                    } else if (Docenas == 3) {
                        if (numero < 37 && numero > 24) {
                            cash = cash + apuesta * 2;
                            System.out.println("El numero es " + numero);
                            System.out.println(
                                    "Muy bien, has acertado! Ganas " + apuesta + " euros. En total  tienes " + cash);
                        } else {
                            cash = cash - apuesta;
                            System.out.println("El numero es " + numero);
                            System.out.println("Fatal. Has perdido " + apuesta + "euros. Tienes " + (cash) + "euros");
                        }
                    }

                } else if (Decision == 5) {
                    System.out.println("A que numero quieres perder todo lo apostado?");
                    int NumeroApostado = keyboard.nextInt();
                    if (NumeroApostado == numero) {
                        cash = cash + apuesta * 35;
                        System.out.println("El numero es " + numero);
                        System.out.println(
                                "Muy bien, has acertado! Ganas " + apuesta + " euros. En total  tienes " + cash);
                    } else if (numero == 0) {
                        cash = cash - apuesta;
                        System.out.println(
                                "Ha salido un 0!! Me llevo todo tu dinero y te quedas con " + cash + " euros.");
                    } else {
                        cash = cash - apuesta;
                        System.out.println("El numero es " + numero);
                        System.out.println("Fatal. Has perdido " + apuesta + "euros. Tienes " + (cash) + "euros");
                    }
                }
            }
        }
    }
}
