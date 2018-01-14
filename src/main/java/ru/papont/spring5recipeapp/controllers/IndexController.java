package ru.papont.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.papont.spring5recipeapp.model.Category;
import ru.papont.spring5recipeapp.model.UnitOfMeasure;
import ru.papont.spring5recipeapp.repositories.CategoryRepository;
import ru.papont.spring5recipeapp.repositories.UnitOfMeasureRepository;

import java.util.Optional;

/**
 * Main controller
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getId());


        return "index";
    }
}
