package model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class WelcomeService {
	public String getMsg() {
		return "Welcome";
	}
}