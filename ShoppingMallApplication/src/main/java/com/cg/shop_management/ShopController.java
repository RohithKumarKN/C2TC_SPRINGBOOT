/**
 * 
 */
package com.cg.shop_management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rohith
 *
 */
@RestController
public class ShopController {

	@Autowired
	private ShopService service;

	// Retrieve All the rows
	@GetMapping("/shops")
	public List<Shop> list() {
		return service.listAll();

	}

	// Retrieve Specific Records from Database
	@GetMapping("/shops/{shopEmployeeId}")
	public ResponseEntity<Shop> get(@PathVariable Integer shopEmployeeId) {
		Shop shop = service.get(shopEmployeeId);
		return new ResponseEntity<Shop>(shop, HttpStatus.OK);
	}

	// Inserting the data or Create a row in database
	@PostMapping("/shops")
	public void add(@RequestBody Shop shop) {
		service.save(shop);
	}

	// Update operation - record in database
	@PutMapping("/shops/{shopEmployeeId}")
	public ResponseEntity<?> update(@RequestBody Shop shop, @PathVariable Integer shopEmployeeId) {

		try {
			Shop existShop = service.get(shopEmployeeId);
			service.save(shop);
			return new ResponseEntity<Shop>(shop, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		}
	}

	// Delete Operation
	@DeleteMapping("/shops/{shopEmployeeId}")
	public void delete(@PathVariable Integer shopEmployeeId) {
		service.delete(shopEmployeeId);
	}

}
