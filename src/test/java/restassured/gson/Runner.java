package restassured.gson;

import com.google.gson.Gson;

public class Runner {
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		//System.out.println(emp);
		
		Gson gson=new Gson();
		String json = gson.toJson(emp);
		System.out.println("POJO to Json Convertion:"+json);
		
		Employee fromJson = gson.fromJson(json, Employee.class);
		System.out.println("Json to POJO convertion:"+fromJson);
	}

}
