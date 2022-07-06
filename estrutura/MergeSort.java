import java.util.Random;

public class MergeSort {
    
    public static void main(String[] args) {
        
        Random gerador = new Random();
        int v[] = new int[10];
        
        System.out.println();
        for(int i=0; i<v.length;i++){
            v[i]= new Random().nextInt(20);
            System.out.print(" "+v[i]);  
        }
        System.out.println();   
        
        mergeSorte(v, v.length);

        for (int i = 0; i < v.length; i++) {
            System.out.print(" "+v[i]);
        }
        System.out.println("\n"); 
    }

    public static int[] mergeSorte(int v[], int tam){
        if(tam < 2){
            return v;
        }
        int meio = tam / 2;
        int vl[] = new int [meio];
        int vr[] = new int [tam - meio];

        for(int i = 0; i < meio; i++){
            vl[i] = v[i];
        }
        for(int i = meio; i < tam; i++){
            vr[i - meio] = v[i];
        }

        mergeSorte(vl, meio);
        mergeSorte(vr,tam - meio);
        merge(v, vl, vr, meio, tam - meio);

        return v;

    }

    public static void merge(int vetor[], int vl[], int vr[], int ini, int fim){
        int i = 0, j = 0, k = 0;
        while( i < ini && j < fim) {
            if(vl[i] >= vr[j]) {
                vetor[k++] = vl[i++];
            } else {
                vetor[k++] = vr[j++];
            }
        }
        while(i < ini) {
            vetor[k++] = vl[i++];
        }
        while(j < fim) {
            vetor[k++] = vr[j++];
        }
    }
}
