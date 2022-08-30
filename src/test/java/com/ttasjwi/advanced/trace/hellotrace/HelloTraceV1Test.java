package com.ttasjwi.advanced.trace.hellotrace;

import com.ttasjwi.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

class HelloTraceV1Test {

    @Test
    void begin_end() {
        HelloTraceV1 trace = new HelloTraceV1();

        TraceStatus status = trace.begin("hello"); // 로그 시작
        trace.end(status); // 로그 정상 종료
    }

    @Test
    public void begin_exception() {
        HelloTraceV1 trace = new HelloTraceV1();

        TraceStatus status = trace.begin("hello"); // 로그 시작
        trace.exception(status, new IllegalArgumentException()); // 로그 예외 종료
    }
}
