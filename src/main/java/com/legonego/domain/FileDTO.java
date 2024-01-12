package com.legonego.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FileDTO {
    private Integer no;
    private Integer pno;
    private String saveFolder;
    private String originFile;
    private String saveFile;
    private Long fileSize;
    private String uploadDate;
}
