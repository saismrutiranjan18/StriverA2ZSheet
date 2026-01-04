class SelectionSort {
    public static void SelectionSortArray(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1;i++){

            //assume the current position holds the minimum element
            int minimumIndex = i;

            //iterate through the unsorted position to find the actual minimum
            for(int j =i+1;j<n;j++){
                if(arr[j]< arr[minimumIndex]){
                    minimumIndex = j; //update minimum index if a smaller element is found
                }
            }

            //move minimum element to its correct position by swapping
            int temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;
        }
    }

    public static void printArray(int[] arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(arr);

        SelectionSortArray(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

