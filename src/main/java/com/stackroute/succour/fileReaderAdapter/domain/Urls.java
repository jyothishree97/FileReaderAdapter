package com.stackroute.succour.fileReaderAdapter.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Urls {
    private String url;
    private String expanded_url;
    private String display_url;
    private int[] indices;
}
