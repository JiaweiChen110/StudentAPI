package com.StudentProject.StudentProject;

import java.util.ArrayList;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.json.Json;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import okhttp3.Response;

@RestController
public class StudentAPI {
	
	@GetMapping("/Student")
	public String printStudents() {
		Student s = new Student();
		Student s2 = new Student();
		ArrayList<Student> l = new ArrayList<>();
		l.add(s);
		l.add(s2);
//		JSONObject jo = new JSONObject(s);
//		return jo.getString("firstName");
		
		ObjectMapper mapper = new ObjectMapper();
	      //Converting the Object to JSONString
	    String jsonString = null;
		try {
			jsonString = mapper.writeValueAsString(l);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonString;
	}
	
	@GetMapping("/testing")
	public String getStudents(@RequestBody String s) {
//		Gson gs = new Gson();
//		JSONObject js = new JSONObject(s);
//		Gson gs = new Gson();
//		gs.toJson(s);
		return s;
		
	}
	
	@PutMapping("/Student/{id}")
	public String addStudent(@PathVariable int id) {
		return "updated student";
	}
	
	@PostMapping("/Student/{id}")
	public String addStudentToList(@RequestBody String s) {
		Student c = new Student();
		return "added the student to list";
	}
}
