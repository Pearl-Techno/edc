package com.helger.phase4.portal.onboarding;

public class CreateCompanyRequest {

    private String name;

    private String peppolIdentifier;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeppolIdentifier() {
        return peppolIdentifier;
    }

    public void setPeppolIdentifier(String peppolIdentifier) {
        this.peppolIdentifier = peppolIdentifier;
    }
}
