package com.yang.springboot.mapper;

import com.yang.springboot.bean.Employee;

/**
 * 配置文件XML版
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
