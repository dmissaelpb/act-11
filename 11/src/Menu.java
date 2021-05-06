
import java.util.Scanner;


public class Menu {


 public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  int opcion=0;
  int opcion_=0;
  do{
menushow();
  opcion = teclado.nextInt();

  switch (opcion){
    
  case 1:
  Shape.shapeCuadrado();
  menu2();  
  opcion_ = teclado.nextInt();
  switch (opcion_) {
        case 1: Shape.cuadradoArea();       break;
        case 2: Shape.cuadradoPerimetro();  break;
        default:                            break;
      }
  break;
        case 2:
        Shape.shapeCirculo();
        menu2();
        opcion_ = teclado.nextInt();
        switch (opcion_) {
            case 1: Shape.circuloArea();       break;
            case 2: Shape.circuloPerimetro();  break;
            default:                            break;
      }                
  break;
        case 3:
        Shape.shapeTriangulo();
        menu2();        opcion_ = teclado.nextInt();
        switch (opcion_) {
            case 1: Shape.trianguloArea();       break;
            case 2: Shape.trianguloPerimetro();  break;
            default:                            break;
      }
  break;
        case 4:
        Shape.shapeRectangulo();
        menu2();        opcion_ = teclado.nextInt();
        switch (opcion_) {
            case 1: Shape.rectanguloArea();       break;
            case 2: Shape.rectanguloPerimetro();  break;
            default:                            break;
      }
                 
        break;
        

  }
 
  }while(opcion!=9);
 
 }



 static void menushow(){System.out.println();
      System.out.println();
     System.out.println(" ======== MENU DE OPCIONES ========= ");
     System.out.println(" ___________________________________ ");
     System.out.println(" ======== 1. Cuadrado      ========= ");
     System.out.println(" ======== 2. Circulo       ========= ");
     System.out.println(" ======== 3. Triangulo     ========= ");
     System.out.println(" ======== 4. Rectangulo    ========= ");
   
     System.out.println(" ___________________________________ ");
     System.out.println(" Ingrese una opcion ");
   }

   static void menu2(){
      System.out.println("**para calcular area oprima 1  \n**para calcular perimetro oprima 2 ");
   }
}