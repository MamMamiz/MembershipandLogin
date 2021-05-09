package membershipAndLoginHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import membershipAndLoginHomework.dataAccess.abstracts.IUserDao;
import membershipAndLoginHomework.entites.concretes.User;

public class UserDao implements IUserDao{

	private List <User> users;
	
	public UserDao () {
		users = new ArrayList<User>();
	}
	
	
	@Override
	public void save(User user) {
		
		users.add(user);
		System.out.println(user.getName() + " " + user.getSurName() + " adl� ki�i sisteme kaydedilmi�tir ! ");
	
		
	}

	@Override
	public boolean checkEmail(String email) {
		boolean emailCheck = false;
		
		for (User user : users) {
			if (user.getEmail().equalsIgnoreCase(email)) {
				emailCheck = true;
			
				// equalIsIgnoreCase 2 string ifadeninn birbirine e�it olup olmad���n� kontrol eder.
			}
			
		}
		
		return emailCheck;	
	}

	@Override
	public void login(String userName, String password) {
		
		for (User user : users) {
			if (user.getUserName() == userName && user.getPassword() == password) {
				
				System.out.println("Girilen bilgiler do�rudur. Sisteme y�nlendiriliyorsunuz !");
			}
			else {
				System.out.println("Girilen bilgiler hatal�d�r ! ");
			}
		}
		
	}


		

	
	

}
