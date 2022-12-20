package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class LogTestController {

//	private final Logger log = LoggerFactory.getLogger(LogTestController.class);

	@RequestMapping("/log-test")
	public String logTest() {
		String name = "LogTestController.logTest";

		log.trace("TRACE LOG = {}", name);
		log.debug("DEBUG LOG = {}", name);

		log.info("INFO LOG = {}", name);
		log.warn("WARN LOG = {}", name);
		log.error("ERROR LOG = {}", name);

		return "ok";
	}
}
