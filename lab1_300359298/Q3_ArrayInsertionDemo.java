public class Q3_ArrayInsertionDemo {
    public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		int[] newArray;
        newArray = new int[beforeArray.length + 1];
        for (int i = 0; i <beforeArray.length; i++){
            if (i == indexToInsert){
                newArray[i] = valueToInsert;
            }
            else if (i > indexToInsert){
                newArray[i] = beforeArray[i - 1];
            }
            else{
                newArray[i] = beforeArray[i];
            }
        }
        return newArray;
	}

	public static void main(String[] args){
        int[] array;
        array = new int[]{1, 5, 4, 7, 9, 6};
		System.out.println("Array before insertion");
        for (int i=0; i <array.length; i++ ){
            System.out.println(array[i]);
        }
        int[] newarray = insertIntoArray(array, 3, 15);
        System.out.println("Array after insertion of 15 at position 3");
        for (int i = 0; i < newarray.length; i++){
            System.out.println(newarray[i]);
        }
	}
}
