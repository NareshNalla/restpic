package com.hcci.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcci.dao.MedicineDAO;
import com.hcci.service.MedicineSearchService;

public class MedicineSearchServiceImpl implements MedicineSearchService 
{
	@Autowired
	
	private MedicineDAO madicineBundleCostDAO;

	@Override
	public Response getMedicineBundleCost(String geo_type, String geo_value,String medicine_cd) {
		
		System.out.println("In MedicineSearchServiceImpl.getMedicineBundleCost"+medicine_cd);
		
		if(medicine_cd ==null ||medicine_cd =="0")
		{
			return Response.status(Response.Status.BAD_REQUEST).build();
		}	
		
		return Response.ok(madicineBundleCostDAO.getMedicineBundleCosts(medicine_cd)).build();
	
	}
}
