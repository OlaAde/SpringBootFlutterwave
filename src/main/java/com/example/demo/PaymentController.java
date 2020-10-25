package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class PaymentController {
    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @RequestMapping("/pay")
    public String pay(@ModelAttribute Payload payload, Model model, HttpServletRequest request) throws Exception {
        if (request.getMethod().contentEquals("GET")) {
            //This happens in case of a cancelling. This redirects to the home page.
            return "redirect:";
        }
        paymentService.initialize(model);
        return "pay";
    }

    @GetMapping("/callback")
    public String callback(@RequestParam Map<String, String> params) {
        String transactionId = params.get("transaction_id");
        Map<String, Object> transactionData = paymentService.verifyTransaction(transactionId);
        return "callback";
    }

    @GetMapping
    public String home(Model model) {
        model.addAttribute("payload", new Payload());
        return "home";
    }
}