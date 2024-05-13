package question5;

public class mergeSort {
    public static void main(String[]args){
        private static void mergeSort(int[] arrayNumbs){
            int inputLength = inputArray.length;
            if(inputLength < 2) {
                return;
            }
            int midIndex = inputLength / 2;
            int[] leftHalf = new int[midIndex];
            int[] rightHalf = new int[inputLength -
                    midIndex];
            for(int i = 0; i < midIndex; i++) {
                leftHalf[i - midIndex] = arrayNumbs[i];
            }
            for(int i = midIndex; i < inputLength; i++) {
                rightHalf[i] = arrayNumbs[i];
            }
            mergeSort(leftHalf);
            mergeSort(rightHalf);
            merge(arrayNumbs, leftHalf, rightHalf);
        }
        private static void merge(int[] arrayNumbs, int[]  leftH, int[] rightH) {
            int leftSize = leftH.length;
            int rightSize = rightH.length;
            int i = 0;
            int j = 0;
            int k = 0;
            while(i < leftSize && j < rightSize) {
                if(leftH[i] <= rightH[j]) {
                   arrayNumbs[k] = leftH[i];
                    i++;
                }
                else {
                    arrayNumbs[k] = rightH[j];
                }
                k++;
            }
            while(i < leftSize) {
                arrayNumbs[k] = leftH[i];
                i++;
                k++;
            }
            while(j < rightSize) {
               arrayNumbs[k] = rightH[j];
                j++;
                k++;
            }
        }

    }
}
