package org.blog.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// SqlSessionFactory 인스턴스를 클래스 로딩시 한번만 생성
public enum MyBatisLoader {

	INSTANCE;
	SqlSessionFactory factory;

	// 생성자
	MyBatisLoader() {
		String resource = "mybatis-config.xml";

		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// getFactory
	public SqlSessionFactory getFactory() {
		return this.factory;
	}
}
