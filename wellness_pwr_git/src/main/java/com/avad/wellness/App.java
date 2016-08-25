package com.avad.wellness;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.*;
import org.json.simple.parser.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        JSONParser parser = new JSONParser();
        
        try{
        	Object obj = parser.parse( new FileReader("C:\\Users\\Administrator\\workspace\\wellness\\fitbit_today_acdtivity.json"));
        	
        	JSONObject jsonObject = (JSONObject)obj;
        	
        	JSONObject summary = (JSONObject) jsonObject.get("summary");        	
        	JSONArray distances = (JSONArray) summary.get("distances");
        	
        	int index = 0;
        	
        	if( distances == null) {
        		System.out.println("null");
        	}else {
        		
        		JSONObject distance_item = (JSONObject)distances.get(0);
        		if( distance_item ==null  )System.out.println("jsonobject null");
        		
        		System.out.println(" distacne : " + distance_item.get("distance"));
        	}
        	
        }catch(IOException e){
        	
        }catch(ParseException e){
        	
        }
    }
}
