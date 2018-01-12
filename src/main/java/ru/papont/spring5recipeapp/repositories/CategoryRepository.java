package ru.papont.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.papont.spring5recipeapp.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
