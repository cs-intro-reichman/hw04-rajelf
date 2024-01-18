public class ArrayOps {
    public static void main(String[] args) {
       

    }

    public static int findMissingInt(int[] array) {
        int n = array.length;

        for (int i = 0; i <= n; i++) {
            boolean contains = false;
            for (int j = 0; j < n; j++) {
                if (array[j] == i) {
                    contains = true;
                }
            }
            if (contains==false){
                return i;
            }
        }
        return 1;
    }

    public static int secondMaxValue(int[] array) {
        int n = array.length;
        int[] array2 = new int[array.length - 1];
        int index2 = 0;
        int max = array[0];

        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] != max) {
                array2[index2] = array[j];
                index2++;
            }
        }
        int max2 = array2[0];
        for (int k = 0; k < array2.length; k++) {
            if (array[k] > max2) {
                max2 = array2[k];
            }
        }

        return max2;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        boolean equality;
        for (int i = 0; i < array1.length; i++) {
            equality = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    equality = true;
                }
            }
            if (equality == false) {
                return false;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            equality = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    equality = true;
                }
            }
            if (equality == false) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSorted(int[] array) {
        int min = array[0];
        int max = array[0];
        boolean sortedInc =false;
        boolean sortedDec =false;
         for (int i = 0; i < array.length-1; i++){ //{9,7,4,6,5,1}
             sortedInc= false;
            if(array[i+1]>array[i]){
                sortedInc  = true;
            } 
            else {
                sortedInc =  false;
                break;
            }

         }
         for (int i = 0; i < array.length-1; i++){ //{9,7,4,6,5,1}
             sortedDec= false;
            if(array[i+1]<array[i]){
                sortedDec = true;
            } 
            else {
                sortedDec =  false;
                break;
            }
        } 
        if(sortedDec == false  && sortedInc == false){
            return false;
        }

        return true;
    }

}
