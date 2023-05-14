package org.pageexec;

import org.baseutils.BaseClass;
import org.pagerepo.LoginPageRepo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginExec extends BaseClass {

	@Parameters("url")
	@BeforeClass
	public void url(String url)
	{
		driver.get(url);
	}
	
	@Test
	public void login()
	{
		LoginPageRepo lp=new LoginPageRepo();
		lp.getUsername().sendKeys("rithubala");
		lp.getPassword().sendKeys("Qwerty@6");
		lp.getLogin().click();
	}
}
