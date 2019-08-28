package com.stackroute.succour.fileReaderAdapter.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TwitterTimeline {


    private String created_at;
    private String id;
    private String id_str;
    private String text;
    private String truncated;
    private Entities entities;
}
