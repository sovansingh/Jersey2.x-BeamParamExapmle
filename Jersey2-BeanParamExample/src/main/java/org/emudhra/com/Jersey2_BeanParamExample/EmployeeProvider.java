package org.emudhra.com.Jersey2_BeanParamExample;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/emp")
public class EmployeeProvider {

	@Path("/msg")
	@GET
	public String showMsg(@BeanParam Employee employee) {
		return "HelloData::"+employee;
	}
}
