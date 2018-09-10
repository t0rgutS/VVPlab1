/**
 * ЗАДАНИЕ
 * <p>
 * Необходимо в основном классе Java - программы создать:
 * 1. 9 методов (один оператор по варианту задания – один метод).
 * 2. 5 методов для проверки приоритетов (методы, в которых используется одновременно два разных
 * оператора – например, «a+b*c» - результат вычисления зависит от приоритета).
 * 3. 5 методов для проверки ассоциативности (методы, в которых один и тот же оператор используется дважды,
 * и результат зависит от порядка выполнения операторов. Например: «a-b-c» - результат зависит от того,
 * вычисляется ли сначала a-b или b-c).
 * 4. 10 методов тестирования. Для каждого метода тестирования провести минимум 3 теста.
 * <p>
 * Операторы: '-', '*', '*=', '^', '>>=', '<', '&', '||', '=='.
 */

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static org.junit.Assert.*;

import java.util.*;

public class SimpleCalc {
    Scanner sc = new Scanner(System.in);

    public int getMin(
            int a, int b) {
        return a - b;
    }

    public int getUmn(
            int a, int b) {
        return a * b;
    }

    public int getUmnR(
            int a, int b) {
        return a *= b;
    }

    public int getXor(
            int a, int b) {
        return a ^ b;

    }

    public int getSdv(
            int a, int b) {
        return a >>= b;
    }

    public boolean getMensh(
            int a, int b) {
        return a < b;
    }

    public boolean getIsR(
            int a, int b) {
        return a == b;
    }

    public boolean getAnd(
            boolean a, boolean b) {
        return a & b;
    }

    public boolean getOr(
            boolean a, boolean b) {
        return a || b;
    }

