package com.yang.springboot.mapper;


import com.yang.springboot.bean.Department;
import org.apache.ibatis.annotations.*;
/**
 * 注解版
指定这是一个操作数据库的mapper
@Mapper 启动应用上加了@MapperScan就不需要这个了
 */
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}
