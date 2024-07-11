package com.example.demo.service;

import com.example.demo.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class FraudDetectionService {
    
    public boolean isFraudulent(Transaction transaction) {
        // Basic rule-based detection
        if (transaction.getAmount() > 10000) {
            return true; // flag as fraudulent if amount > 10000
        }
        // Add more rules as needed
        return false;
    }
}