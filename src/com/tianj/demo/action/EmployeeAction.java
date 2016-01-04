package com.tianj.demo.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tianj.demo.common.entity.Employee;
import com.tianj.demo.service.EmployeeService;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/employee")
public class EmployeeAction {
	@Autowired
	private EmployeeService employeeService;
	
	
	
    @RequestMapping(value="/jinru",method=RequestMethod.POST)
		public String login(){ 
    	
			return "redirect:/employee/employeeList";
		}
	 //通过ModelAndView返回所有的employeeList
    @RequestMapping(value="employeeList")
    public ModelAndView showAll(){
    	System.out.println("index......");
    	ModelAndView MV = new ModelAndView("employee/index");
    	List<Employee> employeeList = new ArrayList<Employee>();
    	employeeList = employeeService.getEmployee();
    	MV.addObject("employeeList",employeeList);
    	return MV;
    }
    //添加employee
	@RequestMapping(value="/add")
	public ModelAndView login(HttpServletRequest request,@RequestParam(value="xm", required=true, defaultValue="szz") String name){ 
		System.out.println("/employee/login....");
		ModelAndView mv = new ModelAndView("employee/success");  
	    mv.addObject("add", "小明"); 
	    return mv;  
	}
	@RequestMapping(value="/editemployee")
	public ModelAndView edit(@RequestParam(value="id") String id){
		ModelAndView mv = new ModelAndView("employee/edit");
		Employee employee = employeeService.getEmployeeInfo(id, null);
		mv.addObject("employee",employee);
		return mv;
	}
	
	@RequestMapping(value="/deleteuser")
	public String deleteuser(@RequestParam(value="ID") String ID){
		employeeService.deleteEmployee(ID);
		return "redirect:/employee/employeeList";
	}
	@RequestMapping(value="/employeeset",method=RequestMethod.POST)  
	public String employee(@ModelAttribute("employee")Employee employee ) {
		 System.out.println(employee.getXm());
		 return "employee/success";   
	}
	//新建插入Employee
	@RequestMapping(value="/insertemployee",method=RequestMethod.POST)  
	public String insertemployee( Employee employeeInfo ) throws Exception {  
		employeeService.insertEmployee(employeeInfo);
		return "redirect:/employee/employeeList";
	}
	//更新employee信息
	@RequestMapping(value="/updateemployee",method=RequestMethod.POST)  
	public String updateEmployee( Employee employeeInfo ) throws Exception {  
		employeeService.updateEmployee(employeeInfo);
		return "redirect:/employee/employeeList";
	}
	
}
