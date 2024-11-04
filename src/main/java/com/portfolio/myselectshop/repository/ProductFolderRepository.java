package com.portfolio.myselectshop.repository;

import com.portfolio.myselectshop.entity.Folder;
import com.portfolio.myselectshop.entity.Product;
import com.portfolio.myselectshop.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);
}
