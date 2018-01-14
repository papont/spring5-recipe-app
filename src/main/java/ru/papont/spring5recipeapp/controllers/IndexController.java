package ru.papont.spring5recipeapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.papont.spring5recipeapp.model.Category;
import ru.papont.spring5recipeapp.model.UnitOfMeasure;
import ru.papont.spring5recipeapp.repositories.CategoryRepository;
import ru.papont.spring5recipeapp.repositories.UnitOfMeasureRepository;
import ru.papont.spring5recipeapp.services.RecipeService;

import java.util.Optional;

/**
 * Main controller
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index Page");

        model.addAttribute("recipes", recipeService.getReсipes());
        return "index";
    }
}
