package com.example.Onlineshoppingweb.endpoint.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class PageResponse<R> implements Serializable {

    @JsonProperty("current_page")
    protected Integer currentPage;

    @JsonProperty("records_in_page")
    protected Integer noOfRecordsInPage;

    @JsonProperty("total_records")
    protected long totalRecords;

    @JsonProperty("results")
    protected List<R> results;

}
