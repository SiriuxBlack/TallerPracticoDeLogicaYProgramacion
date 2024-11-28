public class fibonachi {
    public static void main(String[] args) {
        long a=0;//definimos como long las variables a y b, estas variables se inicializaran en 0 y 1 respectivamente
        long b=1;
        System.out.println(a);
        for(int i=0;i<50 ;i++){//usamos un for con la condicion de que dara 50 vueltas, todo esto medainte un contador i++
            System.out.println(b);//imprimimos  antes de actualizar las variables a y b
            b=a+b;
            a=b-a;
        }
        
    }
}
