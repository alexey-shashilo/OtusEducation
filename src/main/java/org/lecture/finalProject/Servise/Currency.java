package org.lecture.finalProject.Servise;

import java.util.ArrayList;
import java.util.List;

public class Currency {
    private final String code;
    private List<String[]> cashUnits = new ArrayList<>();
    private List<String[]> numerals = new ArrayList<>();

    public Currency(String acronym) {
        this.code = acronym;
    }

    public void setCashUnits(List<String[]> cashUnits) {
        this.cashUnits = cashUnits;
    }

    public void setNumerals(List<String[]> numerals) {
        this.numerals = numerals;
    }

    public List<String[]> getCashUnits() {
        return cashUnits;
    }

    public List<String[]> getNumerals() {
        return numerals;
    }

    public String getCode() {
        return code;
    }
}

