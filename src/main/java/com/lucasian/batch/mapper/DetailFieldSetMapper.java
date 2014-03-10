package com.lucasian.batch.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.lucasian.batch.domain.*;

public class DetailFieldSetMapper implements FieldSetMapper<DetailItem> {
    @Override
        public DetailItem mapFieldSet(FieldSet fieldSet) throws BindException {
            DetailItem result = new DetailItem();

            result.setEntry(fieldSet.readString("entry"));
            result.setExpenseDate(fieldSet.readString("expenseDate"));
            result.setCheckNumber(fieldSet.readString("checkNumber"));
            result.setCheckName(fieldSet.readString("checkName"));
            result.setCheckAmount(fieldSet.readBigDecimal("checkAmount"));
            result.setExpenseDescription(fieldSet.readString("expenseDescription"));

            result.setDocumentId(fieldSet.readString("documentId"));
            result.setDocumentIssuer(fieldSet.readString("documentIssuer"));
            result.setRfc(fieldSet.readString("rfc"));
            result.setDocumentDate(fieldSet.readString("documentDate"));
            result.setDocumentAmount(fieldSet.readBigDecimal("documentAmount"));
            result.setDocumentPolicy(fieldSet.readString("documentPolicy"));

            return result;
        }
}
