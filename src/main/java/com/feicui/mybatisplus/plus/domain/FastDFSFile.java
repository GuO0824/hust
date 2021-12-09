package com.feicui.mybatisplus.plus.domain;

import lombok.Data;

@Data
public class FastDFSFile {
  private String name;
  private byte[] content;
  private String ext;
  private String md5;
  private String author;
  private String height;

  //省略getter、setter
}
