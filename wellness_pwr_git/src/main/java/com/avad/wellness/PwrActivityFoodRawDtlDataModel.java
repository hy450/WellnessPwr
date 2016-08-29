package com.avad.wellness;

public class PwrActivityFoodRawDtlDataModel {
	String food_dtl_logged_id;
	String provider_id;
	String provider_description;
	int starttime;
	int inputtime;
	int savetime;
	String food_pic;  //delim ","
	int meal_type; // BREAKFAST =1 ,LUNCH=2,DINNER=3,MORNING_SNACK=4,	AFTERNOON_SNACK=5,EVENING_SNACK=6
	String food_name;
	String food_brand;
	int main_cat = -1;
	int middle_cat = -1;
	int sub_cat = -1;
	double amount;
	double calorie;
	double total_fat = -1;
	double saturated_fat = -1;
	double polysaturated_fat = -1;
	double monosaturated_fat = -1;
	double unsaturated_fat = -1;
	double trans_fat = -1;
	double carbohydrate = -1;
	double dietary_fiber = -1;
	double sugar = -1;
	double protein = -1;
	double cholestrol = -1;
	double sodium = -1;
	double potassium = -1;
	double vitamin_c = -1;
	double vitamin_d = -1;
	double calcium = -1;
	double iron = -1;	
	
	
	
	public String getFood_dtl_logged_id() {
		return food_dtl_logged_id;
	}



	public void setFood_dtl_logged_id(String food_dtl_logged_id) {
		this.food_dtl_logged_id = food_dtl_logged_id;
	}



	public String getProvider_id() {
		return provider_id;
	}



	public void setProvider_id(String provider_id) {
		this.provider_id = provider_id;
	}



	public String getProvider_description() {
		return provider_description;
	}



	public void setProvider_description(String provider_description) {
		this.provider_description = provider_description;
	}



