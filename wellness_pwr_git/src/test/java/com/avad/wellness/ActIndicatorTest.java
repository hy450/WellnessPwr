package com.avad.wellness;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.avad.wellness.indicator.ActIndicator;
import com.avad.wellness.indicator.NutrientIntakeStandardIndicator;

public class ActIndicatorTest extends TestCase {
	/**
    * Create the test case
    *
    * @param testName name of the test case
    */
   public ActIndicatorTest( String testName )
   {
       super( testName );
   }

   /**
    * @return the suite of tests being tested
    */
   public static Test suite()
   {
       return new TestSuite( ActIndicatorTest.class );
   }


   public void testGetActIndicator()
   {    	
	    ActIndicator indi = new ActIndicator();
   		JSONParser jsonParser = new JSONParser();
   	
   		JSONObject jsonObject;
   		
   		try {
			String json = indi.getPhysicalActStage(4800);
			jsonObject = (JSONObject) jsonParser.parse(json);	
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 0);
	    	assertEquals(jsonObject.get("desc"), "좌식생활자");
	    	
	    	json = indi.getPhysicalActStage(7400);
			jsonObject = (JSONObject) jsonParser.parse(json);	
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 1);
	    	assertEquals(jsonObject.get("desc"), "활동부족");
	    	
	    	json = indi.getPhysicalActStage(15200);
			jsonObject = (JSONObject) jsonParser.parse(json);	
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 4);
	    	assertEquals(jsonObject.get("desc"), "상당히 활동적");
	    	
	    	
	    	
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
   }

}
