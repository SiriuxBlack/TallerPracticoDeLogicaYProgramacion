import java.util.*;
public  class poligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Poligonos-----");
        System.out.println("|1) triangulo     |");
        System.out.println("-------------------");
        System.out.println("|2) cuadrados     |");
        System.out.println("-------------------");
        System.out.println("3) rectangulo     |");
        System.out.println("-------------------");
        System.out.println("Ingrese el poligo que desea calcular");
        int num =scanner.nextInt();
        double base = 0;
        double altura =0;
        double area =0;
        switch (num) {
            case 1:
            System.out.println("| Eligio calcular el area de un Triangulo en cm²|");
            System.out.println("Ingrese Base: ");
            base = scanner.nextDouble();
            System.out.println("Ingrese Altura: ");
            altura = scanner.nextDouble();
            area=(base * altura) / 2;
            System.out.println("El Area es:  "+area);
                break;
            case 2:
            System.out.println("| Eligio calcular el area de un Cuadrado en cm²|");
            System.out.println("Ingrese Un Lado: ");
            base = scanner.nextDouble();
            area=(base * base);
            System.out.println("El Area es:  "+area);
             break;
            case 3:
            System.out.println("| Eligio calcular el area de un Rectangulo en cm²|");
            System.out.println("Ingrese Base: ");
            base = scanner.nextDouble();
            System.out.println("Ingrese Altura: ");
            altura = scanner.nextDouble();
            area=(base * altura);
            System.out.println("El Area es:  "+area);
                break;
        
            default:
                break;
        }
        scanner.close();
    }
    
}
