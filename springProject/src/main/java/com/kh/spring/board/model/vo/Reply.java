package com.kh.spring.board.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Reply {
	private int relpyNo;
	private String replyContent;
	private int refBno;
	private String replyWriter;
	private String createDate;
	private String Status;
	
	
}
