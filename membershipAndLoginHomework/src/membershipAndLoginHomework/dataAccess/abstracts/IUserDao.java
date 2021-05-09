package membershipAndLoginHomework.dataAccess.abstracts;

import membershipAndLoginHomework.entites.concretes.User;

public interface IUserDao {
	
	void save (User user);
	
	boolean checkEmail (String email);
	
	void login(String userName , String password);
	
	

}
