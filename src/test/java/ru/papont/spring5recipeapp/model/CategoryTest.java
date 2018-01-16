package ru.papont.spring5recipeapp.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.01.2018.
 */
public class CategoryTest {
    private Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());

    }

    @Test
    public void getDecription() throws Exception {

    }

    @Test
    public void getRecipes() throws Exception {

    }

}