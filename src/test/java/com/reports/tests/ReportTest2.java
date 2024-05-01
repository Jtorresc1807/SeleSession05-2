package com.reports.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.reports.utils.Log;

import org.testng.AssertJUnit;
import static org.testng.Assert.assertFalse;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

//@Listeners(com.reports.listeners.CustomListeners.class)
public class ReportTest2 extends BaseTest {

	@Test  (priority = 1)
	public void getTitle2(Method method) { // pass
		Log.info("iniciando test " + method.getName());
		test = extent.createTest("verify title", "Test que verifica el titulo de la pagina");
		test.assignAuthor("Carla");
		test.assignCategory("End2End");
		test.assignDevice("Win 11");
		Log.info("antes del assertion " + method.getName());
		AssertJUnit.assertEquals(driver.getTitle(), "OWASP Juice Shop");
		Log.info("despues del assertion " + method.getName());
	}

	@Test (priority = 3)
	public void getLogo2(Method method) { // fail
		Log.info("iniciando test " + method.getName());
		test = extent.createTest("verify logo", "Test que verifica el logo de la pagina");
		Log.info("iniciando test " + method.getName() +" agregando tester");
		test.assignAuthor("Cesar");
		test.assignCategory("Regression");
		test.assignDevice("oS");
		Log.info("antes del assertion " + method.getName());
		boolean logo = driver.findElement(By.className("logo")).isDisplayed();
		AssertJUnit.assertFalse(logo);
	}
	
	@Test (priority = 2)
	public void skyTest2() { // sky
		test = extent.createTest("Sky Test", "Test no implementado");
		test.assignAuthor("Carlos");
		test.assignCategory("Smoke");
		test.assignDevice("Linux");
		throw new SkipException("pending to implement");
	}
}
