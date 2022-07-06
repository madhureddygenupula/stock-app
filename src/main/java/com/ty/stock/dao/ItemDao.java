package com.ty.stock.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.stock.dto.Item;


public class ItemDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction;

	public void saveItem(Item item) {
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(item);

		entityTransaction.commit();
	}

	public List<Item> getAllItems() {
		Query query = entityManager.createQuery("Select i from Item i");
		return query.getResultList();
	}

	public boolean deleteItem(int id) {
		entityTransaction = entityManager.getTransaction();

		Item item = entityManager.find(Item.class, id);
		if (item != null) {
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;

		} else {
			return false;
		}
	}
	public Item getItemById(int id)
	{
		return entityManager.find(Item.class, id);
	}
	
	public void updateItem(Item item)
	{
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.merge(item);

		entityTransaction.commit();
}
}
