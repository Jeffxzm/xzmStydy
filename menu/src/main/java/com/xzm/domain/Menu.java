package com.xzm.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.math.BigDecimal;

@TableName("t_menu")
@Data
public class Menu {
    @TableId
    private Long id;
    private BigDecimal price;
}
