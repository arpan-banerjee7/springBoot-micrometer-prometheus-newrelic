package springboot.micrometerpromethuesnewrelic.demo.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface RetailCustomerRegistrationInput {

	public static final String INPUT="retail-customer-stream";
	@Input(INPUT)
	SubscribableChannel retreiveRetailCustomers();
}
