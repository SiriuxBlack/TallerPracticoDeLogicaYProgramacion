import java.util.*;//importamos scanner
public class primo_o_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//llamamos a scanner
        System.out.println("Ingrese un numero para saber si es primo o no" );//pedimos un numero por teclado
        int num = scanner.nextInt();
        int divisores =0;
        for(int i=1;i<=num;i++){
            if (num%i==0){
                divisores++; 
            }
        }
        if (divisores>2){
            System.out.println(num+" No Es Un Primo");
        }
        
        if (divisores==2){
            System.out.println(num+" Si Es Un Primo");
            
        }
        divisores=0;
        num=0;
        
        for (int j=1;j<=100;j++){
            divisores=0;
            if (num % 1 == 0) {
                divisores++;
            }
            if (num % 2 == 0 && num != 2) {
                divisores++;
            }
            if (num % 3 == 0 && num != 3) {
                divisores++;
            }
            if (num % 5 == 0 && num != 5) {
                divisores++;
            }
            if (num % 7 == 0 && num != 7) {
                divisores++;
            }
            if (divisores == 1 && num != 1) {
                System.out.println(num);  // Imprimir número primo
            }
            num++;
        }
        scanner.close();     
    }
}




        
        









           
            

      

    

