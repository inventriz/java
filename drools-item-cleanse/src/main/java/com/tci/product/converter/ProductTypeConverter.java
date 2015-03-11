package com.tci.product.converter;

import java.util.List;

import org.apache.camel.Converter;
import org.drools.command.Command;
import org.drools.command.CommandFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tci.product.vo.ItemVO;


@Converter
public class ProductTypeConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductTypeConverter.class);

    @Converter
    public static Command toCommandFromList(List inputList) {
        LOGGER.debug("Executing ProductTypeConverter's toCommandFromList method");
        return CommandFactory.newInsertElements(inputList);
    }

    @Converter
    public static Command toCommand(ItemVO product) {
        LOGGER.debug("Executing ProductTypeConverter's toCommand method");
        return CommandFactory.newInsert(product);
    }
}
