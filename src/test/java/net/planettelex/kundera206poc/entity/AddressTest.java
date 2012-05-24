package net.planettelex.kundera206poc.entity;


public class AddressTest extends ATest {

	private Address address;

	// /**
	// * Indexed column cannot be null test.
	// */
	// @Test(expected = KunderaException.class)
	// public void indexedColumnCannotBeNullTest() {
	// Address newAddress = new Address();
	// newAddress.setAddressId(UUID.randomUUID().toString());
	// em.persist(newAddress);
	// }
	//
	// /**
	// * Read test.
	// */
	// @Test
	// public void readTest() {
	// // find works
	// Address foundAddress = em.find(Address.class, address.getAddressId());
	// assertNotNull(foundAddress);
	// assertEquals(address.getCity(), foundAddress.getCity());
	// }
	//
	// /**
	// * Set up.
	// */
	// @Before
	// public void setUp() {
	// address = new Address();
	// address.setAddressId(UUID.randomUUID().toString());
	// address.setCity("London");
	// address.setUserId(UUID.randomUUID().toString());
	//
	// em = entityManagerFactory.createEntityManager();
	//
	// // persist works
	// em.persist(address);
	// }
	//
	// /**
	// * Tear down.
	// */
	// @After
	// public void tearDown() {
	// // if any exceptions have occurred, the em will no longer be valid
	// // so recreate the em and attach the address from setup
	// if (!em.contains(address)) {
	// em.close();
	// em = entityManagerFactory.createEntityManager();
	// em.persist(address);
	// }
	//
	// // remove works
	// em.remove(address);
	//
	// em.close();
	// address = null;
	// em = null;
	// }
}
