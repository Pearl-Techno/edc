package com.helger.phase4.portal.invoicing;

import org.springframework.stereotype.Service;

@Service
public class InvoicingService {

    private final InvoiceRepository invoiceRepository;

    public InvoicingService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice createInvoice(String number, Double amount) {
        Invoice invoice = new Invoice();
        invoice.setNumber(number);
        invoice.setAmount(amount);
        return invoiceRepository.save(invoice);
    }
}
