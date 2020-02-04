package kth.iv1201.grupp10.recruitmentApplication.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kth.iv1201.grupp10.recruitmentApplication.domain.Authenticator;
import kth.iv1201.grupp10.recruitmentApplication.domain.User;
import kth.iv1201.grupp10.recruitmentApplication.domain.UserLoginCredentials;

/**
 * @author Siavash
 * Calls the appropriate methods in the domain to serve the client. 
 */
@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class ApplicantService {
	
	@Autowired
	private Authenticator authenticator;
	
	public void login(UserLoginCredentials userLoginCredentials) {
		this.authenticator.authenticate(userLoginCredentials);
	}
	
	public void register(User user) {
		
	}

}