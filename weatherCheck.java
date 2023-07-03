import java.io.*;
import java.net.*;
class weatherCheck{

///key  682aaa6b30334ea0b46102458230107
    public weatherCheck(){

    }
    public void createConection (String city) throws IOException{
        
        String urlApi = "http://api.weatherapi.com/v1/current.json?key=682aaa6b30334ea0b46102458230107&q=" + city;
       
        URL url = new URL(urlApi);//creating the URL object
        HttpURLConnection http = (HttpURLConnection)url.openConnection();//establishing the conection between the program and the api website
        http.setRequestMethod("GET");
        if(http.getResponseCode()==HttpURLConnection.HTTP_OK){
          BufferedReader bf = new BufferedReader( new InputStreamReader(http.getInputStream()));
          String weatherJson = bf.readLine();
          dataProcessor(weatherJson);
        }
       
    }


    public void dataProcessor(String data){
        int ind1 = data.indexOf("name")+7;
        int ind2 = data.indexOf("region")-3;
        String city = data.substring(ind1, ind2);

        ind1 = data.indexOf("temp_c")+8;
        ind2 = data.indexOf("temp_f")-2;
        String temp = data.substring(ind1, ind2);

        ind1 = data.indexOf("condition")+20;
        ind2 = data.indexOf("icon")-3;
        String cond = data.substring(ind1, ind2);
        

        System.out.println("Temperature: "+temp+ "C" );
        System.out.println("Condition: " +cond);
        if(temp==""){
            System.out.println("Invalid city");
        }
        
    }

}