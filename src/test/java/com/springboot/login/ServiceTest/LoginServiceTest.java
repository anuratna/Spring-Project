package com.springboot.login.ServiceTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.login.model.LoginUser;
import com.springboot.login.repository.LoginRepository;
import com.springboot.login.service.LoginService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {
	
	@Autowired
	private LoginService loginservice;
	
	@MockBean
	private LoginRepository loginrepository;
	
	@Test
	public void insertTest()
	{
		LoginUser user= new LoginUser();
		user.setId(1);
		user.setFirstName("Anu");
		user.setLastName("Rajput");
		user.setDateOfBirth("28021993");
		user.setUserName("anu");
		user.setPassword("anu");
		
		Mockito.when(loginrepository.save(user)).thenReturn(user);
		assertThat(loginservice.insert(user)).isEqualTo(user);
	}
	
	@Test
	public void validateTest()
	{
		LoginUser user1= new LoginUser();
		user1.setId(1);
		user1.setFirstName("Ankita");
		user1.setLastName("Rajput");
		user1.setDateOfBirth("1122122");
		user1.setUserName("anki");
		user1.setPassword("anki");
		
		Mockito.when(loginrepository.findByUserName("anki")).thenReturn(user1);
		assertThat(loginservice.validatedata(user1)).isEqualTo(user1);
	}
	
	@Test
	public void deleteTest()
	{
		LoginUser user2= new LoginUser();
		user2.setId(1);
		user2.setFirstName("Ankita");
		user2.setLastName("Rajput");
		user2.setDateOfBirth("1122122");
		user2.setUserName("anki");
		user2.setPassword("anki");
		
		Mockito.when(loginrepository.findByUserName("anki")).thenReturn(user2);
	}
	
	@Test
	public void updateTest()
	{

		LoginUser user3= new LoginUser();
		user3.setId(1);
		user3.setFirstName("Ankita");
		user3.setLastName("Rajput");
		user3.setDateOfBirth("1122122");
		user3.setUserName("anki");
		user3.setPassword("anki");
		
		Mockito.when(loginrepository.findByUserName("anki")).thenReturn(user3);
		user3.setFirstName("Anku");
		user3.setLastName("Raj");
		Mockito.when(loginrepository.save(user3)).thenReturn(user3);
		assertThat(loginservice.updateData(user3)).isEqualTo(user3);
	}
	
	

}
