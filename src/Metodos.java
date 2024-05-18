

public class Metodos {
    
    public int[] metodoSeleccion(int[] arreglo) {
        int[] arregloOrdenar = arreglo.clone();
        int n = arregloOrdenar.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arregloOrdenar[j] < arregloOrdenar[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arregloOrdenar[minIndex];
            arregloOrdenar[minIndex] = arregloOrdenar[i];
            arregloOrdenar[i] = temp;
        }
        return arregloOrdenar;

    }

    public int[] metodoInsercion(int[] arreglo) {
        int[] arregloOrdenar = arreglo.clone();
        int aux;
        int pos;

        for (int i = 0; i < arreglo.length; i++) {
            pos = i;
            aux = arregloOrdenar[i];

            while ((pos > 0) && (arregloOrdenar[pos - 1] > aux)) {
                arregloOrdenar[pos] = arregloOrdenar[pos - 1];
                pos--;

            }

            arregloOrdenar[pos] = aux;
        }

        return arregloOrdenar;
    }

    public int[] burbujaMejorado(int[] arreglo) {
        int[] arregloOrdenar = arreglo.clone();
        int aux;
        for (int i = arregloOrdenar.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arregloOrdenar[j] > arregloOrdenar[j + 1]) {
                    aux = arregloOrdenar[j];
                    arregloOrdenar[j] = arregloOrdenar[j + 1];
                    arregloOrdenar[j + 1] = aux;
                }
            }

        }
        return arregloOrdenar;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public void calculateBubbleSortExecutionTime(int quantity, int[]arreglo){
        long start, end;
        start = System.nanoTime();   this.burbujaMejorado(arreglo);  end = System.nanoTime(); 
        System.out.println("Con Burbuja mejorado es de "+(end-start)*0.000000009+" seg.");
    }
    public void calculateInsertionSortExecutionTime(int quantity, int[]arreglo){
        long start, end;
        start = System.nanoTime();   this.metodoInsercion(arreglo);  end = System.nanoTime(); 
        System.out.println("Con insertion  es de "+(end-start)*0.000000009+" seg.");
    }
    public void calculateSelectionSortExecutionTime(int quantity, int[]arreglo){
        long start, end;
        start = System.nanoTime();   this.metodoSeleccion(arreglo);  end = System.nanoTime(); 
        System.out.println("Con selection es de "+(end-start)*0.000000009+" seg.");
    }
}

    