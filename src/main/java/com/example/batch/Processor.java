package com.example.batch;

import javax.batch.api.chunk.ItemProcessor;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class Processor implements ItemProcessor {

    @Override
    public Object processItem(final Object o) throws Exception {
        return o;
    }
}
