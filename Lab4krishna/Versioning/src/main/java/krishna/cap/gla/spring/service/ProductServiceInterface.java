package krishna.cap.gla.spring.service;

import java.util.List;

import krishna.cap.gla.spring.entity.Product;
import krishna.cap.gla.spring.entity.ProductOld;


public interface ProductServiceInterface {

	public Product save(Product product);

	public List<ProductOld> reterive();
	public List<Product> reterivev1();

}
