package pe3;

public class GenerateExceptions {
    void returnNegativeArraySizeException(){
        int[] array = new int[-5];
    }

    void returnArrayIndexOutOfBoundException(){
        int[] array2 = new int[5];
        array2[5] = 9;
    }

    void returnNullPointerException(){
        StringBuffer s = null;
        s.append("something");
    }
}
