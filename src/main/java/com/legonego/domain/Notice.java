package com.legonego.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Notice {
    private Integer no;
    private String id;
    private String title;
    private String content;
    private Integer visit;
    private String resdate;
}
