package com.lucasian.batch.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class DetailItem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String entry;
    @Column(nullable=true)
    private String expenseDate;
    @Column(nullable=true)
    private String checkNumber;
    @Column(nullable=true)
    private String checkName;
    private BigDecimal checkAmount;
    @Column(nullable=true)
    private String expenseDescription;

    @Column(nullable=true)
    private String documentId;
    @Column(nullable=true)
    private String documentIssuer;
    @Column(nullable=true)
    private String rfc;
    @Column(nullable=true)
    private String documentDate;
    @Column(nullable=true)
    private BigDecimal documentAmount;
    @Column(nullable=true)
    private String documentPolicy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public BigDecimal getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(BigDecimal checkAmount) {
        this.checkAmount = checkAmount;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentIssuer() {
        return documentIssuer;
    }

    public void setDocumentIssuer(String documentIssuer) {
        this.documentIssuer = documentIssuer;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public BigDecimal geDocumentAmount() {
        return documentAmount;
    }

    public void setDocumentAmount(BigDecimal documentAmount) {
        this.documentAmount = documentAmount;
    }

    public String getDocumentPolicy() {
        return documentPolicy;
    }

    public void setDocumentPolicy(String documentPolicy) {
        this.documentPolicy = documentPolicy;
    }


}


