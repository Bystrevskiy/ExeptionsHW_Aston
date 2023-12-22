import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // 1. null exeption
        String s = null;
        try{
            s.length();
        } catch (NullPointerException e){
            e.printStackTrace();
            System.err.println("Исключение с нулевым указателем");
        }

        //2 IndexOutOfBoundsExeption

        try{
            int[] arr = new int[5];
            int val = arr[9];
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.err.println("Индекс за границами");
        }
        //3. Кастомное исключение
        try {
            throwMyExeption();
        } catch (ExeptExtend e) {
            e.printStackTrace();
        }
        //5.
        try { throwRandomException();
        } catch (CustomException1 | CustomException2 | CustomException3 e) {
            e.printStackTrace();
        }


    }
    private static void throwRandomException() throws CustomException1, CustomException2, CustomException3 {
        Random random = new Random();
        int randomValue = random.nextInt(3);

        switch (randomValue) {
            case 0:
                throw new CustomException1("Это исключение #1");
            case 1:
                throw new CustomException2("Это исключение #2");
            case 2:
                throw new CustomException3("Это исключение #3");
        }
    }
    public static void throwMyExeption() throws ExeptExtend{
        throw new ExeptExtend("Кастомное исключение");
    }
}
class CustomException1 extends Exception {
    public CustomException1(String message) {
        super(message);
    }
}

class CustomException2 extends Exception {
    public CustomException2(String message) {
        super(message);
    }
}

class CustomException3 extends Exception {
    public CustomException3(String message) {
        super(message);
    }
}




