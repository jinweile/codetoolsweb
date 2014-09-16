package person.jwl.codetoolsweb.comm.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import person.jwl.codetoolsweb.comm.SpringContext;
import person.jwl.codetoolsweb.model.DbInfo;
import person.jwl.codetoolsweb.service.intf.IDbInfoService;

public class AllTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws SQLException {
		//fail("Not yet implemented");
		IDbInfoService service = SpringContext.getInstance().getBean("IDbInfoService", IDbInfoService.class);
		List<DbInfo> list = service.FindAll();
		System.out.println(list.size());
	}

}
