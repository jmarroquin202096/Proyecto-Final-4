import java.util.Scanner;
 
public class MenuGeneros {
 
     
    public static void main(String[] args) {
         
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion;
       int opcion2;
       int opcion3;
       int opcion4;
       int opcion5;
       //Guardaremos la opcion del usuario
        
       while(!salir){
            
          System.out.println(" Bienvenido al Menu de Generos de Juegos: ");
          System.out.println("1. Accion");
          System.out.println("2. Aventuras");
          System.out.println("3. Deportes");
          System.out.println("4. Terror");
          System.out.println("5. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();

      switch(opcion) {
                    case 1:
                        System.out.println("Los Juegos de Accion son: ");

                        System.out.println("1. Fornite");
                        System.out.println("2. Call of Duty");
                        System.out.println("3. Free Fire");
                        System.out.println("4. Halo");
                        System.out.println("Elige tu Juego: ");
                        opcion2 = sn.nextInt();


                        switch(opcion2) {
                          case 1:
                            System.out.println("Elegiste el Juego de Fornite.");
                            break; 
                          case 2:
                            System.out.println("Elegiste el Juego de Call of Duty");
                            break;
                          case 3:
                            System.out.println("Elegiste el Juego de Free Fire");
                            break;
                          case 4:
                            System.out.println("Elegiste el Juego de Halo");
                            break;

                          }    
                        break;
                    case 2:

                        System.out.println("Los Juegos de Aventuras son: ");
                        System.out.println("1. Mario Bros");
                        System.out.println("2. Zelda");
                        System.out.println("3. Tom Breider");
                        System.out.println("Elige tu Juego: ");
                        opcion3 = sn.nextInt();

                        switch(opcion3) {
                          case 1:
                            System.out.println("Elegiste el Juego de Mario Bros");
                            break;
                          case 2:
                            System.out.println("Elegiste el Juego de Zelda");
                            break;
                          case 3:
                            System.out.println("Elegiste el Juego de Tom Breider");
                            break;
                        }
                        break;
                    case 3:

                        System.out.println("Los Juegos de  Deportes son: ");
                        System.out.println("1. FIFA");
                        System.out.println("2.NBA");
                        System.out.println("3. GTA");
                        System.out.println("Elige tu Juego: ");
                        opcion4 = sn.nextInt();

                      switch(opcion4) {
                        case 1:
                          System.out.println("Elegiste el Juego de FIFA");
                          break;
                        case 2:
                          System.out.println("Elegiste el Juego de NBA");
                          break;
                        case 3:
                          System.out.println("Elegiste el Juego de GTA");
                          break;
                      }

                    case 4:
                        System.out.println("Los Juegos de Terror son: ");
                        System.out.println("1. Resident Evil");
                        System.out.println("2. Five Nights at Freddy´s");
                        System.out.println("3. Dead Space");
                        System.out.println("Elige tu Juego: ");
                        opcion5 = sn.nextInt();

                      switch(opcion5){
                        case 1:
                          System.out.println("Elgiste el Juego de Resident Evil");
                          break;
                        case 2:
                          System.out.println("Elgiste el Juego de Five Nights at Freddy´s");
                          break;
                        case 3:
                          System.out.println("Elgiste el Juego de Dead Space");
                          break;
                      }
                       
                        break;
                    case 5:
                        salir = true;
                        break;   
               }    
       }
        
    }
     
}