package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginMethods {
	
	
	
	@Given ("^Navigate to Login Page$")
	public void Navigate_to_Login_Page() {
		System.out.println("Navigate to Login Page*****************");
	}
	
	
	@When ("^Enter UserName$")
	public void Enter_UserName() {
		System.out.println("Enter UserName*************************");
	}
	
	
	@And ("^Enter Password$")
	public void Enter_Password() {
		System.out.println("Enter Password*********************");
	}
	
	@Then ("^Click Login Button$")
	public void Click_Login_Button() {
		System.out.println("Click Login Button*********************");
	}
	
	@Then ("^Click Cancel Button$")
	public void Click_Cancel_Button() {
		System.out.println("Click Cancel Button**************");
	}

}
