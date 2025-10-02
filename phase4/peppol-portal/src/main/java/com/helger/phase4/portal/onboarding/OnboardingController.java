package com.helger.phase4.portal.onboarding;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/onboarding")
public class OnboardingController {

    private final OnboardingService onboardingService;

    public OnboardingController(OnboardingService onboardingService) {
        this.onboardingService = onboardingService;
    }

    @PostMapping("/companies")
    public Company createCompany(@RequestBody CreateCompanyRequest request) {
        return onboardingService.createCompany(request.getName(), request.getPeppolIdentifier());
    }
}
