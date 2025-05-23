package com.hanjeokseoul.quietseoul.dto;

import lombok.*;

@Getter
@AllArgsConstructor
public class CurrentCongestionResponse {
    private String name;
    private String type;
    private String congestionLevel;
    private String imageUrl;
}
