package com.service.hello;

import java.util.ArrayList;
import java.util.List;

//import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Student")
public class StudentController {
	
	
	StudentRepository _studentRepo = new StudentRepository();
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student getStudent(@PathParam("id") int id) {
		Student s = _studentRepo.getStudent(id);
		System.out.println(s.toString());
		return s;
	}
	
	@GET
	@Path("/AllStudent")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Student> getAllStudents(){
		List<Student> lstStudent = new ArrayList<Student>();
		lstStudent = _studentRepo.getAllStudents();
		return lstStudent;
		
	}
	
	@POST
	@Path("Create")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public String Post(Student s) {
		
		System.out.println(s.toString());
		_studentRepo.Save(s);
		String response=s==null?"failure" : "success";
		return response;
	}
	
	@PUT
	@Path("Update")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public String Put(Student s) {
		
		System.out.println(s.toString());
		_studentRepo.Update(s);
		String response=s==null?"failure" : "success";
		return response;
	}
	
	@DELETE
	@Path("Delete/{id}")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public String Delete(@PathParam("id") int id) {
		
		System.out.println(_studentRepo.getStudent(id).toString());
		_studentRepo.Delete(id);
		return "success";
	}
	

}
