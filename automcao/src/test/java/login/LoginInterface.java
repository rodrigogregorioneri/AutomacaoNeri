package login;

import org.openqa.selenium.chrome.ChromeDriver;

import pages.PageElementLogin;



public interface LoginInterface {
	public void executaAcaoAcesso(PageElementLogin janela, ChromeDriver driver);
}