	public int getStarttime() {
		return starttime;
	}



	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}



	public int getInputtime() {
		return inputtime;
	}



	public void setInputtime(int inputtime) {
		this.inputtime = inputtime;
	}



	public int getSavetime() {
		return savetime;
	}



	public void setSavetime(int savetime) {
		this.savetime = savetime;
	}



	public String getFood_pic() {
		return food_pic;
	}



	public void setFood_pic(String food_pic) {
		this.food_pic = food_pic;
	}



	public int getMeal_type() {
		return meal_type;
	}



	public void setMeal_type(int meal_type) {
		this.meal_type = meal_type;
	}
	
	public void setMeal_type(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.meal_type = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.meal_type = ((Integer)value).intValue();
		}else if( value instanceof Double){
			this.meal_type = ((Double)value).intValue();
		}else if( value instanceof Float){
			this.meal_type = ((Float)value).intValue();
		}	
	}


	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	
	public void setFoodName(Object value, MappingInfo typeInfo){
		if( value instanceof String)
			this.food_name = (String)value;
	}

	public String getFood_brand() {
		return food_brand;
	}

	public void setFood_brand(String food_brand) {
		this.food_brand = food_brand;
	}

	public int getMain_cat() {
		return main_cat;
	}

	public void setMain_cat(int main_cat) {
		this.main_cat = main_cat;
	}

	public int getMiddle_cat() {
		return middle_cat;
	}

	public void setMiddle_cat(int middle_cat) {
		this.middle_cat = middle_cat;
	}

	public int getSub_cat() {
		return sub_cat;
	}

	public void setSub_cat(int sub_cat) {
		this.sub_cat = sub_cat;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setAmount(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.amount = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.amount = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.amount = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.amount = ((Float)value).doubleValue();
		}	
	}

	public double getCalorie() {
		return calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}
	
	public void setCalorie(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.calorie = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.calorie = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.calorie = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.calorie = ((Float)value).doubleValue();
		}	
	}

	public double getTotal_fat() {
		return total_fat;
	}

	public void setTotal_fat(double total_fat) {
		this.total_fat = total_fat;
	}
	
	public void setTotal_fat(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.total_fat = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.total_fat = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.total_fat = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.total_fat = ((Float)value).doubleValue();
		}	
	}

	public double getSaturated_fat() {
		return saturated_fat;
	}

	public void setSaturated_fat(double saturated_fat) {
		this.saturated_fat = saturated_fat;
	}
	
	public void setSaturated_fat(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.saturated_fat = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.saturated_fat = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.saturated_fat = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.saturated_fat = ((Float)value).doubleValue();
		}	
	}

	public double getPolysaturated_fat() {
		return polysaturated_fat;
	}

	public void setPolysaturated_fat(double polysaturated_fat) {
		this.polysaturated_fat = polysaturated_fat;
	}
	
	public void setPolysaturated_fat(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.polysaturated_fat = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.polysaturated_fat = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.polysaturated_fat = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.polysaturated_fat = ((Float)value).doubleValue();
		}	
	}

	public double getMonosaturated_fat() {
		return monosaturated_fat;
	}

	public void setMonosaturated_fat(double monosaturated_fat) {
		this.monosaturated_fat = monosaturated_fat;
	}
	
	public void setMonosaturated_fat(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.monosaturated_fat = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.monosaturated_fat = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.monosaturated_fat = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.monosaturated_fat = ((Float)value).doubleValue();
		}	
	}

	public double getUnsaturated_fat() {
		return unsaturated_fat;
	}

	public void setUnsaturated_fat(double unsaturated_fat) {
		this.unsaturated_fat = unsaturated_fat;
	}
	
	public void setUnsaturated_fat(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.unsaturated_fat = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.unsaturated_fat = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.unsaturated_fat = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.unsaturated_fat = ((Float)value).doubleValue();
		}	
	}

	public double getTrans_fat() {
		return trans_fat;
	}

	public void setTrans_fat(double trans_fat) {
		this.trans_fat = trans_fat;
	}
	
	public void setTrans_fat(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.trans_fat = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.trans_fat = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.trans_fat = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.trans_fat = ((Float)value).doubleValue();
		}	
	}

	public double getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	
	public void setCarbohydrate(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.carbohydrate = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.carbohydrate = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.carbohydrate = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.carbohydrate = ((Float)value).doubleValue();
		}	
	}

	public double getDietary_fiber() {
		return dietary_fiber;
	}

	public void setDietary_fiber(double dietary_fiber) {
		this.dietary_fiber = dietary_fiber;
	}
	
	public void setDietary_fiber(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.dietary_fiber = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.dietary_fiber = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.dietary_fiber = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.dietary_fiber = ((Float)value).doubleValue();
		}	
	}

	public double getSugar() {
		return sugar;
	}

	public void setSugar(double sugar) {
		this.sugar = sugar;
	}
	
	public void setSugar(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.sugar = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.sugar = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.sugar = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.sugar = ((Float)value).doubleValue();
		}	
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}
	
	public void setProtein(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.protein = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.protein = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.protein = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.protein = ((Float)value).doubleValue();
		}	
	}

	public double getCholestrol() {
		return cholestrol;
	}


	public void setCholestrol(double cholestrol) {
		this.cholestrol = cholestrol;
	}
	
	public void setCholestrol(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.cholestrol = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.cholestrol = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.cholestrol = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.cholestrol = ((Float)value).doubleValue();
		}	
	}

	public double getSodium() {
		return sodium;
	}

	public void setSodium(double sodium) {
		this.sodium = sodium;
	}
	
	public void setSodium(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.sodium = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.sodium = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.sodium = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.sodium = ((Float)value).doubleValue();
		}	
	}

	public double getPotassium() {
		return potassium;
	}

	public void setPotassium(double potassium) {
		this.potassium = potassium;
	}
	
	public void setPotassium(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.potassium = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.potassium = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.potassium = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.potassium = ((Float)value).doubleValue();
		}	
	}

	public double getVitamin_c() {
		return vitamin_c;
	}

	public void setVitamin_c(double vitamin_c) {
		this.vitamin_c = vitamin_c;
	}
	
	public void setVitamin_c(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.vitamin_c = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.vitamin_c = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.vitamin_c = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.vitamin_c = ((Float)value).doubleValue();
		}	
	}

	public double getVitamin_d() {
		return vitamin_d;
	}

	public void setVitamin_d(double vitamin_d) {
		this.vitamin_d = vitamin_d;
	}
	
	public void setVitamin_d(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.vitamin_d = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.vitamin_d = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.vitamin_d = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.vitamin_d = ((Float)value).doubleValue();
		}	
	}


	public double getCalcium() {
		return calcium;
	}

	public void setCalcium(double calcium) {
		this.calcium = calcium;
	}
	
	public void setCalcium(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.calcium = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.calcium = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.calcium = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.calcium = ((Float)value).doubleValue();
		}	
	}

	public double getIron() {
		return iron;
	}

	public void setIron(double iron) {
		this.iron = iron;
	}
	
	public void setIron(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.iron = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.iron = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.iron = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.iron = ((Float)value).doubleValue();
		}	
	}

}
