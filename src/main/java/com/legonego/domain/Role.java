package com.legonego.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum Role {
    ADMIN("ADMIN"), EMP("EMP"), USER("USER");
    private String value;
}
