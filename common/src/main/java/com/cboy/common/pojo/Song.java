package com.cboy.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author yuhangbin
 * @date 2023/10/29
 **/
@Data
@Builder
@AllArgsConstructor
public class Song {
	private Long id;
	private Long userId;
	private String songName;
	private String cover;
	private String duration;
	private String downloadLink;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
}
