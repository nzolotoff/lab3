import java.util.regex.*;
import java.util.Scanner;

public class regex {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите вашу дату в формате dd/mm/yyyy");
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        input.close();
        //Pattern p = Pattern.compile("^(0[1-9]|[1-2]\\d|3[0-1])\\/(0[1-9]|1[0-2])\\/(19\\d{2}|[2-9]\\d{3})$"); // v1
        //Pattern p = Pattern.compile("^((0[1-9]|[1-2]\\d|3[0])\\/(0[2469]|1[1])|^(0[1-9]|[1-2]\\d|3[01])\\/(0[13578]|1[02]))\\/(19\\d{2}|[2-9]\\d{3})$"); //updated no feb
        Pattern p = Pattern.compile("^((0[1-9]|[1-2]\\d|3[0])\\/(0[469]|1[1])|^(0[1-9]|[1-2]\\d|3[01])\\/(0[13578]|1[02])|(0[1-9]|1\\d|2[0-8])\\/(02))\\/(19\\d{2}|[2-9]\\d{3})$"); //correct version
        Matcher m = p.matcher(data);
        if (m.matches() == true){
            System.out.println("Ваша дата соответствует формату");
        }
        else {
            System.out.println("Ваша дата не соответствует заданному формату");
        }
    }
}
