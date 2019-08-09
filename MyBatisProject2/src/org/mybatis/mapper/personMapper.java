package org.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.entity.Person;
import org.mybatis.entity.id;
import org.mybatis.entity.personClass;

public interface personMapper {
	//方法名和mapper.xml文件 中标签名的id值一样
   Person	queryPersonById(int id);
   	int	insertPerson(Person person);
   	void	deletePersonById(int id);
   	int	updatePersonById(Person person); 
   List<Person>   queryAllPersonById();
   Person queryPersonByIdWithConverter(int id);
   int insertPersonWithConverter(Person person);
   void num_from_employee(Map<String, Object> params);
   List<Person>  queryPersonByNameOrAgeWithSQLTag(Person person);
   List<Person> queryPersonsWithId(id id);
   List<Person> queryAllPersonWithPersoncard();
   List<personClass> queryClassAndPerson();
}
