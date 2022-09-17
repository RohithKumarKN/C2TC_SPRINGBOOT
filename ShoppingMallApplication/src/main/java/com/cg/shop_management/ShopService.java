package com.cg.shop_management;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ShopService {

	@Autowired
	private ShopRepository repo;

	public List<Shop> listAll() {

		return repo.findAll();
	}

	public Shop get(Integer shopEmployeeId) {

		return repo.findById(shopEmployeeId).get();
	}

	public void save(Shop shop) {
		repo.save(shop);
	}

	public void delete(Integer shopEmployeeId) {
		repo.deleteById(shopEmployeeId);
	}

}
