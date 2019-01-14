package com.sky.function.entity;

import com.sky.common.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lantian
 * @since 2019-01-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TBaseFunction extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String fid;

    private Integer ftype;

    private String fname;

    private String fcode;

    private String pfid;

    private String frelation;

    private Integer flevel;

    private Integer fsort;

    private String ficon;

    private String furl;

    private Integer isExpand;

    private Integer status;

    private String remark;

    private LocalDateTime createdTime;

    private String creator;

    private LocalDateTime modifiedTime;

    private String modifier;

    private Integer isDelete;

    private Integer version;


}
