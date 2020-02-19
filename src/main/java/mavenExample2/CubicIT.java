package mavenExample2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CubicIT {

	@RequestMapping(value = "/next", method = RequestMethod.GET)

	public String getStudents() {
		return "Information-Students";
	}
}
