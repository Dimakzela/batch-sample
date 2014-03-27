package com.lucasian.batch.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.lucasian.batch.domain.*;
import java.math.BigDecimal;

public class BudgetFieldSetMapper implements FieldSetMapper<BudgetItem> {
	@Override
	public BudgetItem mapFieldSet(FieldSet fieldSet) throws BindException {
		BudgetItem result = new BudgetItem();

		result.setEntry(fieldSet.readString("entry"));
		result.setFase(fieldSet.readString("fase"));
		result.setBudgetType(fieldSet.readString("budgetType"));
		result.setAmount(new BigDecimal(fieldSet.readString("amount")));
		
		return result;
	}
}
