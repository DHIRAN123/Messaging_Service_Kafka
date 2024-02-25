package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.deliveryboy.config.AppConstants;

public class KafkaService {

	
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		for(int i=1;i<=2000000;i++) {
		
		this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
		}
		return true;
	}
}
