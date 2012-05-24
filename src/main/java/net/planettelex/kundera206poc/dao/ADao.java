package net.planettelex.kundera206poc.dao;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ADao<T> {

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	protected EntityManager em;

	/** The logger for every subclass to utilize. */
	protected final Logger log = LoggerFactory.getLogger(getClass());

	/** The entity type supported by this DAO. */
	private Class<T> entityType;

	public void delete(T entity) {
		em.remove(entity);
	}

	public void deleteEntityList(List<T> entities) {
		for (T entity : entities) {
			delete(entity);
		}
	}

	public T get(String id) {
		return em.find(getEntityType(), id);
	}

	public void save(T entity) {
		em.persist(entity);
	}

	public void saveEntityList(List<T> entities) {
		for (T entity : entities) {
			save(entity);
		}
	}

	@SuppressWarnings("unchecked")
	protected Class<T> getEntityType() {
		if (entityType == null) {
			entityType = (Class<T>) ((ParameterizedType) getClass()
					.getGenericSuperclass()).getActualTypeArguments()[0];
		}

		return entityType;
	}

	protected T getResult(Query q) {
		T result = null;
		List<T> results = getResultList(q);
		if (results != null && results.size() > 0) {
			result = results.get(0);
		}

		return result;
	}

	protected List<T> getResultList(Query query) {
		@SuppressWarnings("unchecked")
		List<T> resultList = query.getResultList();
		if (resultList == null) {
			resultList = new ArrayList<T>();
		}

		return resultList;
	}
}
