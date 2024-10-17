package com.revature.user.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.revature.user.model.ProductResponse;
import com.revature.user.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    // Show all products on the JSP page
    @GetMapping("/products")
    public String getAllProducts(Model model) {
        List<ProductResponse> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product";  // Refers to the JSP page 'products.jsp'
    }
}
