package Packe_JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class App1 {
    public static void main(String[] args) throws IOException {
       readWriteJSON();
        System.out.println();
        //return;
    }

    private static void readWriteJSON() throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        String jsonInput ="{\"id\":0,\"firstName\":\"Robin\",\"lastName\":\"Wilson\"}";
        Person1 q=mapper.readValue(jsonInput,Person1.class);
        System.out.println("Read and parsed Person from JASON:"+q);

        Person1 p=new Person1("Roger", "Rabbit", 74302122);
        System.out.println("Person object "+p+"as JSON");
        mapper.writeValue(System.out,p);
    }
}
