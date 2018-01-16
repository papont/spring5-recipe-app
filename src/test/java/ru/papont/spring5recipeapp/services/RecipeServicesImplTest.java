package ru.papont.spring5recipeapp.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ru.papont.spring5recipeapp.model.Recipe;
import ru.papont.spring5recipeapp.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by user on 16.01.2018.
 */
public class RecipeServicesImplTest {

    RecipeServicesImpl recipeServices;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeServices = new RecipeServicesImpl(recipeRepository);
    }

    @Test
    public void getReсipes() throws Exception {
        Recipe recipe = new Recipe();
        Set recipesData = new HashSet();
        recipesData.add(recipe);

        when(recipeServices.getReсipes()).thenReturn(recipesData);

        Set<Recipe> reсipes = recipeServices.getReсipes();

        assertEquals(reсipes.size(), 1);

        verify(recipeRepository, times(1)).findAll();
    }

}