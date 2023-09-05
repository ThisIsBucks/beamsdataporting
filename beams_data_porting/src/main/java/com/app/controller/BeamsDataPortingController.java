package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.BeamsDdoDetailsService;
import com.app.service.BeamsRoadCategoryDetailsService;
import com.app.service.BeamsSchemeDetailsService;
import com.app.service.BeamsWorksMasterService;

@RestController
@RequestMapping("/dataporting")
@CrossOrigin(origins= "*")
public class BeamsDataPortingController {
	
	@Autowired
	private BeamsWorksMasterService beamsWorksMasterService;
	
	@Autowired 
	private BeamsSchemeDetailsService beamsSchemeDetailsService;
	
	@Autowired
	private BeamsDdoDetailsService beamsDdoDetailsService;
	
	
	@Autowired 
	private BeamsRoadCategoryDetailsService beamsRoadCategoryDetailsService;
	
	@PostMapping("/beamsworkmaster")
	public String BeamsWorkMasterData(@RequestBody String htmlContent) {
		
		try {
			String s =beamsWorksMasterService.InsertBeamsWorksMasterData(htmlContent);
			return s;
		}
		catch(Exception e){
			e.printStackTrace();
			return "Error";
		}
	}

	@PostMapping("/beamsschemedetails")
	public String BeamsSchemeDetails(@RequestBody String htmlContent) {
		try {
			String s= beamsSchemeDetailsService.InsertSchemeData(htmlContent);
			return s;
		}catch(Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
	 @PostMapping("/beamsddodetails")
	 public String BeamsDdoDetails(@RequestBody String htmlContent) {
		 try {
				String s= beamsDdoDetailsService.InsertDdoData(htmlContent);
				return s;
			}catch(Exception e) {
				e.printStackTrace();
				return "error";
			}
	 }
	 
	 @PostMapping("/beamsroadcategorydetails")
	 public String BeamsRoadCategoryDetails(@RequestBody String htmlContent) {
		 try {
				String s= beamsRoadCategoryDetailsService.InsertRoadCategoryDetailsData(htmlContent);
				return s;
			}catch(Exception e) {
				e.printStackTrace();
				return "error";
			}
	 }
}
