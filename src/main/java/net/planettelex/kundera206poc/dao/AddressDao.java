package net.planettelex.kundera206poc.dao;

import java.util.List;

import javax.persistence.Query;

import net.planettelex.kundera206poc.entity.Address;

import org.springframework.stereotype.Repository;

@Repository("addressDao")
public class AddressDao extends ADao<Address> {

	public List<Address> findByUserId(String userId) {
		Query query = em
				.createQuery("SELECT tbl FROM Address tbl WHERE tbl.userId = :userId");
		query.setParameter("userId", userId);
		return getResultList(query);
	}
}
