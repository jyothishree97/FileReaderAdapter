package com.stackroute.succour.fileReaderAdapter.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserMentions {
    private String screen_name;
    private String name;
    private String id;
    private String id_str;
    private int[] indices;
}
