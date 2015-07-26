package com.hcci.service;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * @author nareshnalla
 * This is interface for the employee services
 *
 */
@Path("/")
@WebService(name="madicineService", targetNamespace="http://www.nareshnalla.com/cxf-rest/example")
public interface MedicineSearchService 
{

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/v1")
	public Response getMedicineBundleCost(@QueryParam("geo_type") String geo_type,
			@QueryParam("geo_value") String geo_value,
			@QueryParam("medicine_cd") String medicine_cd );
	
}
