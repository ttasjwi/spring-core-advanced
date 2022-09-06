package com.ttasjwi.advanced.trace.logtrace;

import com.ttasjwi.advanced.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);
    void end(TraceStatus status);
    void exception(TraceStatus status, Exception e);

}
