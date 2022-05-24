package edu.biz.setter2;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/setter2.xml")
public class DevelopeTests {
	
	@Setter @Inject
	private Develope develope;
	
	@Test
	public void testExist() {
		assertNotNull(develope);
	}
	
	@Test
	public void testCoding() {
		develope.coding();
	}

}
