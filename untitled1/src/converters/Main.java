package converters;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

//        File file = new File("C:\\Users\\14\\A git work");
//        PrintWriter pw = new PrintWriter(file);

        System.out.println("Вы хотите испечь пироженные с малиной или с черникой?");
        System.out.println("Введите с чем,  введите размер, введите высоту");
        Scanner i = new Scanner(System.in);
        String enter = i.nextLine();
        if (!isaBoolean(enter)) {
            System.out.println("Неккоректные данные");
            //pw.println("Неккоректные данные");

        }
        if (enter.equals("мм")) {
            System.out.print("Введите количество начинки, разделяя целую и дробную часть точкой: ");
            BigDecimal nanometres = new BigDecimal(i.nextLine());
            nanometres = nanometres.setScale(5, RoundingMode.DOWN);
            System.out.println("ММ: " + nanometres + " НМ: " + getMultiply(nanometres));
            //pw.println("ММ: " + nanometres + " НМ: " + getMultiply(nanometres));

        } else {
            System.out.print("Введите количество начинки, разделяя целую и дробную часть точкой: ");
            BigDecimal millimetres = new BigDecimal(i.nextLine());
            millimetres = millimetres.setScale(5, RoundingMode.DOWN);
            System.out.println("НМ: " + millimetres + " ММ: " + getDivide(millimetres));
            //pw.println("НМ: " + millimetres + " ММ: " + getDivide(millimetres));
            //pw.close();

        }
    }

    public static boolean isaBoolean(String enter) {
        return enter.equals("нн") || enter.equals("нн");
    }

    public static BigDecimal getDivide(BigDecimal millimetres) {
        return millimetres.divide(BigDecimal.valueOf(1000000));
    }

    public static BigDecimal getMultiply(BigDecimal nanometres) {
        return nanometres.multiply(BigDecimal.valueOf(1000000));
    }

    public static Float test(float v) {

        return null;
    }
}
