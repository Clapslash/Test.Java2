package Homework2;

public class ArraySum {
    public static int sum(String[][] arr) {
        if (arr.length != 4) throw new MyArraySizeExeption("size is not 4x4");
        int sum = 0;
        for(int y = 0; y < arr.length; y++) {
            if(arr[y].length != 4) throw new MyArraySizeExeption("size is not 4x4");
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption(String.format("Not a number data at cell [%d][%d]", x + +1, y +1));
                }
            }
        }
        System.out.println("sum is " + sum);
        return sum;
    }
}
