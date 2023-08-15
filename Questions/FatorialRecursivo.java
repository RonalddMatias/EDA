public class FatorialRecursivo {
    
    public static void main(String[] args) {

        imprimeSequencia(4);
    }

    private static int Fatorial(int numero){
        if (numero == 0 ){
            return 1;
        }
        else {
            return (numero * Fatorial(numero-1));
        }
    }

    private static void recursiveFunction(int sum){
        System.out.println("%d\n" + sum);
        if (sum < 4){
            recursiveFunction(sum + 1);
        }
    }

    private static void recursiveFunction2(int sum){
        if (sum >= 0){
            recursiveFunction2(sum - 1);
            System.out.println(sum);
        }
    }

    private static void imprimeSequencia(int num){
        imprimirSequenciaRecursivamente(num);
    }

    private static void imprimirSequenciaRecursivamente(int num) {
        if(num >= 0){
            System.out.println(num);
            imprimirSequenciaRecursivamente(num - 1);
            System.out.println("Final da chamada de k = " + num); // com isso você vai perceber a diferenca no uso da recurão
        }
    }
}


