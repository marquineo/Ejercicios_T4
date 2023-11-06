package ejercicio9;


public class Ejercicio9 {

    
    public static void main(String[] args) {
        
    }
    
}
class joven {
    public static void main(String[] args) {
        int edad = 28;
        int nivel_estudios = 2;
        double ingresos = 10.000;
        boolean jasp = true;
        if( edad <= 28 && nivel_estudios > 3){
        jasp = true;        
        }else if(edad < 30 && ingresos > 28.000){
        jasp = true;
        }else{
        jasp = false;
        }
            System.out.println(jasp);
    }
}
//revisar