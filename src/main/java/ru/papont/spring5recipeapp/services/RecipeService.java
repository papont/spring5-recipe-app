package ru.papont.spring5recipeapp.services;

import ru.papont.spring5recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getResipes();
}
