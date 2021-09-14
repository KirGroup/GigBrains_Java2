package ru.gb.java2.lesson2;

public class ArithmeticTest {

    public static void main(String[] args) {
        int b = 0;
        int[] array = {1, 2, 3};
        try {
            int result = divide(10, b);
            System.out.println("Result = " + result);
            String str = null;
            if (str != null) {
                String substring = str.substring(1);
            }

            int value = array[4];
            System.out.println("array[4] = " + value);
        } catch (DivideByZeroException e) {
            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошло деление на ноль!");
            System.out.println(e.getMessage());
            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Невалидный индекс по обращению к массиву!");
        } catch (NullPointerException e) {
            System.out.println("Ошибка при обращении к null значению!");
        } catch (RuntimeException e) {
            System.out.println("Произошла ошибка!");
        }

        System.out.println("finish!");
    }

    private static int divide(int a, int b) {
        if (b == 0) {
//            ArithmeticException exception = new ArithmeticException("Произошло деление на ноль!");
            ArithmeticException exception = new DivideByZeroException();
            System.out.println("Будет брошена ошибка");
            throw exception;
        }
        return a / b;
    }
}
