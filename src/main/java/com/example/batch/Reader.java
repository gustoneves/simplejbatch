package com.example.batch;

import javax.batch.api.chunk.AbstractItemReader;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.io.Serializable;
import java.util.logging.Logger;

@Named
@Dependent
public class Reader extends AbstractItemReader {

    private int firstResult = 0;

    @Override
    public void open(final Serializable serializable) throws Exception {
        Logger.getGlobal().info("Open: ");
    }

    @Override
    public void close() throws Exception {
        Logger.getGlobal().info("Close: ");
    }

    @Override
    public Object readItem() throws Exception {
        Logger.getGlobal().info("ReadItem: ");
        if (firstResult <= 100) {
            firstResult++;
            return "Item" +firstResult;
        }
        return null;
    }

}
