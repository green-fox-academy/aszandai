package com.greenfox.restdemo.model.log;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class LogSum {
    private List<Log> entries = new ArrayList<>();
    @JsonProperty("entry_count")
    private Integer entryCount;

    public LogSum(List<Log> entries, Integer entryCount) {
        this.entries = entries;
        this.entryCount = entryCount;
    }
}
