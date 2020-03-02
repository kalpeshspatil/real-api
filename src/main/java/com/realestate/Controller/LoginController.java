package com.realestate.Controller;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.realestate.Model.LoginModel;
import com.realestate.Repository.LoginRepository;
import com.realestate.Utility.HttpSessionConfig;


@RestController
@ResponseBody
public class LoginController {
	
	@Autowired
	LoginRepository loginRepos;
	
	@Qualifier("sessionCheck")
	@Autowired 
	HttpSessionConfig httpSessionConfig;
	
	@RequestMapping(value = { "/userRegistration" }, method = {RequestMethod.GET,RequestMethod.POST})
	public HashMap<Object, Object> check(HttpServletRequest request,@RequestBody String jsonStr) throws JSONException {
		//System.out.println(jsonStr);
		
		HashMap<Object, Object> response = new HashMap<>();
		
		try {
			JSONObject json = new JSONObject(jsonStr);
			LoginModel reg=new LoginModel();
			reg.setUserFirstName(json.getString("userFirstName"));
			reg.setUserMiddleName(json.getString("userMiddleName"));
			reg.setUserLastName(json.getString("userLastName"));
			reg.setUserAddress(json.getString("userAddress"));
			reg.setUserCity(json.getString("userCity"));
			reg.setUserMobileNo(json.getString("userMobileNo"));
			reg.setUserEmail(json.getString("userEmail"));
			reg.setUserState(json.getString("userState"));
			reg.setUserCountry(json.getString("userCountry"));
			reg.setUserPostalcode(json.getString("userPostalCode"));
			reg.setUserPsw(json.getString("userPassword"));
			reg.setUserC_psw(json.getString("userConfirmPassword"));
			
			loginRepos.save(reg);
		
			response.put("res", 1);
			response.put("status", "success");
		
	 }catch (Exception e) {
			e.printStackTrace();
			response.put("res", 0);
			response.put("status", "fail");
		}
		return response;
	}

	
	@Autowired
	LoginRepository LoginRepository;
	@RequestMapping(value = "/loginUser", method = {RequestMethod.GET,RequestMethod.POST})
	public HashMap<Object, Object> login(HttpServletRequest request,HttpServletResponse resp,@RequestBody String jsonStr,HttpSession session) {
		session.invalidate();
		session = request.getSession(true);
		// session.setMaxInactiveInterval(10 * 60); // '10 minutes' session Timeout
		session.setMaxInactiveInterval(60 * 60 * 24 * 3); // 3 days session timeout
		HashMap<Object, Object> response = new HashMap<>();
		try {
			JSONObject json = new JSONObject(jsonStr);
			String email=json.getString("userEmail") == null ? "" : json.getString("userEmail");
			String psw=json.getString("userPassword") == null ? "" : json.getString("userPassword");
			
			Optional<LoginModel> option = LoginRepository.findOneByUserEmailAndUserPsw(email,psw);
			if(option.isPresent()) {
				LoginModel user=option.get();
				
				String secretKey = UUID.randomUUID().toString();
				session.setAttribute("secretKey", secretKey);
				response.put("status", 1);
				response.put("secretKey", secretKey);
				response.put("user", user);
				return response;
			}
			else {
				System.out.println("LoggedIn Incorrect");
				response.put("status", 0);
				return response;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return response;

		}
		
	}
	
}
