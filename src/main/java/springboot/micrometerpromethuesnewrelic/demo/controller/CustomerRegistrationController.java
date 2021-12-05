package springboot.micrometerpromethuesnewrelic.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.micrometerpromethuesnewrelic.demo.model.Customer;
import springboot.micrometerpromethuesnewrelic.demo.stream.CustomerRegistrationSource;

@RestController
@EnableBinding(CustomerRegistrationSource.class)
public class CustomerRegistrationController {

	@Autowired
	CustomerRegistrationSource customerRegistrationSource;

	@RequestMapping("/register")
	@ResponseBody
	public String orderFood(@RequestBody Customer customer) {
		customerRegistrationSource.customerRegistration().send(MessageBuilder.withPayload(customer).build());
		System.out.println(customer.toString());
		return "Message from controller- Customer Registered";
	}
}
