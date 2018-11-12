package test2;

import javax.json.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class JSONMain   {
    public static final String JSON_FILE = "src\\test2\\employee.txt";

    public static void main(String[] args) throws IOException {
       try {


        InputStream fis = new FileInputStream(JSON_FILE);

        JsonReader jsonReader = Json.createReader(fis);
        JsonObject jsonObject = jsonReader.readObject();

        jsonReader.close();
        fis.close();

        Employee emp = new Employee();
        emp.setId(jsonObject.getInt("id"));
        emp.setName(jsonObject.getString("name"));
        emp.setPermanent(jsonObject.getBoolean("permanent"));
        emp.setRole(jsonObject.getString("role"));

        /*read array from json*/
        JsonArray jsonArray = jsonObject.getJsonArray("phoneNumbers");
        long[]numbers = new long[jsonArray.size()];
        int index = 0;
        for (JsonValue value : jsonArray) {
            numbers[index++] = Long.parseLong(value.toString());
        }
        emp.setPhonenumbers(numbers);

        JsonObject innerJsonObject = jsonObject.getJsonObject("address");
        Address address = new Address();
        address.setStreet(innerJsonObject.getString("street"));
        address.setCity(innerJsonObject.getString("city"));
        address.setZipcode(innerJsonObject.getInt("zipcode"));
         emp.setAddress(address);
        System.out.println(emp);
    }
      catch (Exception ex){
           ex.printStackTrace();
      }
    }
}
