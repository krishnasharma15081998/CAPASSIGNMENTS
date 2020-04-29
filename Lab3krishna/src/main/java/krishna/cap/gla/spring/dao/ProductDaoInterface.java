package krishna.cap.gla.spring.dao;

import java.util.List;

import krishna.cap.gla.spring.entity.Product;


public interface ProductDaoInterface {

	public boolean create(Product product);
	public List<Product> reterive();


}
