package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import io.swagger.annotations.*;


@Api(value = "/api-getData", description = "Get CustomerIO data")
public class GetClientDataController extends Controller {
	
	@ApiOperation(value = "get all customer data",
		     notes = "Returns a list of customers", 
		     httpMethod = "GET") 
	public Result getData() {
        return ok("Client data will be on this page");
    }

}
