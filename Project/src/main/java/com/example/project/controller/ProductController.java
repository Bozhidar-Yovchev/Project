package com.example.project.controller;

import org.springframework.ui.Model;
import com.example.project.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductController {

    private final ProductService productService;

    // Constructor injection

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public String showProducts(Model model) {
        model.addAttribute("products",productService.getAllProducts());
        return "products";
    }
}
