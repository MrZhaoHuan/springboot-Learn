package com.zhao.boot.mvc;

import com.zhao.boot.mvc.dao.DepartmentDao;
import com.zhao.boot.mvc.dao.EmployeeDao;
import com.zhao.boot.mvc.entities.Department;
import com.zhao.boot.mvc.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-29 17:22
 * @描述
 **/
@Controller
public class EmpController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping(value = "/emps", method = RequestMethod.GET)
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("employees", employees);
        return "list";
    }

    @GetMapping("/emp")
    public String addPage(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        return "add";
    }

    @PostMapping("/emp")
    public String add(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";
    }


    @GetMapping("/emp/{id}")
    public String updatePage(@PathVariable("id") int id, Model model) {
        Employee employee = employeeDao.get(id);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("emp", employee);
        model.addAttribute("departments", departments);
        return "add";
    }

    @PutMapping("/emp")
    public String update(Employee employee) {
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String delete(@PathVariable("id") int id) {
        System.out.println("---删除---");
        employeeDao.delete(id);
        return "redirect:/emps";
    }


}