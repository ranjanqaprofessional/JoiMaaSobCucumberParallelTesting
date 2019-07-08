package Managers;

import org.openqa.selenium.WebDriver;

import Pages.AskGanesha1;
import Pages.AskGanesha2;
import Pages.AskGanesha3;
import Pages.AskGaneshaGunMilanPage;
import Pages.KaanhaiPDF;



public class PageObjectManager {
	WebDriver driver;
	AskGanesha1 askganeshapage1;
	AskGanesha2 askganeshapage2;
	AskGanesha3 askganeshapage3;
	KaanhaiPDF kaanhaipdfpage;
	AskGaneshaGunMilanPage askganeshagunmilanpage;
	
	
	public AskGanesha1 getAskGanesha1() {
		return(askganeshapage1 ==null)? askganeshapage1= new AskGanesha1(): askganeshapage1; 
		
	}
	
	public AskGanesha2 getAskGanesha2() {
		return(askganeshapage2 ==null)? askganeshapage2= new AskGanesha2(): askganeshapage2; 
		
	}
	
	public AskGanesha3 getAskGanesha3() {
		return(askganeshapage3 ==null)? askganeshapage3= new AskGanesha3(): askganeshapage3; 
		
	}
	
	public AskGaneshaGunMilanPage getAskGaneshaGunMilanPage() {
		return(askganeshagunmilanpage ==null)? askganeshagunmilanpage= new AskGaneshaGunMilanPage(): askganeshagunmilanpage;
	}
	
	public KaanhaiPDF getKaanhaiPDF() {
		return(kaanhaipdfpage ==null)? kaanhaipdfpage= new KaanhaiPDF(): kaanhaipdfpage;
	}
	
	
	
	
	
	
		
		
	

}
