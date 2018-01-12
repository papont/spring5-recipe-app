package ru.papont.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.papont.spring5recipeapp.model.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