    public int getMinUmn(
            int a, int b, int c) {
        int i = 0;
        while (i != 1 && i != 2) {
            System.out.println("Укажите приоритет:\n1: " + a + " - " + b + " * " + c +
                    "\n2: (" + a + " - " + b + ") " + " * " + c);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                sc.nextLine();
                if (i == 1 || i == 2) {
                    if (i == 1)
                        return a - b * c;
                    else
                        return (a - b) * c;
                }
            }
        }
        return 0;
    }

    public int getUmnXor(
            int a, int b, int c) {
        int i = 0;
        while (i != 1 && i != 2) {
            System.out.println("Укажите приоритет:\n1: " + a + " ^ " + b + " * " + c +
                    "\n2: (" + a + " ^ " + b + ") " + " * " + c);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                sc.nextLine();
                if (i == 1 || i == 2) {
                    if (i == 1)
                        return a ^ b * c;
                    else
                        return (a ^ b) * c;
                }
            }
        }
        return 0;
    }

    public int getMinSdv(
            int a, int b, int c) {
        int i = 0;
        while (i != 1 && i != 2) {
            System.out.println("Укажите приоритет:\n1: " + a + " >>= " + b + " - " + c +
                    "\n2: (" + a + " >>= " + b + ") - " + c);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                sc.nextLine();
                if (i == 1 || i == 2) {
                    if (i == 1)
                        return a >>= b - c;
                    else
                        return (a >>= b) - c;
                }
            }
        }
        return 0;
    }

    public int getXorSdv(
            int a, int b, int c) {
        int i = 0;
        while (i != 1 && i != 2) {
            System.out.println("Укажите приоритет:\n1: " + a + " >>= " + b + " ^ " + c +
                    "\n2: (" + a + " >>= " + b + ") " + " ^ " + c);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                sc.nextLine();
                if (i == 1 || i == 2) {
                    if (i == 1)
                        return a >>= b ^ c;
                    else
                        return (a >>= b) ^ c;
                }
            }
        }
        return 0;
    }

    public int getMinXor(
            int a, int b, int c) {
        int i = 0;
        while (i != 1 && i != 2) {
            System.out.println("Укажите приоритет:\n1: " + a + " - " + b + " ^ " + c +
                    "\n2: " + a + " - (" + b + " ^ " + c + ")");
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                sc.nextLine();
                if (i == 1 || i == 2) {
                    if (i == 1)
                        return a - b ^ c;
                    else
                        return a - (b ^ c);
                }
            }
        }
        return 0;
    }

    public int getDoubleMin(
            int a, int b, int c) {
        int i = 0;
        while (i != 1 && i != 2) {
            System.out.println("Укажите приоритет:\n1: " + a + " - " + b + " - " + c +
                    "\n2: " + a + " - (" + b + " - " + c + ")");
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                sc.nextLine();
                if (i == 1 || i == 2) {
                    if (i == 1)
                        return a - b - c;
                    else
                        return a - (b - c);
                }
            }
        }
        return 0;
    }

    public int getDoubleXor(
            int a, int b, int c) {
        return a ^ b ^ c;
    }

    public int getDoubleSdv(
            int a, int b, int c) {
        return a >>= b >>= c;
    }

    public int getDoubleUmnR(
            int a, int b, int c) {
        return a *= b *= c;
    }

    public boolean getDoubleOr(
            int a, int b, int c) {
        return a > b || b > c || c > a;
    }

    public void input() {
        int x = 0, y = 0, z = 0, i = -1, k, j;
        boolean b = true;
        while (i != 0) {
            while (i != 2 && i != 3 && i != 0) {
                System.out.println("Выберите кол-во операнд: 2 или 3? Выход - 0");
                while (!sc.hasNextInt())
                    sc.next();
                i = sc.nextInt();
                if (!b) b = true;
                sc.nextLine();
            }
            if (i != 0) {
                while (b) {
                    k = 0;
                    while (k != 1 && k != 2) {
                        System.out.println("1 - ввести числа с клавиатуры;\n" +
                                "2 - сгенерировать случайные числа от -1000 до 1000.");
                        while (!sc.hasNextInt())
                            sc.next();
                        k = sc.nextInt();
                        sc.nextLine();
                    }
                    if (k == 1) {
                        System.out.print("Введите 1-е число: ");
                        while (!sc.hasNextInt()) {
                            System.out.print("Введите 1-е число: ");
                            sc.next();
                        }
                        x = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Введите 2-е число: ");
                        while (!sc.hasNextInt()) {
                            System.out.print("Введите 2-е число: ");
                            sc.next();
                        }
                        y = sc.nextInt();
                        sc.nextLine();
                        if (i == 3) {
                            System.out.print("Введите 3-е число: ");
                            while (!sc.hasNextInt()) {
                                System.out.print("Введите 3-е число: ");
                                sc.next();
                            }
                            z = sc.nextInt();
                            sc.nextLine();
                        }
                    } else {
                        Random rand = new Random();
                        x = rand.nextInt(2001) - 1000;
                        y = rand.nextInt(2001) - 1000;
                        if (i == 3)
                            z = rand.nextInt(2001) - 1000;
                    }
                    b = false;
                }
                j = -1;
                while (j != 0) {
                    if (i == 2) {
                        System.out.println("Ваши числа:\nx = " + x + "\ny = " + y);
                        sc.nextLine();
                        System.out.println("Выберите операцию:\n1. x - y;\n2. x*y;\n3. x*=y;\n4. x^y;\n5. x >>= y;\n" +
                                "6. x < y;\n7. x > 0 & y > 0;\n8. x > 0 | y > 0;\n9. x == y;\n" +
                                "11. Ввести другие числа;\n0. Назад");
                        while (!sc.hasNextInt())
                            sc.next();
                        j = sc.nextInt();
                        sc.nextLine();
                        switch (j) {
                            case 1:
                                System.out.println("Результат: " + getMin(x, y));
                                break;
                            case 2:
                                System.out.println("Результат: " + getUmn(x, y));
                                break;
                            case 3:
                                System.out.println("Результат: " + getUmnR(x, y));
                                break;
                            case 4:
                                System.out.println("Результат: " + getXor(x, y));
                                break;
                            case 5:
                                System.out.println("Результат: " + getSdv(x, y));
                                break;
                            case 6:
                                System.out.println("Результат: " + getMensh(x, y));
                                break;
                            case 7:
                                System.out.println("Результат: " + getAnd(x > 0, y > 0));
                                break;
                            case 8:
                                System.out.println("Результат: " + getOr(x > 0, y > 0));
                                break;
                            case 9:
                                System.out.println("Результат: " + getIsR(x, y));
                                break;
                            case 11:
                                j = 0;
                                b = true;
                                break;
                        }
                    } else {
                        System.out.println("Ваши числа:\nx = " + x + "\ny = " + y + "\nz = " + z);
                        sc.nextLine();
                        System.out.println("Выберите операцию:\n1. x - y * z;\n2. x ^ y * z;\n3. x >>= y - z\n" +
                                "4. x >>= y ^ z;\n5. x - y ^ z;\n6. x - y - z;\n7. x ^ y ^ z;\n8. x >>= y >>= z;\n" +
                                "9. x *= y *= z;\n10. x > y || y > z || z > x;" +
                                "\n11. Ввести другие числа;\n0. Назад");
                        while (!sc.hasNextInt())
                            sc.next();
                        j = sc.nextInt();
                        sc.nextLine();
                        switch (j) {
                            case 1:
                                System.out.println("Результат: " + getMinUmn(x, y, z));
                                break;
                            case 2:
                                System.out.println("Результат: " + getUmnXor(x, y, z));
                                break;
                            case 3:
                                System.out.println("Результат: " + getMinSdv(x, y, z));
                                break;
                            case 4:
                                System.out.println("Результат: " + getXorSdv(x, y, z));
                                break;
                            case 5:
                                System.out.println("Результат: " + getMinXor(x, y, z));
                                break;
                            case 6:
                                System.out.println("Результат: " + getDoubleMin(x, y, z));
                                break;
                            case 7:
                                System.out.println("Результат: " + getDoubleXor(x, y, z));
                                break;
                            case 8:
                                System.out.println("Результат: " + getDoubleSdv(x, y, z));
                                break;
                            case 9:
                                System.out.println("Результат: " + getDoubleUmnR(x, y, z));
                                break;
                            case 10:
                                System.out.println("Результат: " + getDoubleOr(x, y, z));
                                break;
                            case 11:
                                j = 0;
                                b = true;
                                break;
                        }
                    }
                    sc.nextLine();
                    if (j == 0 && !b)
                        i = -1;
                }
            }
        }
    }

    @Test
    public void getUmnXorTest() {
        assertTrue(getDoubleSdv(1, -2, 54) == 0);
        assertEquals(-4, getDoubleSdv(-4, 21, 15));
        assertEquals(0, getDoubleSdv(123, -31, 345));
        assertTrue(getDoubleSdv(12, 47, 427) == 12);
    }

    @Test
    public void getUmnRTest() {
        assertEquals(464152108, getUmnR(14126, 32858));
        assertTrue(getUmnR(8745, 4321) == 37787145);
        assertEquals(-347046632, getUmnR(1432, -242351));
    }

    @Test
    public void getMenshTest() {
        assertTrue(!getMensh(124, 74));
        assertTrue(!getMensh(8521851, 84248));
        assertTrue(getMensh(-2135124, -4631));
        assertTrue(getMensh(-1234, 109834));
    }

    @Test
    public void getDoubleOrTest() {
        assertTrue(getDoubleOr(15, 725, 965));
        assertTrue(getDoubleOr(-25, 1142, -12558));
        assertTrue(getDoubleOr(264951, 62385, 27683));
    }

    @Test
    public void getMinTest() {
        assertEquals(601369, getMin(544158, -57211));
        assertTrue(getMin(58348585, 8265282) > 0);
        assertTrue(getMin(-337854, -1854885) > 0);
    }

    @Test
    public void getSdvTest() {
        assertEquals(161, getSdv(1324524, 37357));
        assertTrue(getSdv(-143627, 7473677) < 0);
        assertEquals(623, getSdv(1247, -1247));
        assertTrue(getSdv(216545889, 0) != 0);
    }

    @Test
    public void getDoubleXorTest() {
        assertTrue(getDoubleXor(91324, 89197, -1938) < 0);
        assertEquals(-1447, getDoubleXor(-1348, -73, -174));
        assertTrue(getDoubleXor(2475, 85483, 9236381) < 9336381);
        assertEquals(8608858, getDoubleXor(146, 8585432, 23568));
    }

    @Test
    public void getDoubleSdvTest() {
        assertEquals(17121929, getDoubleSdv(34243858, 325242, 84594));
        assertEquals(0, getDoubleSdv(1925721, -12927, 2357));
        assertTrue(getDoubleSdv(-261, -235287, -2375) <= -1);
        assertTrue(getDoubleSdv(0, 32, 1) == 0);
    }

    @Test
    public void getDoubleUmnRTest() {
        assertEquals(1753943208, getDoubleUmnR(385, -325699, 8251848));
        assertTrue(getDoubleUmnR(-285291, -32217, 4464) < -215842);
        assertTrue(getDoubleUmnR(-34, -34, -34) <= -39300);
        assertEquals(1405952191, getDoubleUmnR(2165, -2915, -2945));
    }

    @Test
    public void getXorTest() {
        assertTrue(getXor(731648, 3672) < 731648);
        assertEquals(14545, getXor(91324, 89197));
        assertTrue(getXor(2475, 9336381) < 10000000);
        assertEquals(32153, getXor(8585, 23568));
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SimpleCalc.class);
        System.out.println("Всего тестов: " + result.getRunCount());
        System.out.println("Завалено тестов: " + result.getFailureCount());
        if (result.getFailureCount() > 0)
            for (int i = 0; i < result.getFailureCount(); i++)
                System.out.println("Завалено: " + result.getFailures());
        System.out.println("Проигнорировано тестов: " + result.getIgnoreCount());
        System.out.println("Работает ли программа? Вердикт тестировщика: " + result.wasSuccessful());
        if (result.wasSuccessful()) {
            SimpleCalc sc = new SimpleCalc();
            sc.input();
        }
    }
}

