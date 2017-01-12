package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class GetClientDataController extends Controller {
	
	public Result getData() {
        return ok("Client data will be on this page");
    }

}
