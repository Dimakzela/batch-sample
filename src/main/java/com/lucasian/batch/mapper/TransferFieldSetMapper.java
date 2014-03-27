package com.lucasian.batch.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.lucasian.batch.domain.*;
import java.math.BigDecimal;

public class TransferFieldSetMapper implements FieldSetMapper<TransferItem> {
	@Override
	public TransferItem mapFieldSet(FieldSet fieldSet) throws BindException {
		TransferItem result = new TransferItem();

		result.setEntry(fieldSet.readString("entry"));
		result.setFase(fieldSet.readString("fase"));
		result.setAmount(new BigDecimal(fieldSet.readString("amount")));
		
		return result;
	}
}
