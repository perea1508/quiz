/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONObject;
import org.json.XML;

/**
 *
 * @author Andres
 */
public class Laboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList<Plantas> list = new ArrayList<>();

        String[] plan = new String[4];
        for (int i = 0; i < plan.length; i++) {
            plan[0] = "cilantro";
            plan[1] = "10";
            plan[2] = "hierva";
            plan[3] = "15";
            
            System.out.println(plan.toString());
        }

        String jsonStr = "{\"errors\": {\"error\": \"No encontrado\",\"code\": [\"1\",\"0\"]}}";
        JSONObject json = new JSONObject(jsonStr);
        String xml = XML.toString(json);
        String xml_data = XML.toString(json);
        System.out.println(xml_data);
    }

}
