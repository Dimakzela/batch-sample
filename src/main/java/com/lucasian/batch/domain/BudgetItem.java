package com.lucasian.batch.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class BudgetItem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
		private String fase;
		private String entry;
		private String budgetType;
		private BigDecimal amount;
		
		public void setId(Long id){
			this.id = id;
		}
		public Long getId(){
			return id;
		}
		public void setFase(String fase){
			this.fase = fase;
		}
		public String getFase(){
			return fase;
		}
		public void setEntry(String entry){
			this.entry = entry;
		}
		public String getEntry(){
			return entry;
		}
		public void setBudgetType(String budgetType){
			this.budgetType = budgetType;
		}
		public String getBudgetType(){
			return budgetType;
		}
		public void setAmount(BigDecimal amount){
			this.amount = amount;
		}
		public BigDecimal getAmount(){
			return amount;
		}
}


