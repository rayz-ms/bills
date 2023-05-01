package com.ggar.bills.model;

import com.ggar.bills.model.Id;
import com.ggar.bills.model.ImmutableId;
import com.ggar.bills.model.BaseEntity;
import org.immutables.value.Value;

import java.time.OffsetDateTime;

@Value.Immutable
@Value.Style(allParameters = true)
public interface Product extends BaseEntity<Id> {

	@Override
	@Value.Default
	default Id getId() {
		return ImmutableId.builder().build();
	}

	String name();
	Double units();
	Double quantity();
	Double costPerUnit();
	OffsetDateTime date();

}