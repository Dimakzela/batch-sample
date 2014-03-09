package com.lucasian.batch.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class SummaryItem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String expense;
    private String concept;
    @Column(nullable=true)
    private BigDecimal approvedAmount;
    private BigDecimal modifiedAmount;
    private BigDecimal stageReceivedAmount;
    @Column(nullable=true)
    private BigDecimal stageSpentAmount;
    private BigDecimal totalReceivedAmount;
    private BigDecimal totalSpentAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public BigDecimal getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(BigDecimal approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

    public BigDecimal getModifiedAmount() {
        return modifiedAmount;
    }

    public void setModifiedAmount(BigDecimal modifiedAmount) {
        this.modifiedAmount = modifiedAmount;
    }

    public BigDecimal getStageReceivedAmount() {
        return stageReceivedAmount;
    }

    public void setStageReceivedAmount(BigDecimal stageReceivedAmount) {
        this.stageReceivedAmount = stageReceivedAmount;
    }

    public BigDecimal getTotalReceivedAmount() {
        return stageReceivedAmount;
    }

    public void setStageSpentAmount(BigDecimal stageSpentAmount) {
        this.stageSpentAmount = stageSpentAmount;
    }

    public BigDecimal getTotalSpentAmount() {
        return totalSpentAmount;
    }

    public void setStageTotalAmount(BigDecimal totalSpentAmount) {
        this.totalSpentAmount = totalSpentAmount;
    }

}


