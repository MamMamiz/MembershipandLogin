package membershipAndLoginHomework.business.concretes;

 
import membershipAndLoginHomework.business.abstracts.IUserService;
import membershipAndLoginHomework.core.utilites.IGoogleAuthService;
import membershipAndLoginHomework.core.utilites.Validation;
import membershipAndLoginHomework.dataAccess.abstracts.IUserDao;
import membershipAndLoginHomework.entites.concretes.User;

public class UserManager implements IUserService{

	private IUserDao userDao;
	private IGoogleAuthService authService;
	
	public UserManager(IUserDao userDao, IGoogleAuthService authService ) {
		this.userDao = userDao;
		this.authService = authService;
		
	
	}

	@Override
	public void save(User user) {
		
		if (user.getName().length() < 2 || user.getSurName().length() < 2) {
			System.out.println("Ad ve soyad en az 2 karakter olmalidir !");
			return;
		}

		if (user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakter olmalidir !");
			return;
		}

		if (!Validation.isValidEmail(user.getEmail())) {
			System.out.println("Email format yanlis tekrar deneyin !");
			return;
		}

		if (userDao.checkEmail(user.getEmail())) {
			System.out.println("Email daha önce kayitlidir.");
			return;
		}

		userDao.save(user);
		
		EmailManager email = new EmailManager();	
		email.send();

		
		
		
	}

	@Override
	public void login(String userName, String password) {
		
		userDao.login(userName, password);
		
		
	}

	@Override
	public void loginToGoogle() {
		
		authService.login();
	}

}
