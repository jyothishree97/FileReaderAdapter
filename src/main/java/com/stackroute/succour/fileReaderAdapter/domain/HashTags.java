package com.stackroute.succour.fileReaderAdapter.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HashTags {
    private String text;
    private int[] indices;
}
