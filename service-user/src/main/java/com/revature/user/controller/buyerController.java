package com.revature.user.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
@Controller
public class buyerController {
	
	 @GetMapping("/buyerPage")
	    public String showAllProductsPage(Model model) {
	        // URL to fetch products from the product service
	        String productUrl = "http://localhost:8082/products";

	        // Use RestTemplate to fetch the product data from the external API
	        RestTemplate restTemplate = new RestTemplate();
	        ResponseEntity<List> response = restTemplate.getForEntity(productUrl, List.class);

	        // Pass the products to the JSP view
	        model.addAttribute("products", response.getBody());

	        return "buyer/buyerPage"; // Corresponds to allProduct.jsp
	    }
	 
//	 @GetMapping("/buyerAllProduct")
//	    public String showAllProducts(Model model) {
//	        // URL to fetch products from the product service
//	        String productUrl = "http://localhost:8082/products";
//
//	        // Use RestTemplate to fetch the product data from the external API
//	        RestTemplate restTemplate = new RestTemplate();
//	        ResponseEntity<List> response = restTemplate.getForEntity(productUrl, List.class);
//
//	        // Pass the products to the JSP view
//	        model.addAttribute("products", response.getBody());
//
//	        return "buyer/buyerProduct"; // Corresponds to allProduct.jsp
//	    }

	 @GetMapping("/addToCart")
	    public String showAddToCartPage() {
	        return "buyer/addToCart";  // Corresponds to the new addToCart.jsp
	    }
	 
	 @GetMapping("/cartPage")
	    public String showCartPage() {
	        return "buyer/cartPage";  // This corresponds to cartPage.jsp
	    }
//	 @GetMapping("/categoryProduct/{id}")
//	    @ResponseBody
//	    public List<?> getProductsByCategory(@PathVariable("id") int categoryId) {
//	        String categoryProductUrl = "http://localhost:8082/products/categoryProduct/" + categoryId;
//	        RestTemplate restTemplate = new RestTemplate();
//	        ResponseEntity<List> response = restTemplate.getForEntity(categoryProductUrl, List.class);
//	        return response.getBody();
//	    }
	 
	 
	 @GetMapping("/buyerAllProduct")
	    public String viewProductsPage() {
	        return "buyer/buyerProduct";  // This returns the JSP page
	    }
}
