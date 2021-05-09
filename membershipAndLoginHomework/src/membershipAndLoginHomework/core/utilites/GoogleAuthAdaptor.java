package membershipAndLoginHomework.core.utilites;

import membershipAndLoginHomework.googleAuth.GoogleAuthManager;

public class GoogleAuthAdaptor implements IGoogleAuthService{

	GoogleAuthManager manager;
	
	
	public GoogleAuthAdaptor() {
		manager = new GoogleAuthManager();
	}


	@Override
	public void login() {
		manager.login();
		
		
	}
	

}
