package springboot.micrometerpromethuesnewrelic.demo.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(RetailCustomerRegistrationInput.class)
public class RetailCustomerRegistrationSink {

	@StreamListener(target = RetailCustomerRegistrationInput.INPUT)
	public void processRetailCustomer(String retailCustomer) {
		System.out.println("Retail Customer Registered by Client " + retailCustomer);
	}
}
