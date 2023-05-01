package com.ggar.bills.model;

import com.ggar.bills.model.Id;
import com.ggar.bills.model.ImmutableId;
import com.ggar.bills.model.BaseEntity;
import org.immutables.value.Value;

import java.util.Map;

@Value.Immutable
@Value.Style(allParameters = true)
public interface Bill extends BaseEntity<Id> {

    @Override
    @Value.Default
    default Id getId() {
        return ImmutableId.builder().build();
    }
    String title();
    String base64Image;
    Map<Id, Product> products();

}
