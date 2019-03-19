package com.example.batch;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.util.List;
import java.util.logging.Logger;

@Named
@Dependent
public class Writer extends AbstractItemWriter {


    @Override
    public void writeItems(final List<Object> list) throws Exception {
        list.forEach(dto -> Logger.getGlobal().info("Item written: " + dto));
    }
}
