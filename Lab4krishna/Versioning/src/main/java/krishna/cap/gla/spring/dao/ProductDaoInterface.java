package krishna.cap.gla.spring.dao;

import java.util.List;

import krishna.cap.gla.spring.entity.Product;
import krishna.cap.gla.spring.entity.ProductOld;


public interface ProductDaoInterface {

	public boolean create(Product product);
	public List<Product> reterivev1();
//	public List<ProductOld> reterieve();

}
