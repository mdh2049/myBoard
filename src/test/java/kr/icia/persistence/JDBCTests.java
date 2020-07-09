
package kr.icia.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

//import java.sql.SQLException;
import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
//log4j는 시스템 실행 전, 점검을 위한 의존성이다. 테스트 모듈을 동작하여 오류를 점검한다.
public class JDBCTests {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
//어노테이션: 아래 메소드는 테스트 메소드이다.
//스프링 프레임워크와 개발자 사이의 암호가 어노테이션이다.	
	public void testConnection() {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "shop", "1234");
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}

	}
}