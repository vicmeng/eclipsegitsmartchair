package org.mybatis.text;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.entity.Person;
import org.mybatis.entity.id;
import org.mybatis.entity.personClass;
import org.mybatis.mapper.personMapper;

public class text {
	
	public static void queryPresonById() throws IOException {
		Reader Reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
		SqlSession openSession = sessionFactory.openSession();
		personMapper personMapper =openSession.getMapper(personMapper.class);
		Person	person=personMapper.queryPersonById(1);
		System.out.println("查询"+person);
		openSession.close();
	}
	public static void queryAllPresonBy() throws IOException {
		Reader Reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
		SqlSession openSession = sessionFactory.openSession();
		personMapper personMapper =openSession.getMapper(personMapper.class);
		List <Person> persons=personMapper.queryAllPersonById();
		System.out.println("查询所有"+persons);
		openSession.close();
	}
	public static void queryAllPersonWithPersoncard() throws IOException {
		Reader Reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
		SqlSession openSession = sessionFactory.openSession();
		personMapper personMapper =openSession.getMapper(personMapper.class);
		List <Person> persons=personMapper.queryAllPersonWithPersoncard();
		System.out.println("查询所有"+persons);
		openSession.close();
	}
	public static void queryClassAndPerson() throws IOException {
		Reader Reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
		SqlSession openSession = sessionFactory.openSession();
		personMapper personMapper =openSession.getMapper(personMapper.class);
		List <personClass> personClasses=personMapper.queryClassAndPerson();
		System.out.println("查询所有"+personClasses);
		
		openSession.close();
	}
//	public static void insertPerson() throws IOException {
//		Reader Reader = Resources.getResourceAsReader("conf.xml");
//		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
//		SqlSession openSession = sessionFactory.openSession();
//		personMapper personMapper =openSession.getMapper(personMapper.class);
//		Person person=new Person(3,"加配置",12);
//		 int i=personMapper.insertPerson(person);
//		 openSession.commit();
//		System.out.println("影响"+i+"行");
//		openSession.close();
//	}
	public static void insertPersonWithConverter() throws IOException {
	Reader Reader = Resources.getResourceAsReader("conf.xml");
	SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
	SqlSession openSession = sessionFactory.openSession();
	personMapper personMapper =openSession.getMapper(personMapper.class);
	Person person=new Person(3,"加配置",12,true);
	 int i=personMapper.insertPersonWithConverter(person);
	 openSession.commit();
	System.out.println("影响"+i+"行");
	openSession.close();
}
	public static void deletePersonById() throws IOException {
		Reader Reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
		SqlSession openSession = sessionFactory.openSession();
		personMapper personMapper =openSession.getMapper(personMapper.class);
		personMapper.deletePersonById(3);
		openSession.commit();
		System.out.println("删除id为3");
		openSession.close();
	}
//	public static void updatePersonById() throws IOException {
//		Reader Reader = Resources.getResourceAsReader("conf.xml");
//		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
//		SqlSession openSession = sessionFactory.openSession();
//		personMapper personMapper =openSession.getMapper(personMapper.class);
//		Person person=new Person(2,"陈佳宇",19);
//		int i=personMapper.updatePersonById(person);
//		System.out.println("影响"+i+"行");
//		openSession.close();
//	}
	public static void queryPresonByIdWithConverter() throws IOException {
		Reader Reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
		SqlSession openSession = sessionFactory.openSession();
		personMapper personMapper =openSession.getMapper(personMapper.class);
		Person	person=personMapper.queryPersonByIdWithConverter(1);
		System.out.println("查询"+person);
		openSession.close();
	}
	public static void queryPersonByNameOrAgeWithSQLTag() throws IOException {
		Reader Reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
		SqlSession openSession = sessionFactory.openSession();
		personMapper personMapper =openSession.getMapper(personMapper.class);
		Person	person=new Person();
		person.setName("赵佳欣");
		// person.setAge(19);
		List<Person>	person1=personMapper.queryPersonByNameOrAgeWithSQLTag(person);
		System.out.println("查询"+person1);
		openSession.close();
	}
	public static void num_from_employee() throws IOException {
		Reader Reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
		SqlSession openSession = sessionFactory.openSession();
		personMapper personMapper =openSession.getMapper(personMapper.class);
		Map<String, Object> params=new HashMap<>();
		params.put("emp_age", 19);
		//int	count=personMapper.num_from_employee(params);
		personMapper.num_from_employee(params);
		Object count = params.get("count_num");
		System.out.println("count:"+count);
		openSession.close();
	}
	public static void queryPersonsWithId() throws IOException {
		Reader Reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(Reader);
		SqlSession openSession = sessionFactory.openSession();
		personMapper personMapper =openSession.getMapper(personMapper.class);
		id id=new id();
		List<Integer> ids=new ArrayList<>();
		ids.add(1);
		ids.add(2);
		id.setId(ids);
		List<Person> Person =personMapper.queryPersonsWithId(id);
		
		System.out.println("Person:"+Person);
		openSession.close();
	}
	public static void main(String[] args) throws IOException {
//		num_from_employee();
//		queryPresonByIdWithConverter();
//		insertPersonWithConverter();
		queryPresonById();
//		queryAllPresonBy();
//		insertPerson();
//		queryAllPresonBy();
//		deletePersonById();
//		queryAllPresonBy();
//		updatePersonById();
//		queryAllPresonBy();
//		queryPersonByNameOrAgeWithSQLTag();
//		queryPersonsWithId();
//		queryAllPersonWithPersoncard();
//		queryClassAndPerson();
	}
}
