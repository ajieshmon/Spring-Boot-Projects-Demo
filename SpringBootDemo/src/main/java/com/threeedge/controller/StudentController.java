package com.threeedge.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.threeedge.dao.StudentDao;
import com.threeedge.model.Student;

@RestController
public class StudentController {
	
	
	StudentDao sdao=new StudentDao();
	
	@RequestMapping(value="/savestudentinfo",method=RequestMethod.POST)
	//@PostMapping(path = "/poststudentinfo")
	public String saveStudentInformation(@RequestBody Student student) throws SQLException {
		return (sdao.saveStudentData(student));
	}
	
	@RequestMapping(value="/getstudentinfo",method=RequestMethod.GET)
	//@GetMapping(path = "/getstudentinfo")
	public @ResponseBody List<Student> getStudentInformation() throws SQLException {
		return (sdao.getStudentData());
	}
	
	//@RequestMapping(value="/updatestudentinfo",method=RequestMethod.PUT)
	@PutMapping(path = "/updatestudentinfo")
	public String updateStudentInformation(@RequestBody Student student) throws SQLException {
		return (sdao.updateStudentData(student));
	}
	
	@RequestMapping(value="/deletestudentinfo/{id}",method=RequestMethod.DELETE)
	//@DeleteMapping(path = "/deletestudentinfo/{id}")
	public String deleteStudentInformation(@PathVariable int id) throws SQLException {
		return (sdao.deleteStudentData(id));
	}
	
	@RequestMapping(value="/test/{id}/{no}",method=RequestMethod.DELETE)
	//@DeleteMapping(path = "/deletestudentinfo/{id}")
	public String testapi(@PathVariable(value="id") String id ,@PathVariable(value="no") String no,@RequestParam(value="param1", required=true) String param1,
	        @RequestParam(value="param2", required=true)String param2) throws SQLException {
		System.out.println("param1 is:"+param1);
		System.out.println("param2 is:"+param2);
		System.out.println("id is:"+id);
		System.out.println("no is:"+no);
		return ("test api");
	}
	
	
	
	
}
