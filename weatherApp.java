import java.io.IOException;
import java.util.*;
class weatherApp{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean cont = true;
        while(cont){
        System.out.println("Enter the city");
        String city = scan.nextLine();
        city = city.replace(" ", "+");
        weatherCheck  weather = new weatherCheck();

        weather.createConection(city);
        System.out.println("Do you wish to continue? Press any key for YES, and 'n' for NO");
        String c = scan.nextLine();


        if(c.trim().equals("n")){
            cont = false;
        }
       System.out.println(cont);
    }
    }}