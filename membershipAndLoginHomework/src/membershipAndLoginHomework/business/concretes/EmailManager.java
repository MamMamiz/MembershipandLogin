package membershipAndLoginHomework.business.concretes;

import membershipAndLoginHomework.business.abstracts.IEmailService;



public class EmailManager implements IEmailService{

	@Override
	public void send() {
		
		System.out.println("Doğrulama kodu gönderildi");
		
	}

	@Override
	public void loginFinish() {
		System.out.println("Doğrulama kodunu aktifleştirdiniz . Tebrikler ! ");
		
	}

}
