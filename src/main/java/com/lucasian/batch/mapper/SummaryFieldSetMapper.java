package com.lucasian.batch.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.lucasian.batch.domain.*;

public class SummaryFieldSetMapper implements FieldSetMapper<SummaryItem> {
    @Override
        public SummaryItem mapFieldSet(FieldSet fieldSet) throws BindException {
            SummaryItem result = new SummaryItem();

            result.setExpense(fieldSet.readString("expense"));
            result.setConcept(fieldSet.readString("concept"));
            result.setApprovedAmount(fieldSet.readBigDecimal("approvedAmount"));
            result.setModifiedAmount(fieldSet.readBigDecimal("modifiedAmount"));
            result.setStageReceivedAmount(fieldSet.readBigDecimal("stageReceivedAmount"));
            result.setStageSpentAmount(fieldSet.readBigDecimal("stageSpendAmount"));
            result.setTotalReceivedAmount(fieldSet.readBigDecimal("totalReceivedAmount"));
            result.setTotalSpentAmount(fieldSet.readBigDecimal("totalSpentAmount"));

            return result;
        }
}
