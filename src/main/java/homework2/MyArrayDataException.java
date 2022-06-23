package homework2;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(String str, int i, int j) {
        super(String.format("Ячейка массива c координатами (%d,%d) содержит \"%s\" и это не число!", i, j, str));

    }



}
