package util;

public class Jsons {
	
	
	
	public String createbooking() {
		return "{\n"
				+ "    \"firstname\": \"Jim1\",\n"
				+ "    \"lastname\": \"Brown\",\n"
				+ "    \"totalprice\": 111,\n"
				+ "    \"depositpaid\": true,\n"
				+ "    \"bookingdates\": {\n"
				+ "        \"checkin\": \"2018-01-01\",\n"
				+ "        \"checkout\": \"2019-01-01\"\n"
				+ "    },\n"
				+ "    \"additionalneeds\": \"Breakfast\"\n"
				+ "}";
	}

}
