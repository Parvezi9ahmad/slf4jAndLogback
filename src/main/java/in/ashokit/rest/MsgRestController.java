package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	Logger logger = LoggerFactory.getLogger(MsgRestController.class);

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		logger.trace("this is log -Trace msg");
		logger.debug("this is log -Debug msg");
		logger.info("this is log -Info msg");
		logger.warn("this is log -warn msg");
		logger.error("this is log -Error msg");

		String msg = "Welcome to Ashok IT...";

		return msg;
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg = "Good Morning...";
		
		return msg;
	}
}
