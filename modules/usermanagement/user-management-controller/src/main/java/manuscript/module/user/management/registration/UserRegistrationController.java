package manuscript.module.user.management.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import manuscript.module.user.management.registration.UserRegistrationService;
import manuscript.module.user.management.request.UserRegistrationRequest;
import manuscript.module.user.management.response.UserRegistrationResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Controller
@RequestMapping(value = "/registration")
public class UserRegistrationController {

	@Autowired
	private UserRegistrationService userRegistrationService;

	// @RequestMapping("/proload")
	// public void proload() {
	//
	// }

	@RequestMapping(value = "/create")
	@ResponseBody
	public UserRegistrationResponse createRegistration(@RequestBody UserRegistrationRequest request) {
		return userRegistrationService.createRegistration(request);
	}
}
