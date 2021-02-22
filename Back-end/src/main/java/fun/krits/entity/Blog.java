package fun.krits.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private Integer id;
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date date;
    private String tag;
    private String category;
    private String content;
}