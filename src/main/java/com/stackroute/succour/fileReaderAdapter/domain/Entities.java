package com.stackroute.succour.fileReaderAdapter.domain;

import lombok.*;

import java.text.DateFormatSymbols;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Entities {
    private String[] symbols;
    private Urls[] urls;
    private HashTags[] hashTags;
    private UserMentions[] user_mentions;
}
