public class fizzBuzz {

    public static void main(String[] args) {

        for (int i=1; i<=100; i++){ //usamos un for con contador , este for empieza en 1 y termina en 100
            
            if (i%3==0 && i%5==0){ //usamos un if-else en el que decimos que si el modulo de i%3  es 0 y el modulo de i%5 tambien es 0 imprimimos fizzBuzz
                System.out.println(i +" fizzBuzz");
            }else if (i%3==0){ //lo que nos dice este if-else es que si solo el modulo de i%3 es 0 entonces imprime fizz
                System.out.println(i +" fizz");
            }else if(i%5==0){//lo que nos dice este if-else es que si solo el modulo de i%5 es 0 entonces imprime Buzz
                System.out.println(i +" Buzz");
            }
        }
    }
} 