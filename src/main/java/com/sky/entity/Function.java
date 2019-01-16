package com.sky.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author lantian
 * @since 2019-01-11
 */
@TableName("t_base_function")
public class Function extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@TableId(value = "fid", type = IdType.UUID)
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

	@Override
	public String toString() {
		return "Function{" + "fid='" + fid + '\'' + ", ftype=" + ftype
				+ ", fname='" + fname + '\'' + ", fcode='" + fcode + '\''
				+ ", pfid='" + pfid + '\'' + ", frelation='" + frelation + '\''
				+ ", flevel=" + flevel + ", fsort=" + fsort + ", ficon='"
				+ ficon + '\'' + ", furl='" + furl + '\'' + ", isExpand="
				+ isExpand + ", status=" + status + ", remark='" + remark + '\''
				+ ", createdTime=" + createdTime + ", creator='" + creator
				+ '\'' + ", modifiedTime=" + modifiedTime + ", modifier='"
				+ modifier + '\'' + ", isDelete=" + isDelete + ", version="
				+ version + '}';
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public Integer getFtype() {
		return ftype;
	}

	public void setFtype(Integer ftype) {
		this.ftype = ftype;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFcode() {
		return fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public String getPfid() {
		return pfid;
	}

	public void setPfid(String pfid) {
		this.pfid = pfid;
	}

	public String getFrelation() {
		return frelation;
	}

	public void setFrelation(String frelation) {
		this.frelation = frelation;
	}

	public Integer getFlevel() {
		return flevel;
	}

	public void setFlevel(Integer flevel) {
		this.flevel = flevel;
	}

	public Integer getFsort() {
		return fsort;
	}

	public void setFsort(Integer fsort) {
		this.fsort = fsort;
	}

	public String getFicon() {
		return ficon;
	}

	public void setFicon(String ficon) {
		this.ficon = ficon;
	}

	public String getFurl() {
		return furl;
	}

	public void setFurl(String furl) {
		this.furl = furl;
	}

	public Integer getIsExpand() {
		return isExpand;
	}

	public void setIsExpand(Integer isExpand) {
		this.isExpand = isExpand;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(LocalDateTime modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
