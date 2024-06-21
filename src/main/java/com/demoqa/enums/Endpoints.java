package com.demoqa.enums;

import lombok.Getter;

public enum Endpoints {
ALERT("/alerts"),
    MENU("/menu"),
PRACTICE("/automation-practice-form");

@Getter
    String endpoint;
Endpoints(String endpoint){
    this.endpoint=endpoint;
}
}
