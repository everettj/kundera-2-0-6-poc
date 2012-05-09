package net.planettelex.kundera206poc.entity;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

	private EntityManager em;

	private EntityManagerFactory emf;

	private User user;

	@Test
	public void readWriteTest() {
		em.persist(user);
		User foundUser = em.find(User.class, user.getUserId());
		assertNotNull(foundUser);
	}

	@Before
	public void setUp() {
		user = new User();
		user.setUserId("0001");
		user.setFirstName("John");
		user.setLastName("Smith");
		user.setCity("London");

		emf = Persistence.createEntityManagerFactory("cassandra_pu");
		em = emf.createEntityManager();
	}

	@After
	public void tearDown() {
		em.close();
		emf.close();

		user = null;
		em = null;
		emf = null;
	}
}
