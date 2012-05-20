package net.planettelex.kundera206poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addresses", schema = "Kundera206Poc@cassandra_pu")
public class Address {

	@Id
	private String addressId;

	@Column(name = "city")
	private String city;

	@Column(name = "userId")
	private String userId;

	public Address() {
	}

	public String getAddressId() {
		return addressId;
	}

	public String getCity() {
		return city;
	}

	public String getUserId() {
		return userId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
