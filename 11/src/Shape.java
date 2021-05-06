import java.util.Scanner;

public class Shape {


static Scanner teclado = new Scanner(System.in);
private static float lado_;
private static float radio_c;

private static float base_t;
private static float altura_t;

private static int base_rec_r;
private static int altura_rec_r;



static void shapeCuadrado(){
    
    System.out.println("Ingrese el lado ");
    float lado = teclado.nextInt();  
    lado_= lado; 
}



static void cuadradoArea(){

    System.out.println(" EL AREA DEL CUADRADO ES :"+ Cuadrado.areaCuadrado(lado_));
}

static void cuadradoPerimetro(){
    System.out.println(" EL AREA DEL CUADRADO ES :"+ Cuadrado.perimetroCuadrado(lado_));

}


//******************************************** */

static void shapeCirculo (){
    System.out.println("Ingrese el radio ");
    float radio = teclado.nextInt();
    radio_c=radio;    
   }
   static void circuloArea(){
       System.out.println(" EL AREA DEL CIRCULO ES :"+ Circulo.areaCirculo(radio_c));
    }
    static void circuloPerimetro(){
        System.out.println(" EL AREA DEL CIRCULO ES :"+ Circulo.perimetroCirculo(radio_c));
     }
//********************************************* */  
    
static void shapeTriangulo (){
    System.out.println(" Ingrese la base ");
        float base = teclado.nextInt();
        base_t=base;
        System.out.println(" Ingrese la altura ");
        float altura = teclado.nextInt();   
        altura_t= altura;

   }
   static void trianguloArea(){
    System.out.println(" EL AREA DEL TRIANGULO ES :"+ Triangulo.areatriangulo(base_t,altura_t));    }
    static void trianguloPerimetro(){
        System.out.println(" EL perimetro DEL TRIANGULO ES :"+ Triangulo.PerimetroTriangulo(base_t, altura_t));
     }

//********************************************** */
static void shapeRectangulo (){

    System.out.println(" Ingrese la BASE ");
        int  base_rec = teclado.nextInt();
        base_rec_r= base_rec;
        System.out.println(" Ingrese la ALTURA ");
        int  altura_rec = teclado.nextInt();
        altura_rec_r = altura_rec;

    }
   static void rectanguloArea(){
    System.out.println(" EL AREA DEL RECTANGULO ES :"+ Rectangulo.areaRectangulo(base_rec_r,altura_rec_r));
    }
    static void rectanguloPerimetro(){
        System.out.println(" EL AREA DEL RECTANGULO ES :"+ Rectangulo.perimetroRectangulo(base_rec_r,altura_rec_r));
    }
//********************************************* */

}