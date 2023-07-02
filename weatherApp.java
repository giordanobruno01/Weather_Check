import java.io.IOException;
import java.util.*;
class weatherApp{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the city");
        String city = scan.nextLine();
        weatherCheck  weather = new weatherCheck();
        weather.createConection(city);

    }
}