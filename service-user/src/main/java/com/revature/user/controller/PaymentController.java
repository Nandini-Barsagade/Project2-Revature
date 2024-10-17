package com.revature.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.revature.user.model.PaymentDetails;
import com.revature.user.service.PaymentService;

@Controller
public class PaymentController {


	@GetMapping("/processPayment")
	public String viewPaymentPage(@RequestParam("totalPrice") double totalPrice, Model model) {
	    model.addAttribute("totalPrice", totalPrice);
	    return "buyer/paymentForm";  // Return the JSP page
	}

	
	
	@PostMapping("/successPayment")
    public String successPayment() {
        return "buyer/successPayment";  // This returns the JSP page
    }
	
	 @GetMapping("/orders")
	    public String viewOrders() {
	        return "buyer/orders";  // The JSP page for orders should be in /WEB-INF/views/buyer/orders.jsp
	    }
	
}

