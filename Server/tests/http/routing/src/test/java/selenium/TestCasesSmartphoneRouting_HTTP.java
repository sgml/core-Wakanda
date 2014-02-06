package selenium;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.wakanda.common.server.AdminCommand;
import org.wakanda.common.testing.UserAgents;
import org.wakanda.templates.runtime.SeleniumRuntimeTemplate;

public class TestCasesSmartphoneRouting_HTTP extends SeleniumRuntimeTemplate {
	
	@BeforeClass
	public static void beforeClass() throws URISyntaxException, IOException 
	{
		selenium =  getSeleniumUtility();
		selenium.createChromeDriver(UserAgents.smartphone_iphone, true);
		selenium.waitImplicitly(5);
		AdminCommand.startServer(TestCasesSmartphoneRouting_HTTP.class, "/solutions/waPageRouting/waPageRouting Solution/waPageRouting.waSolution");
	}
	
	@Test
	public void test_root() {
		selenium.getDriver().get("http://127.0.0.1:8081?cacheBreaker"+System.currentTimeMillis());
			try{
		selenium.getDriver().findElement(By.id("smartBtt"));
			}catch(Exception e){
		assertEquals("Fail to get http://127.0.0.1:8081 : ", true, false);		
			}
			
		String result = (String) selenium.getJsConsole().executeScript("return $$('smartBtt').getPosition().left +'/'+ $$('smartBtt').getPosition().top");
		assertEquals("Check if smartBtt has right index.css : ", "30/30", result);		
		result = (String) selenium.getJsConsole().executeScript("return $$('richText1').getValue() + ''");
		assertEquals("Check if smartBtt has right index.js : ", "index.waPage/scripts/index-smartphone.js", result);		
	}

	@Test
	public void test_root2() {
		selenium.getDriver().get("http://127.0.0.1:8081/?cacheBreaker"+System.currentTimeMillis());
			try{
		selenium.getDriver().findElement(By.id("smartBtt"));
			}catch(Exception e){
		assertEquals("Fail to get http://127.0.0.1:8081/ : ", true, false);		
			}

		String result = (String) selenium.getJsConsole().executeScript("return $$('smartBtt').getPosition().left +'/'+ $$('smartBtt').getPosition().top");
		assertEquals("Check if smartBtt has right index.css : ", "30/30", result);		
		result = (String) selenium.getJsConsole().executeScript("return $$('richText1').getValue() + ''");
		assertEquals("Check if smartBtt has right index.js : ", "index.waPage/scripts/index-smartphone.js", result);		
	}
	
	@Test
	public void test_index() {
		selenium.getDriver().get("http://127.0.0.1:8081/index?cacheBreaker"+System.currentTimeMillis());
			try{
		selenium.getDriver().findElement(By.id("smartBtt"));
			}catch(Exception e){
		assertEquals("Fail to get http://127.0.0.1:8081/index : ", true, false);		
			}

		String result = (String) selenium.getJsConsole().executeScript("return $$('smartBtt').getPosition().left +'/'+ $$('smartBtt').getPosition().top");
		assertEquals("Check if smartBtt has right index.css : ", "30/30", result);		
		result = (String) selenium.getJsConsole().executeScript("return $$('richText1').getValue() + ''");
		assertEquals("Check if smartBtt has right index.js : ", "index.waPage/scripts/index-smartphone.js", result);		
	}
	
	@Test
	public void test_index2() {
		selenium.getDriver().get("http://127.0.0.1:8081/index/?cacheBreaker"+System.currentTimeMillis());
			try{
		selenium.getDriver().findElement(By.id("smartBtt"));
			}catch(Exception e){
		assertEquals("Fail to get http://127.0.0.1:8081/index/ : ", true, false);		
			}

		String result = (String) selenium.getJsConsole().executeScript("return $$('smartBtt').getPosition().left +'/'+ $$('smartBtt').getPosition().top");
		assertEquals("Check if smartBtt has right index.css : ", "30/30", result);		
		result = (String) selenium.getJsConsole().executeScript("return $$('richText1').getValue() + ''");
		assertEquals("Check if smartBtt has right index.js : ", "index.waPage/scripts/index-smartphone.js", result);		
	}

	@Test
	public void test_indexWaPage() {
		selenium.getDriver().get("http://127.0.0.1:8081/index.waPage?cacheBreaker"+System.currentTimeMillis());
			try{
		selenium.getDriver().findElement(By.id("smartBtt"));
			}catch(Exception e){
		assertEquals("Fail to get http://127.0.0.1:8081/index.waPage : ", true, false);		
			}

		String result = (String) selenium.getJsConsole().executeScript("return $$('smartBtt').getPosition().left +'/'+ $$('smartBtt').getPosition().top");
		assertEquals("Check if smartBtt has right index.css : ", "30/30", result);		
		result = (String) selenium.getJsConsole().executeScript("return $$('richText1').getValue() + ''");
		assertEquals("Check if smartBtt has right index.js : ", "index.waPage/scripts/index-smartphone.js", result);		
	}
	
	@Test
	public void test_indexWaPage2() {
		selenium.getDriver().get("http://127.0.0.1:8081/index.waPage/?cacheBreaker"+System.currentTimeMillis());
			try{
		selenium.getDriver().findElement(By.id("smartBtt"));
			}catch(Exception e){
		assertEquals("Fail to get http://127.0.0.1:8081/index.waPage/ : ", true, false);		
			}

		String result = (String) selenium.getJsConsole().executeScript("return $$('smartBtt').getPosition().left +'/'+ $$('smartBtt').getPosition().top");
		assertEquals("Check if smartBtt has right index.css : ", "30/30", result);		
		result = (String) selenium.getJsConsole().executeScript("return $$('richText1').getValue() + ''");
		assertEquals("Check if smartBtt has right index.js : ", "index.waPage/scripts/index-smartphone.js", result);		
	}
	
	@Test
	public void test_indexHtml() {
		selenium.getDriver().get("http://127.0.0.1:8081/index.waPage/index-smartphone.html?cacheBreaker"+System.currentTimeMillis());
			try{
		selenium.getDriver().findElement(By.id("smartBtt"));
			}catch(Exception e){
		assertEquals("Fail to get http://127.0.0.1:8081/index.waPage/index-smartphone.html : ", true, false);		
			}

		String result = (String) selenium.getJsConsole().executeScript("return $$('smartBtt').getPosition().left +'/'+ $$('smartBtt').getPosition().top");
		assertEquals("Check if smartBtt has right index.css : ", "30/30", result);		
		result = (String) selenium.getJsConsole().executeScript("return $$('richText1').getValue() + ''");
		assertEquals("Check if smartBtt has right index.js : ", "index.waPage/scripts/index-smartphone.js", result);		
	}
}