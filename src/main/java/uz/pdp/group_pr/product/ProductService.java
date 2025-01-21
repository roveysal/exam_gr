package uz.pdp.group_pr.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
      private final ProductRepository productRepository;

       public Product getProductById(int id){
             return productRepository.products.get(id);
       }

       public List<Product> getAllProducts(){
             return productRepository.products;
       }

       public Product createProduct(Product product){
             if (getProductById(product.getId()) == null){
                   productRepository.products.add(product);
                   return product;
             }else {
                   throw new RuntimeException("Product already exists");
             }
       }

       public Product updateProduct(int id, Product product){
             if (getProductById(id) == null){
                   throw new RuntimeException("Product not found");
             }else{
                  return productRepository.products.set(id, product);
             }
       }

       public void deleteProduct(int id){
             if (getProductById(id) == null){
                   throw new RuntimeException("Product not found");
             }else {
                   productRepository.products.remove(id);
             }
       }


}
