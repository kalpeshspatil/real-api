package com.realestate.Controller;

import java.io.Console;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.realestate.Model.PropertyDetailsModel;
import com.realestate.Model.PropertyImagesModel;
import com.realestate.Repository.PropertyDetailsRepository;
import com.realestate.Repository.PropertyImagesRepository;
import com.realestate.Utility.HttpSessionConfig;

@RestController
@ResponseBody
public class PropertyDetailsController {
	
	@Autowired
	PropertyDetailsRepository proprepos;
	
	@Autowired
	PropertyImagesRepository imagerepos;
	
	@Autowired
	@Qualifier("sessionCheck")
	HttpSessionConfig httpSessionConfig;
	
	@RequestMapping(value= {"/addProperty"},method = {RequestMethod.GET,RequestMethod.POST})
	public HashMap<Object,Object> add (HttpServletRequest request,@RequestBody String jsonStr) throws JSONException{
		HashMap<Object, Object> response = new HashMap<>();
		JSONObject json=new JSONObject(jsonStr);
		try {
		
			if (httpSessionConfig.checkSession(request, json.getString("secretKey"))) {
			PropertyDetailsModel promodel=new PropertyDetailsModel();
			PropertyImagesModel imagemodel=new PropertyImagesModel();
			
			
			//promodel.set(json.getString("propertyType"));
			promodel.setUserId(json.getInt("userId"));
		    promodel.setPropertyType(json.getString("propertyType"));
		    promodel.setTypeOfAd(json.getString("typeOfAd"));
			promodel.setApartmentType(json.getString("addApartmentType"));
			promodel.setApartmentName(json.getString("apartmentName"));
			promodel.setBhkType(json.getString("addBhkType"));
			promodel.setFloor(json.getInt("floor"));
			promodel.setTotalFloor(json.getInt("totalFloor"));
			promodel.setPropertyAge(json.getString("propertyAge"));
			promodel.setPropertyFacing(json.getString("propertyFacing"));
			promodel.setPropertySize(json.getString("propertySize"));
			promodel.setPropertyCity(json.getString("propertyCity"));
			promodel.setPropertyLocality(json.getString("propertyLocality"));
			promodel.setStreetAddress(json.getString("streetAddress"));
			promodel.setAvailableForLease(json.getString("availableForLease"));
			promodel.setExpectedRent(json.getString("expectedRent"));
			promodel.setExpectedDeposite(json.getString("expectedDeposite"));
			promodel.setMaintenance(json.getString("maintenance"));
			promodel.setPreferedTenants(json.getString("preferedTenants"));
			promodel.setFurnishing(json.getString("furnishing"));
			promodel.setParking(json.getString("parking"));
			promodel.setBathrooms(json.getInt("bathrooms"));
			promodel.setBalcony(json.getInt("balcony"));
			promodel.setWaterSupply(json.getString("waterSupply"));
			promodel.setGym(json.getString("gym"));
			promodel.setNonVegAllowed(json.getString("nonVegAllowed"));
			promodel.setGatewayCommunity(json.getString("gatewayCommunity"));
			promodel.setWhoWillShowHouse(json.getString("whoWillShowHouse"));
			promodel.setSecondaryNo(json.getString("secondaryNo"));
			promodel.setAvailability(json.getString("availability"));
			promodel.setStartTime(json.getString("startTime"));
			promodel.setEndTime(json.getString("endTime"));
			
			proprepos.save(promodel);
			
			
		//	imagemodel.setImage(json.getString("imageFiles"));
		//	imagemodel.setUserId(json.getInt("userId"));
		//	imagemodel.setApartmentName(json.getString("apartmentName"));
			
		//	imagerepos.save(imagemodel);
			
			response.put("res", 1);
			response.put("status", "success");
			}
			else {
				response.put("status", 0);
				response.put("message", "Session has expired. Please refresh and log out/log in.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("res", 0);
			response.put("status", "fail");
		}
		
		return response;
		
	}
	
	@RequestMapping(value= {"getPropertyList"},method= {RequestMethod.GET,RequestMethod.POST})
	public HashMap<Object,Object> proplist(HttpServletRequest request) throws JSONException {
	
		HashMap<Object,Object> response = new HashMap<>();
		
		
		try {
			
		    Iterable<PropertyDetailsModel> propertylist =proprepos.findAll();
			
		    response.put("res", 1);
			response.put("propertylist", propertylist);
			
		} catch (Exception e) {
			e.printStackTrace();
			response.put("res", 0);
			response.put("status", "fail");
		}
		
		
		return response;
		
	}
	@RequestMapping(value= {"searchPropertyList"},method= {RequestMethod.GET,RequestMethod.POST})
	public HashMap<Object,Object> searchproplist(HttpServletRequest request,@RequestBody String jsonStr) throws JSONException {
	
		HashMap<Object,Object> response = new HashMap<>();
		//System.out.println("search started"+jsonStr);
		JSONObject json=new JSONObject(jsonStr);
		
		try {
			
			String propertyCity=json.getString("searchPropertyField");
		    List<PropertyDetailsModel> propertylist =proprepos.findOneByPropertyCity(propertyCity);
		
		    response.put("res", 1);
			response.put("propertylist", propertylist);
			
		} catch (Exception e) {
			e.printStackTrace();
			response.put("res", 0);
			response.put("status", "fail");
		}
		
		
		return response;
		
	}

}
