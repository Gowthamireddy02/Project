package com.myblog1.payload;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {
    private List<PostDto> postDto;
    private int PageNo;

    private int pageSize;
    private long totalElements;
    private int totalPages;

    private boolean last;

    public List<PostDto> getPostDto() {
        return postDto;
    }

    public int getPageNo() {
        return PageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public boolean isLast() {
        return last;
    }

    public void setPostDto(List<PostDto> postDto) {
        this.postDto = postDto;
    }

    public void setPageNo(int pageNo) {
        PageNo = pageNo;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public void setLast(boolean last) {
        this.last = last;
    }
}
