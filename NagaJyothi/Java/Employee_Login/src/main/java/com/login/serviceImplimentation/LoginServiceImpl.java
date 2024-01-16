package com.login.serviceImplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.login.bean.RegistrationBean;
import com.login.entity.LoginEntity;
import com.login.repository.LoginRepository;
import com.login.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService 
{
	@Autowired
	private LoginRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	

//	@Override
//	public LoginInfo getAll() {
//		
//		return null;
//	}
	

	@Override
	public void save(LoginEntity entity) {
		String url = "http://localhost:8082/registration/register/fetch/1";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		//log.info("URL - {}", url);

//		 Input entity
		HttpEntity<String> httpEntity = new HttpEntity<>(headers);

		ResponseEntity<RegistrationBean> responseEntity = restTemplate.exchange(url,HttpMethod.GET, httpEntity, RegistrationBean.class);
		RegistrationBean registrationBean = responseEntity.getBody();
		repository.save(entity);
	}
	

}
