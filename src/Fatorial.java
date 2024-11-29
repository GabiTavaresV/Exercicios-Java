public class Fatorial {

    public static long execute( int numero) {
        long result = 1;
        for(int i = 1; i <= numero; i ++){
            result *= i;
        }
        return result;
    }
}

