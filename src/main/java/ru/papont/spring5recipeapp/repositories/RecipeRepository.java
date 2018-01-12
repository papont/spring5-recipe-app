package ru.papont.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.papont.spring5recipeapp.model.Recipe;

/**
 * Created by user on 12.01.2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
