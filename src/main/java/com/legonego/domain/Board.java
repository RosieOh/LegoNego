package com.legonego.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Board {
    private Integer bno;
    private String id;
    private String title;
    private String content;
    private Integer cnt;
    private String regdate;
}
