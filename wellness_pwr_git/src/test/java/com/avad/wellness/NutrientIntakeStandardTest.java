package com.avad.wellness;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.avad.wellness.indicator.NutrientIntakeStandardIndicator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class NutrientIntakeStandardTest extends TestCase {
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NutrientIntakeStandardTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NutrientIntakeStandardTest.class );
    }


    public void testGetCarbohydrateIndicate()
    {    	
    	NutrientIntakeStandardIndicator indi = new NutrientIntakeStandardIndicator();
    	JSONParser jsonParser = new JSONParser();
    	
    	JSONObject jsonObject;
		try {
			String json = indi.getCarbohydrateIndicate(44);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -2);
	    	assertEquals(jsonObject.get("desc"), "매우 부족");
	    	
	    	json = indi.getCarbohydrateIndicate(45);
			jsonObject = (JSONObject) jsonParser.parse(json);
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -1);
	    	assertEquals(jsonObject.get("desc"), "부족");
	    	
	    	json = indi.getCarbohydrateIndicate(54.9);
			jsonObject = (JSONObject) jsonParser.parse(json);
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -1);
	    	assertEquals(jsonObject.get("desc"), "부족");
	    	
	    	json = indi.getCarbohydrateIndicate(60);
			jsonObject = (JSONObject) jsonParser.parse(json);
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 0);
	    	assertEquals(jsonObject.get("desc"), "적절");
	    	
	    	json = indi.getCarbohydrateIndicate(70);
			jsonObject = (JSONObject) jsonParser.parse(json);
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 1);
	    	assertEquals(jsonObject.get("desc"), "과잉");
	    	
	    	json = indi.getCarbohydrateIndicate(70.1);
			jsonObject = (JSONObject) jsonParser.parse(json);
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 2);
	    	assertEquals(jsonObject.get("desc"), "매우 과잉");
	    	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
    }
    
    public void testGetTotalFatIndicate() {
    	NutrientIntakeStandardIndicator indi = new NutrientIntakeStandardIndicator();
    	JSONParser jsonParser = new JSONParser();
    	
    	JSONObject jsonObject;
		try {
			String json = indi.getTotalFatIndicate(3);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -2);
	    	assertEquals(jsonObject.get("desc"), "매우 부족");
	    	
	    	json = indi.getTotalFatIndicate(10);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -1);
	    	assertEquals(jsonObject.get("desc"), "부족");
	    	
	    	json = indi.getTotalFatIndicate(35);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 1);
	    	assertEquals(jsonObject.get("desc"), "과잉");
	    	
	    	json = indi.getTotalFatIndicate(35.1);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 2);
	    	assertEquals(jsonObject.get("desc"), "매우 과잉");
	    	
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
    	
    }
    public void testGetUnsaturatedFatIndicate() {
    	NutrientIntakeStandardIndicator indi = new NutrientIntakeStandardIndicator();
    	JSONParser jsonParser = new JSONParser();
    	
    	JSONObject jsonObject;
		try {
			String json = indi.getUnsaturatedFatIndicate(1);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -2);
	    	assertEquals(jsonObject.get("desc"), "매우 부족");
	    	
	    	json = indi.getUnsaturatedFatIndicate(2);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -1);
	    	assertEquals(jsonObject.get("desc"), "부족");
	    	
	    	json = indi.getUnsaturatedFatIndicate(11);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 0);
	    	assertEquals(jsonObject.get("desc"), "적절");
	    	
	    	json = indi.getUnsaturatedFatIndicate(11.1);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 1);
	    	assertEquals(jsonObject.get("desc"), "충분");
	    	
	    	json = indi.getUnsaturatedFatIndicate(25.1);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 2);
	    	assertEquals(jsonObject.get("desc"), "과잉");
	    	
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
    	
    }
    
    public void testGetVitaminDIndicate() {
    	NutrientIntakeStandardIndicator indi = new NutrientIntakeStandardIndicator();
    	JSONParser jsonParser = new JSONParser();
    	
    	JSONObject jsonObject;
		try {
			String json = indi.getVitaminDIndicate(1.9);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -2);
	    	assertEquals(jsonObject.get("desc"), "매우 부족");
	    	
	    	json = indi.getVitaminDIndicate(5);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -1);
	    	assertEquals(jsonObject.get("desc"), "부족");
	    	
	    	json = indi.getVitaminDIndicate(99.1);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 0);
	    	assertEquals(jsonObject.get("desc"), "적절");
	    	
	    	json = indi.getVitaminDIndicate(100);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 0);
	    	assertEquals(jsonObject.get("desc"), "적절");
	    	
	    	json = indi.getVitaminDIndicate(101);
			jsonObject = (JSONObject) jsonParser.parse(json);			

			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 1);
	    	assertEquals(jsonObject.get("desc"), "과잉");
	    	
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
    	
    }
    
    public void testCalorieIndicate() {
    	NutrientIntakeStandardIndicator indi = new NutrientIntakeStandardIndicator();
    	JSONParser jsonParser = new JSONParser();
    	
    	JSONObject jsonObject;
		try {
			String json = indi.getTotalCalorieIndicate(1599, 19, true);
			jsonObject = (JSONObject) jsonParser.parse(json);	
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -2);
	    	assertEquals(jsonObject.get("desc"), "매우 부족");
	    	
	    	json = indi.getTotalCalorieIndicate(1599, 19, false);
			jsonObject = (JSONObject) jsonParser.parse(json);	
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -1);
	    	assertEquals(jsonObject.get("desc"), "부족");
	    	
	    	json = indi.getTotalCalorieIndicate(1599, 10, false);
			jsonObject = (JSONObject) jsonParser.parse(json);	
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -99);
	    	assertEquals(jsonObject.get("desc"), "평가 불가");
	    	
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
    }
    
    public void testWaterIndicate() {
    	NutrientIntakeStandardIndicator indi = new NutrientIntakeStandardIndicator();
    	JSONParser jsonParser = new JSONParser();
    	
    	JSONObject jsonObject;
		try {
			String json = indi.getWaterIndicate(2599, 19, true);
			jsonObject = (JSONObject) jsonParser.parse(json);	
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 0);
	    	assertEquals(jsonObject.get("desc"), "부족");
	    	
	    	json = indi.getWaterIndicate(2600, 19, true);
			jsonObject = (JSONObject) jsonParser.parse(json);	
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == 1);
	    	assertEquals(jsonObject.get("desc"), "충분");
	    	
	    	json = indi.getWaterIndicate(2800, 67, false);
			jsonObject = (JSONObject) jsonParser.parse(json);	
			
			System.out.println(jsonObject);
			
			assertTrue(((Long)(jsonObject.get("code"))).intValue() == -99);
	    	assertEquals(jsonObject.get("desc"), "평가 불가");
	    	
	    	
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
    }
    
    

}
