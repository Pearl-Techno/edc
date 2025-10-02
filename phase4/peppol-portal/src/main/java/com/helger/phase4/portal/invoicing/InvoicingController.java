package com.helger.phase4.portal.invoicing;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invoicing")
public class InvoicingController {

    private final InvoicingService invoicingService;

    public InvoicingController(InvoicingService invoicingService) {
        this.invoicingService = invoicingService;
    }

    @PostMapping("/invoices")
    public Invoice createInvoice(@RequestBody CreateInvoiceRequest request) {
        return invoicingService.createInvoice(request.getNumber(), request.getAmount());
    }
}
