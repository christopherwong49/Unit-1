public class Sort {
    public static void selectionSortIntArr(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int lowestIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[lowestIndex]){
                    lowestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;

        }
    }

    public static void selectionSortStringArr(String[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int lowestIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j].compareToIgnoreCase(arr[lowestIndex]) < 0){
                    lowestIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;

        }
    }

    //geeksforgeeks.org/merge-sort
    public static void merge(String[] arr, int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;

        String[] L = new String[n1];
        String[] R = new String[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l+i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m+1+j];
        }

        int i=0, j=0;
        int k = l;
        while(i<n1 && j<n2) {
            if(L[i].compareToIgnoreCase(R[j]) < 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(String[] arr, int l, int r) {
        if(l<r){
            int m = l + (r-l) /2;

            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
}
