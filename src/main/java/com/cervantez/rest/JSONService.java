package com.cervantez.rest;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
import com.cervantez.rest.Product;
 
@Path("/json/products")
public class JSONService 
{
 
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProductInJSON() 
	{
		Product product = new Product();
		product.setId(602);
		product.setProductName("My Wonderful Product");
 
		return product;
	}
 
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createProductInJSON(Product product) 
	{
		String result = "Product saved : " + product;
		return Response.status(201).entity(result).build();
	}
 
}