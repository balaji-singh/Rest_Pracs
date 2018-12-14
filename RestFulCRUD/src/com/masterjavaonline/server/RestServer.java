/**
 * 
 */
package com.masterjavaonline.server;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.masterjavaonline.model.Employee;
import com.masterjavaonline.service.EmployeeServiceImpl;

/**
 * @author balasingh
 *
 */
@Path("/employee")

public class RestServer {

	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployee() {

		return new EmployeeServiceImpl().getAllEmployee();

	}

	@GET
	@Path("/getemp/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeById(@PathParam("id") int id) {

		return new EmployeeServiceImpl().getEmpById(id);
	}

	@POST
	@Path("/create")
	// @Produces(MediaType.APPLICATION_JSON)
	public Response createEmployee(@QueryParam("id") int emp_id, @QueryParam("age") int emp_age,
			@QueryParam("name") String emp_name, @QueryParam("dept") String dept, @QueryParam("salary") int emp_slary) {

		Employee emp = new Employee(emp_id, emp_name, dept, emp_age, emp_slary);

		return Response.status(new EmployeeServiceImpl().addEmployee(emp)).entity("Success").build();

	}

}
