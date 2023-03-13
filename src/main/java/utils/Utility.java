/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import dtos.PersonDTO;
import java.util.Properties;
import java.util.Set;
import com.google.gson.*;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author tha
 */
public class Utility {
    private static Gson gson = new GsonBuilder().create();
    
    public static void printAllProperties() {
            Properties prop = System.getProperties();
            Set<Object> keySet = prop.keySet();
            for (Object obj : keySet) {
                    System.out.println("System Property: {" 
                                    + obj.toString() + "," 
                                    + System.getProperty(obj.toString()) + "}");
            }
    }
    
    public static PersonDTO jsonToDTO(String json) throws UnsupportedEncodingException{
            return gson.fromJson(new String(json.getBytes("UTF8")), PersonDTO.class);
    }
    
    public static String DTOToJson(PersonDTO rmDTO){
        return gson.toJson(rmDTO, PersonDTO.class);
    }
    
    public static void main(String[] args) throws UnsupportedEncodingException {
//        printAllProperties();
        
        //Test json2DTO and back again
        String str2 = "{'id':1, 'str1':'Dette er den første tekst', 'str2':'Her er den ANDEN'}";
        PersonDTO rmDTO = jsonToDTO (str2);
        System.out.println(rmDTO);
        
        String backAgain = DTOToJson(rmDTO);
        System.out.println(backAgain);
    }

}
