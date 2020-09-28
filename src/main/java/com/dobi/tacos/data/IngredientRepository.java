package com.dobi.tacos.data;

import com.dobi.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
//    Iterable<Ingredient> findAll();
//    Ingredient findById(String id);
//    Ingredient save(Ingredient ingredient);
}
