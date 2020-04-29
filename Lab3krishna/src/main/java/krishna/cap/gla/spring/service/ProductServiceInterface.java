package krishna.cap.gla.spring.service;

import java.util.List;

import krishna.cap.gla.spring.entity.Product;


public interface ProductServiceInterface {

	public Product save(Product product);

	public List<Product> reterive();

}
