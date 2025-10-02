package com.helger.phase4.portal.onboarding;

import org.springframework.stereotype.Service;

@Service
public class OnboardingService {

    private final CompanyRepository companyRepository;

    public OnboardingService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company createCompany(String name, String peppolIdentifier) {
        Company company = new Company();
        company.setName(name);
        company.setPeppolIdentifier(peppolIdentifier);
        return companyRepository.save(company);
    }
}
