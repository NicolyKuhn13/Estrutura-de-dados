import java.util.Random;

public class QuickSort {
    
    public static void main(String[] args) {
        
        Random gerador = new Random();
        int v[] = new int[10];
        
        for(int a=0; a<v.length; a++){
            v[a]= new Random().nextInt(20);
            System.out.print(" "+v[a]);  
        }
        System.out.println();

        quickSort(v, 0,9);

        for (int a = 0; a < v.length; a++) {
            System.out.print(" "+v[a]);
        }

    }
    public static void quickSort(int v[], int begin, int end){

        if(begin < end){
            int partitionIndex = partitionPivot(v, begin, end);
            quickSort(v, begin, partitionIndex -1);
            quickSort(v, partitionIndex +1, end);
        }

        
    }
    public static int partitionPivot(int v[], int begin, int end){
        int pivot = v[end];
        int i = (begin -1);
        for(int j = begin; j < end; j++){
            if(v[j] >= pivot){
                i++;
                int swapTemp = v[i];
                v[i] = v[j];
                v[j] = swapTemp;
            }
        }
        int swapTemp = v[i+1];
        v[i + 1] = v[end];
        v[end] = swapTemp;
        return i +1;
       
    }

}
