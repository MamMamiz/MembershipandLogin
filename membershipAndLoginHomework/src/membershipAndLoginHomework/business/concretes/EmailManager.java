package membershipAndLoginHomework.business.concretes;

import membershipAndLoginHomework.business.abstracts.IEmailService;



public class EmailManager implements IEmailService{

	@Override
	public void send() {
		
		System.out.println("Do�rulama kodu g�nderildi");
		
	}

	@Override
	public void loginFinish() {
		System.out.println("Do�rulama kodunu aktifle�tirdiniz . Tebrikler ! ");
		
	}

}
