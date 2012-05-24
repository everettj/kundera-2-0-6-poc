package net.planettelex.kundera206poc.dao;

import java.util.List;

import javax.persistence.Query;

import net.planettelex.kundera206poc.entity.User;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao extends ADao<User> {

	public List<User> findByFirstName(String firstName) {
		Query query = em
				.createQuery("SELECT tbl FROM User tbl WHERE tbl.firstName = :firstName");
		query.setParameter("firstName", firstName);
		return getResultList(query);
	}
}
