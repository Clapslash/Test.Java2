package Homework2;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = new String[][] {
                {"5", "4","12", "9"},
                {"6", "90","1", "34"},
                {"65", "1","ar", "6"},
                {"111", "24","1", "99"}};

        String[][] arr2 = new String[][] {
                {"5", "4","12", "9"},
                {"6", "90","1", "34"},
                {"65", "1","4", "6"},
                {"111", "24","1", "99"}};

        String[][] arr3 = new String[][] {
                {"5", "4","12", "9"},
                {"6", "90","1", "34"},
                {"65", "1","-5", "6"},
                {"111", "24","1", "99"}};

        try {
            ArraySum.sum(arr1);
        } catch (MyArrayDataExeption e) {
            e.printStackTrace();
        } catch (MyArraySizeExeption e) {}

        try {
            ArraySum.sum(arr2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            ArraySum.sum(arr3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
