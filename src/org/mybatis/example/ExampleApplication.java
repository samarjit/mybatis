package org.mybatis.example;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.beans.Contact;
import org.mybatis.example.mappers.BlogMapper;
import org.mybatis.example.mappers.ContactMapper;
import org.mybatis.example.mappers.MyAnnoMapper;

public class ExampleApplication {
	/**
	 * scope: application
	 */
	private static SqlSessionFactory sqlSessionFactory = null;

	public static void main(String[] args) {
		String resource = "org/mybatis/example/configuration.xml";
		Reader reader = null;

		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		sqlSessionFactory.getConfiguration().addMapper(ContactMapper.class);
		sqlSessionFactory.getConfiguration().addMapper(MyAnnoMapper.class);
		

		SqlSession session = sqlSessionFactory.openSession();
		Contact c = new Contact();
		c.setId(3);
		c.setFirstName("samarjit");
		c.setLastName("samanta");
		c.setEmail("sam@localhost.com");
		c.setPhone("9245");
		
		
		
		try {
			ContactMapper mapper = session.getMapper(ContactMapper.class);
			mapper.insert(c);
			List<Contact> contacts = mapper.selectAll();
			for (Contact contact : contacts) {
				System.out.println(contact.getEmail() + ":"
						+ contact.getFirstName() + ":" + contact.getLastName());
			}
			
			
			
			session.insert("org.mybatis.example.mappers.MyAnnoMapper.putAll","ppp");
			
			MyAnnoMapper m = session.getMapper(MyAnnoMapper.class);
			System.out.println(m.getNames());
			
			System.out.println("Blog...test");
			BlogMapper bm = session.getMapper(BlogMapper.class);
			System.out.println(bm.selectBlog());
			
		} finally {
			session.close();
		}
	}
}
