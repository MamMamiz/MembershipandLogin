package membershipAndLoginHomework.business.concretes;



import membershipAndLoginHomework.business.abstracts.IAuthService;
import membershipAndLoginHomework.core.utilites.Validation;
import membershipAndLoginHomework.entites.concretes.User;

public class AuthManager implements IAuthService{

	@Override
	public void login(User user) {
	
		
		if (!(Validation.isValidEmail(user.getEmail()) && user.getEmail().length()>0)) {
			System.out.println("Email formati veya  Email karakter uzunlugu bos birakilmamali !");
			return;
		}
		if (!user.getPassword().isEmpty() && user.getPassword().length()>=6) {
			System.out.println("Parola bos birakilmamali ve 6 karakterden az olamamlidir !");
			return;
		}
	}
	

}
