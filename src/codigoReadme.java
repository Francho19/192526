
import java.util.Scanner;

public class codigoReadme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double sumaTotal = 0.0;
        int empleado = 10;
            for (int i = 1; i <= empleado; i++) {
                System.out.println("Ingrese el salario del empleado " + i );
                Double sueldo = input.nextDouble();
                System.out.println("El salario del empleado " + i + " es " + sueldo);
                if (sueldo >=100 && sueldo <=300){
                    System.out.println("Los extremos tienen derechos");
                }else{
                    if (sueldo > 300){
                        System.err.println("sueldo vip");
                    }else{
                        if (sueldo <0 ){
                            System.out.println("Devuelvete al inframundo ");
                        }
                    }
                }
             }  
             System.out.println("La suma total de los sueldos es " + sumaTotal);     
             input.close();
      
    }
}
