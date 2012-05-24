package net.planettelex.kundera206poc.entity;

import com.impetus.kundera.client.EnhanceEntity;

public abstract class AEntity extends EnhanceEntity {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.impetus.kundera.client.EnhanceEntity#getEntity()
	 */
	// TODO 2.0.6 this method seems to be required for a query to work if
	// associations are present
	@Override
	public Object getEntity() {
		return this;
	}

}
