package homework2;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1",},{"1","1","1","1"}};
        int sum;
       try {
           sum = parseArray(array);
           System.out.println(sum);
       }
       catch (MyArraySizeException | MyArrayDataException e) {
           e.printStackTrace();
       }
    }

    public static int parseArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if(isTrueSize(array)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                     try {
                         sum += Integer.parseInt(array[i][j]);
                     }
                     catch (NumberFormatException e) {
                         throw new MyArrayDataException(array[i][j], i,j);
                     }
                }
            }
        }
        return sum;
    }

    public static boolean isTrueSize(String[][] array) throws MyArraySizeException {
        if(array.length == 4) {
            for (String[] strings : array) {
                if (!(strings.length == 4)) {
                    throw new MyArraySizeException();
                }
            }

        }
        else throw new MyArraySizeException();
        return true;
    }
}
