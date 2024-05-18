
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        Metodos ordenamiento = new Metodos();

        int arreglo[];
        int arregloAnterior[];
        int itemsQuantity;

        itemsQuantity=10;
        arreglo=new int[itemsQuantity];
        for (int i = 0; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}
        System.out.println("\tCon "+itemsQuantity+" valores");
        ordenamiento.imprimirArreglo(arreglo);
        ordenamiento.calculateBubbleSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateInsertionSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateSelectionSortExecutionTime(itemsQuantity, arreglo);
        System.out.println();

        arregloAnterior=arreglo.clone();
        itemsQuantity=20;
        arreglo=new int[itemsQuantity];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 10; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}
        System.out.println("\tCon "+itemsQuantity+" valores");
        ordenamiento.imprimirArreglo(arreglo);
        ordenamiento.calculateBubbleSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateInsertionSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateSelectionSortExecutionTime(itemsQuantity, arreglo);
        System.out.println();
        
        arregloAnterior=arreglo.clone();
        itemsQuantity=100;
        arreglo=new int[itemsQuantity];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 20; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}
        System.out.println("\tCon "+itemsQuantity+" valores");
        ordenamiento.calculateBubbleSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateInsertionSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateSelectionSortExecutionTime(itemsQuantity, arreglo);
        System.out.println();

        
        arregloAnterior=arreglo.clone();
        itemsQuantity=1000;
        arreglo=new int[itemsQuantity];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 100; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}
        System.out.println("\tCon "+itemsQuantity+" valores");
        ordenamiento.calculateBubbleSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateInsertionSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateSelectionSortExecutionTime(itemsQuantity, arreglo);
        System.out.println();
        
        arregloAnterior=arreglo.clone();
        itemsQuantity=5000;
        arreglo=new int[itemsQuantity];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 1000; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}
        System.out.println("\tCon "+itemsQuantity+" valores");
        ordenamiento.calculateBubbleSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateInsertionSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateSelectionSortExecutionTime(itemsQuantity, arreglo);
        System.out.println();
        
        arregloAnterior=arreglo.clone();
        itemsQuantity=10000;
        arreglo=new int[itemsQuantity];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 5000; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}
        System.out.println("\tCon "+itemsQuantity+" valores");
        ordenamiento.calculateBubbleSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateInsertionSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateSelectionSortExecutionTime(itemsQuantity, arreglo);
        System.out.println();


        arregloAnterior=arreglo.clone();
        itemsQuantity=30000;
        arreglo=new int[itemsQuantity];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 10000; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}
        System.out.println("\tCon "+itemsQuantity+" valores");
        ordenamiento.calculateBubbleSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateInsertionSortExecutionTime(itemsQuantity, arreglo);
        ordenamiento.calculateSelectionSortExecutionTime(itemsQuantity, arreglo);
        System.out.println();
    }
}
