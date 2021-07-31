package com.org.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.app.beans.Student;
import com.org.app.beans.StudentRegistration;
import com.org.app.controllers.*;


@Controller
public class StudentUpdateController {

@RequestMapping(method = RequestMethod.PUT, value="/update/student")


@ResponseBody
public String updateStudentRecord(@RequestBody Student stdn) {
System.out.println("In updateStudentRecord");   
    return StudentRegistration.getInstance().upDateStudent(stdn);
}

}

