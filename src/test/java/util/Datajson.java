package util;

import pojo.Bookingdates;
import pojo.Root;

public class Datajson {
	
	public Root generatebooking() {
		Root r=new Root();
		r.setFirstname("q");
		r.setLastname("r");
		r.setTotalprice(1);
		r.setDepositpaid(true);
		Bookingdates b=new Bookingdates();
		b.setCheckin("12/05/4564");
		b.setCheckout("30/12/5346");
		r.setBookingdates(b);
		r.setAdditionalneeds("a,b");
		return r;
	}

}
