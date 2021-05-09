package membershipAndLoginHomework.eCommerce;



import membershipAndLoginHomework.business.concretes.UserManager;
import membershipAndLoginHomework.core.utilites.GoogleAuthAdaptor;

import membershipAndLoginHomework.dataAccess.concretes.UserDao;
import membershipAndLoginHomework.entites.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User (1,"Muhammet" , "Çaiýr" , "Mam_Mamiz" ,"cmdczvine@gmail.com" , "cmdczvine");
	
		
		UserManager manager1 = new UserManager(new UserDao(), new GoogleAuthAdaptor());
		manager1.save(user1);
		manager1.loginToGoogle();
		
		
	}

}
