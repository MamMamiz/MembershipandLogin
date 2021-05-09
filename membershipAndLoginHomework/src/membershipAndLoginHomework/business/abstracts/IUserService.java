package membershipAndLoginHomework.business.abstracts;

import membershipAndLoginHomework.entites.concretes.User;

public interface IUserService {
	
	void save (User user);
	
	void login(String userName , String password);
	
	void loginToGoogle();
	

}
