package springboot.micrometerpromethuesnewrelic.demo.stream;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InstiutionalCustomerRegistrationInput {

	public static final String INPUT="institutional-customer-stream";
	@Input(INPUT)
	SubscribableChannel retreiveInstitutionalCustomers();
}
