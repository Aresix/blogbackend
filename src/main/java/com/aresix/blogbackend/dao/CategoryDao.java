package com.aresix.blogbackend.dao;

import com.aresix.blogbackend.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
