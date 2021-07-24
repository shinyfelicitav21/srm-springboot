package com.org.app.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.app.beans.Student;
import com.org.app.beans.StudentRegistration;

@Controller
public class StudentRetrieveController {

  @RequestMapping(method = RequestMethod.GET, value="/student/allstudent")

  @ResponseBody
  public List<Student> getAllStudents() {
  return StudentRegistration.getInstance().getStudentRecords();
  }

}
