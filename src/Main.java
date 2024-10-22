import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();
           // ArrayList<Aerolinea> aero = mapper.readValue(new File("archi.json"),ArrayList.class);
            HashMap aero = mapper.readValue(new File("archi.json"),HashMap.class);

        }
        catch(StreamWriteException e)  {
            System.out.println("stream mal");
        }
        catch(DatabindException e){
            System.out.println("data bind mal");
        }
        catch (IOException e) {
            System.out.println("algo malio sal.\n");
        }

    }
}