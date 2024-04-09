package app.respository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import app.models.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, UUID>{

}
