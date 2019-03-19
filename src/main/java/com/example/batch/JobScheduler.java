package com.example.batch;

import javax.batch.operations.JobOperator;
import javax.batch.operations.NoSuchJobException;
import javax.batch.runtime.BatchRuntime;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class JobScheduler {

    private static final String IMPORT_JOB = "importJob";

    @Schedule(second = "*/30", minute = "*", hour = "*")
    public void processImportBDQVs() {
        JobOperator jobOperator = BatchRuntime.getJobOperator();
        try {
            if (jobOperator.getRunningExecutions(IMPORT_JOB).isEmpty()) {
                jobOperator.start(IMPORT_JOB, null);
            }
        } catch (final NoSuchJobException ex) {
            jobOperator.start(IMPORT_JOB, null);
        }
    }
}
