package StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentRegistrationForm {
	
	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser is open");
		System.setProperty("webdriver.chrome.driver", "C:/Users/nagar/eclipse-workspace/cucumberr/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("user is on the Student Registration Form")
	public void user_is_on_the_student_registration_form() throws InterruptedException, AWTException {
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		  System.out.println("zooming");

		  Robot robot = new Robot();
		  System.out.println("About to zoom out");
		  for (int i = 0; i < 4; i++) {
		   robot.keyPress(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_SUBTRACT);
		   robot.keyRelease(KeyEvent.VK_SUBTRACT);
		   robot.keyRelease(KeyEvent.VK_CONTROL);
		  }
	}

	@When("user enters text in First name, last name, Email Text box")
	public void user_enters_text_in_first_name_last_name_email_text_box() {
	   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nagaraj");
	   driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("M");
	   driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Nagaraj@gmail.com");
	   
	}

	@When("user clicks on the Gender Check box")
	public void user_clicks_on_the_gender_check_box() {
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

	@When("user enters text in Mobile Number Text box")
	public void user_enters_text_in_mobile_number_text_box() {
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9894262878");
	}

	@When("user enters text in the date of birth Text box")
	public void user_enters_text_in_the_date_of_birth_text_box() {
		driver.findElement(By.xpath("//INPUT[@id='dateOfBirthInput']")).click();
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--011']")).click();
				
	}
	
	@When("user hits the hobbies checkbox")
	public void user_hits_the_hobbies_checkbox() {
	    driver.findElement(By.xpath("//label[text()='Sports']")).click();
	}

	@When("user uploads the picture")
	public void user_uploads_the_picture() {
	WebElement up = driver.findElement(By.id("uploadPicture"));
	up.sendKeys("E:\\Downloads\\Nagaraj-photo.jpg");
	}

	@When("user enters text in Current Address TextBox")
	public void user_enters_text_in_current_address_text_box() {
	    driver.findElement(By.id("currentAddress")).sendKeys("27SCG, Nedunkundram, kolapakkam, chennai");
	}

	@And("user hits Submit button")
	public void user_hits_submit_button() {
	   driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("user hits close button")
	public void user_hits_close_button() throws InterruptedException {
		Thread.sleep(15000);
	   driver.findElement(By.id("closeLargeModal")).click();
	}


}
