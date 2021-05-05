package com.cowin.vaccine;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@EnableScheduling
@RestController
public class COntroller {

	@Autowired
	RestService rr;
	
	@Autowired
    private JavaMailSender javaMailSender;
	
	@Scheduled(cron = "0 0 * * * *")
	@GetMapping("/Vaccine")
	public ArrayList<String> aa()
	{
		String pincode="827013";
    	SimpleDateFormat f= new SimpleDateFormat("dd-MM-yyyy");
    	Date d= new Date();
    	String Date=f.format(d);
    	ArrayList<String> hash= new ArrayList<String>();
    	
        String url = "https://cdn-api.co-vin.in/"
        		+ "api/v2/appointment/sessions/public/calendarByPin?pincode="
        		+ ""+pincode+"&date="+Date+"&vaccine=COVAXIN";
       
		ResponseEntity<maincenter> re=new RestTemplate().
				getForEntity(url, 
						maincenter.class);
		maincenter userr= re.getBody();
		
		for(centers c:userr.getCenters())
		{
			for(sessions s:c.getSessions())
			{
				if(!s.getMin_age_limit().equalsIgnoreCase("45"))
				{
					s.setFlag(8);
					hash.add("At Center: "+c.getName()+" ,Number of vaccines found="+s.getAvailable_capacity()+" on "+s.getDate());
				}
			}
		}
		if(hash.isEmpty())
		{
			hash.add("Vaccine not found for Pin: "+pincode+", Please have patience");
		}
		SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("kanchaniabhi75@gmail.com");

        msg.setSubject("I love you");
        msg.setText(hash.toString());

        javaMailSender.send(msg);
    	
		return hash;
	
	}
	
}
