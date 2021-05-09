package membershipAndLoginHomework.business.concretes;

import membershipAndLoginHomework.business.abstracts.IEmailService;



public class EmailManager implements IEmailService{

	@Override
	public void send() {
		
		System.out.println("Doðrulama kodu gönderildi");
		
	}

	@Override
	public void loginFinish() {
		System.out.println("Doðrulama kodunu aktifleþtirdiniz . Tebrikler ! ");
		
	}

}
