package com.viva.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply=true)
public class LdtConverter implements AttributeConverter<LocalDate, Date>{

	@Override
	//LocalDate is converted into java.sql.Date
	public Date convertToDatabaseColumn(LocalDate ldt) {
		return Date.valueOf(ldt);
	}
	
	@Override
	//java.sql.Date is converted into LocalDate
	public LocalDate convertToEntityAttribute(Date sqldt) {
			return sqldt.toLocalDate();
	}

}
