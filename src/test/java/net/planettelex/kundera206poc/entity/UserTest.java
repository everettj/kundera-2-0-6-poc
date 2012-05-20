package net.planettelex.kundera206poc.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest extends ATest {

	private User user;

	@Test
	public void readTest() {
		// find works
		User foundUser = em.find(User.class, user.getUserId());
		assertNotNull(foundUser);
		assertEquals(user.getFirstName(), foundUser.getFirstName());
	}

	@Before
	public void setUp() {
		user = new User();
		user.setUserId(UUID.randomUUID().toString());
		user.setFirstName("John");
		user.setLastName("Smith");

		em = entityManagerFactory.createEntityManager();
		// persist works
		em.persist(user);
	}

	@After
	public void tearDown() {
		// remove works
		em.remove(user);
		em.close();
		user = null;
		em = null;
	}
}
