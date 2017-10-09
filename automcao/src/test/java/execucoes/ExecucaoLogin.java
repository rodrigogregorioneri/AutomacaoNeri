package execucoes;

import org.openqa.selenium.chrome.ChromeDriver;

import login.LoginInterface;
import pages.PageElementLogin;

public class ExecucaoLogin implements LoginInterface{

	@Override
	public void executaAcaoAcesso(PageElementLogin janela, ChromeDriver driver) {
		try {
			((PageElementLogin)janela).btnEntrar();
			((PageElementLogin)janela).txtUsuario();
			((PageElementLogin)janela).txtSenha();
			
			
		} catch (Exception e) {
			System.out.println("Erro na classe: AcaoBtnEntrarAcesso. A��o: Clicar no btn Entrar da primeira pagina apresentada ao usu�rio.");
			e.printStackTrace();
			throw new RuntimeException("Erro.");
		}		
		
	}
	
	


}
