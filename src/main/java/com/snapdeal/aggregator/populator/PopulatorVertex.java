package com.snapdeal.aggregator.populator;

import com.snapdeal.aggregator.logging.DiagnosticsRecorder;
import com.snapdeal.aggregator.utils.Constants.ExecutionStatus;
import com.snapdeal.aggregator.utils.Constants.ProcessStatus;

public class PopulatorVertex {
	
    private final Populator p;
    private final int index;
    
    private ProcessStatus processStatus = ProcessStatus.NotStarted;
    private ExecutionStatus status = ExecutionStatus.Undefined;

    private Throwable executionException;
    private DiagnosticsRecorder diagnosticsRecorder;
    
    public PopulatorVertex(int index, Populator p){
        this.index = index;
        this.p = p;
    }

    public ExecutionStatus getStatus() {
        return status;
    }

    public void setStatus(ExecutionStatus status) {
        this.status = status;
    }

    public ProcessStatus getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(ProcessStatus processStatus) {
        this.processStatus = processStatus;
    }

    public Populator getPopulator() {
        return p;
    }

    public int getIndex() {
        return index;
    }

    public Throwable getExecutionException() {
        return executionException;
    }

    public void setExecutionException(Throwable executionException) {
        this.executionException = executionException;
    }

    public DiagnosticsRecorder getDiagnosticsRecorder() {
        return diagnosticsRecorder;
    }

    public void setDiagnosticsRecorder(DiagnosticsRecorder dr) {
        this.diagnosticsRecorder = dr;
    }

    public boolean isCompleted() {
        if(status == ExecutionStatus.Succeeded || status == ExecutionStatus.Failed)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return p.getTag() + ":" + index + ":" + status;
    }

}
