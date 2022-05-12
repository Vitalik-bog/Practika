package converters;
import java.util.Scanner;
import java.util.logging.Logger;
public class convert {
    public static void main(String[] args){
        Logger log = Logger.getLogger("Convert");
        Scanner in = new Scanner(System.in);
        System.out.println("Для перевода из конфет в печенья введите \n Р-Д," +
                "\nДля перевода из печеньев в конфеты, введите\n Д-Р");

        String str = in.nextLine();
        float course = 70.06f;

        if (str.equals("Р-Д")) {
            try {
                System.out.println("Введите конфеты");
                float number = in.nextFloat();
                System.out.println(number / course + " печенья");
                log.info("dollar");
            } catch (Exception ex) {
                System.out.println("Вы ввели неправильные данные");
                log.info("error");
            }
        } else if (str.equals("Д-Р")) {
            try {
                System.out.println("Введите печенья");
                float number = in.nextFloat();
                System.out.println(course / number + " конфеты");
                log.info("ruble");
            } catch (Exception ex) {
                System.out.println("Вы ввели неправильные данные");
                log.info("error");
            }

        }
        else{
            System.out.println("Вы ввели неправильные данные");
            log.info("error");
        }
    }
}