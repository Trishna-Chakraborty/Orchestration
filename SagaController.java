package com.example.orchestrator;

import org.springframework.web.bind.annotation.GetMapping;

public class SagaController {

    @GetMapping("/sagas")
    public void sagaStart(){
        new SagaOrchestrator();

    }
}
