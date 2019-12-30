package com.example.institutemanager.Controller;

import com.example.institutemanager.Model.Course;
import com.example.institutemanager.Model.Instructor;
import com.example.institutemanager.Model.InstructorDetail;
import com.example.institutemanager.Repository.CourseRepo;
import com.example.institutemanager.Service.CourseService;
import com.example.institutemanager.Service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    InstructorService instructorService;

    @Autowired
    CourseService courseService;

    @Autowired
    CourseRepo courseRepo;

    @RequestMapping("/")
    public String homePage(Model model){
        List<Instructor> instructors = instructorService.listAll();
        model.addAttribute("instructors", instructors);
        return "home";
    }

    @RequestMapping("/newinstructor")
    public String newInstructorForm(Model model){
        Instructor instructor = new Instructor();
        InstructorDetail instructorDetail = new InstructorDetail();
        model.addAttribute("instructor", instructor);
        return "newInstructor";
    }

    @RequestMapping(value="/saveinstructor",method= RequestMethod.POST)
    public String saveInstructor(@ModelAttribute("instructor") Instructor instructor, InstructorDetail instructorDetail){

        instructorService.saveInstructor(instructor, instructorDetail);
        return "redirect:/";
    }

    @RequestMapping(value = "/deleteinstructor/{id}")
    public String deleteInstructor(@PathVariable(name = "id") int id){
        instructorService.deleteInstructor(id);
        return "redirect:/";
    }

    @RequestMapping("/newcourse")
    public String newCourse(Model model){
        Course course = new Course();
        model.addAttribute("course", course);
        return "newCourse";
    }

    @RequestMapping(value = "/savecourse/{ins_id}", method = RequestMethod.POST)
    public String saveCourse(@ModelAttribute("course")Course course, @PathVariable(name = "ins_id") int ins_id){
        courseService.saveCourse(course,ins_id);
        return "newCourse";

    }

    @RequestMapping(value = "/deletecourse/{id}")
    public String deletecourse(@PathVariable(name = "id") int id){
        courseRepo.deleteById(id);
        return "deleted course";
    }
}
