package com.hy.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import com.hy.util.GsonUtils;
/**
* Activity
* Creater by chenhaiyang on 2020年4月29日
 */
public class Activity implements Serializable {

    /**
    * 主键
    */
    private Long id;

    /**
    * 活动名称
    */
    private String activityName;

    /**
    * 活动文案
    */
    private String copyWriting;

    /**
    * 活动线别
    */
    private String lineSeq;

    /**
    * 活动优惠类型
    */
    private Integer activityType;

    /**
    * rt活动类型(华北专用)
    */
    private Integer rtActivityType;

    /**
    * 活动规则信息
    */
    private String activityRule;

    /**
    * 活动内容
    */
    private String activityContent;

    /**
    * 活动终端0门店1大润发优鲜2淘鲜达；例如：如果全选就是0，1，2
    */
    private String activityChannel;


    /**
    * 促销档期编号
    */
    private String scheduleNo;

    /**
    * 限时活动开始时间
    */
    private Date startTime;

    /**
    * 活动结束时间
    */
    private Date endTime;

    /**
    * 排除卡别0：不排除 1 排除卡别89 2：排除卡别9临时卡 3：排除卡别589 4：仅联名卡 5排除卡别8团购卡 6 新人
    */
    private Integer excludeCardType;

    /**
    * 活动实体店 格式如:店id2，店id2
    */
    private String storeCodes;

    /**
    * 主厂特主题 例如主题编码1，名称为主题1，则为1|主题
    */
    private String supTitle;

    /**
    * 主厂特内容 例如主题内容编码2名称为内容2，则为2|内容2
    */
    private String supContent;

    /**
    * 预估业绩
    */
    private BigDecimal salesPerformance;

    /**
    * 补差百分比，如10，就是10%，50.55就是55.55%，如果为0则表示不不差
    */
    private BigDecimal priceRate;

    /**
    * 是否补差 : 0 否 1 是(含税) 2 是(未税)
    */
    private Integer isPriceRate;

    /**
    * 线下陈列区域 id
    */
    private String displayArea;

    /**
    * 活动状态: 0 建立中 1 已生效 2已取消
    */
    private Integer status;

    /**
    * 0 未刷商品 1 正在刷商品 2 已刷商品 3 已前置同步
    */
    private Integer pushStatus;

    /**
    * 推送区部促销档 0 未推送 1 已推送
    */
    private Integer promPushStatus;

    /**
    * 行销审核状态: 0 未提交审核1已提交审核(待专员审核) 2 专员审核通过(待经理审核) 3 经理审核通过(待美陈确认) (待主管审核)
    */
    private Integer auditStatus;

    /**
    * 6 审核后修改 1审核后修改提交(待专员审核) 2专员审核通过(待经理审核) 3经理审核通过(待美陈确认) (待主管审核)
    */
    private Integer auditEditStatus;

    /**
    * 美陈审核状态: 0 未确认1 已确认
    */
    private Integer mcStatus;

    /**
    * 审核后修改 美陈审核状态: 0 未确认 1 已确认
    */
    private Integer mcEditStatus;

    /**
    * 线下是否上dm 0 否 1 是
    */
    private Integer dmStatus;

    /**
    * 线下布置需求 0 没有 1 有
    */
    private Integer layoutNeedsStatus;

    /**
    * 布置需求内容
    */
    private String layoutNeedsContent;

    /**
    * 备注
    */
    private String remarks;

    /**
    * 是否逾期提报 0 否 1 是
    */
    private Integer expiryStatus;

    /**
    * 送审人域名
    */
    private String applyId;

    /**
    * 送审时间
    */
    private Date applyTime;

    /**
    * 审核人域名
    */
    private String auditId;

    /**
    * 审核时间
    */
    private Date auditTime;

    /**
    * 审批意见
    */
    private String auditOpinion;

    /**
    * 0 无 1 有
    */
    private Integer hasEdit;

    /**
    * 大区是否为华北 0非 1是
    */
    private Integer isNorth;

    /**
    * 华北条件剔除促销级别价别
    */
    private String northRuleOut;

    /**
    * 活动次数限制
    */
    private String buyLimit;

    /**
    * 提示送审 :0 默认值 1 提示送审 2 档前7天提示送审
    */
    private Integer auditTips;

    /**
    * 店均预估销量
    */
    private Integer salesQty;

    /**
    * 被复制活动id
    */
    private Long copyActivityId;

    /**
    * 复制来源原因 : 1 中台复制 2 特殊档期修改复制活动
    */
    private Integer copySource;

    /**
    * 营销中台单品特价活动 是否限购 0 否 1 是
    */
    private Integer isLimit;

    /**
    * 图片地址
    */
    private String picUrl;

    /**
    * 活动关键字
    */
    private String keywords;

    /**
    * 创建人域名
    */
    private String createId;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新人域名
    */
    private String updateId;

    /**
    * 修改时间
    */
    private Date updateTime;

    /**
    * 推送更新时间
    */
    private Date pushUpdateTime;

    /**
    * 后台人员手动操作更新时间
    */
    private Date optUpdateTime;

    /**
    * 取消人域名
    */
    private String cancelId;

    /**
    * 取消时间
    */
    private Date cancelTime;

    public Activity() {
    }

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getActivityName() {
		return activityName;
	}



	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}



	public String getCopyWriting() {
		return copyWriting;
	}



	public void setCopyWriting(String copyWriting) {
		this.copyWriting = copyWriting;
	}



	public String getLineSeq() {
		return lineSeq;
	}



	public void setLineSeq(String lineSeq) {
		this.lineSeq = lineSeq;
	}



	public Integer getActivityType() {
		return activityType;
	}



	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}



	public Integer getRtActivityType() {
		return rtActivityType;
	}



	public void setRtActivityType(Integer rtActivityType) {
		this.rtActivityType = rtActivityType;
	}



	public String getActivityRule() {
		return activityRule;
	}



	public void setActivityRule(String activityRule) {
		this.activityRule = activityRule;
	}



	public String getActivityContent() {
		return activityContent;
	}



	public void setActivityContent(String activityContent) {
		this.activityContent = activityContent;
	}



	public String getActivityChannel() {
		return activityChannel;
	}



	public void setActivityChannel(String activityChannel) {
		this.activityChannel = activityChannel;
	}



	public String getScheduleNo() {
		return scheduleNo;
	}



	public void setScheduleNo(String scheduleNo) {
		this.scheduleNo = scheduleNo;
	}



	public Date getStartTime() {
		return startTime;
	}



	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}



	public Date getEndTime() {
		return endTime;
	}



	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}



	public Integer getExcludeCardType() {
		return excludeCardType;
	}



	public void setExcludeCardType(Integer excludeCardType) {
		this.excludeCardType = excludeCardType;
	}



	public String getStoreCodes() {
		return storeCodes;
	}



	public void setStoreCodes(String storeCodes) {
		this.storeCodes = storeCodes;
	}



	public String getSupTitle() {
		return supTitle;
	}



	public void setSupTitle(String supTitle) {
		this.supTitle = supTitle;
	}



	public String getSupContent() {
		return supContent;
	}



	public void setSupContent(String supContent) {
		this.supContent = supContent;
	}



	public BigDecimal getSalesPerformance() {
		return salesPerformance;
	}



	public void setSalesPerformance(BigDecimal salesPerformance) {
		this.salesPerformance = salesPerformance;
	}



	public BigDecimal getPriceRate() {
		return priceRate;
	}



	public void setPriceRate(BigDecimal priceRate) {
		this.priceRate = priceRate;
	}



	public Integer getIsPriceRate() {
		return isPriceRate;
	}



	public void setIsPriceRate(Integer isPriceRate) {
		this.isPriceRate = isPriceRate;
	}



	public String getDisplayArea() {
		return displayArea;
	}



	public void setDisplayArea(String displayArea) {
		this.displayArea = displayArea;
	}



	public Integer getStatus() {
		return status;
	}



	public void setStatus(Integer status) {
		this.status = status;
	}



	public Integer getPushStatus() {
		return pushStatus;
	}



	public void setPushStatus(Integer pushStatus) {
		this.pushStatus = pushStatus;
	}



	public Integer getPromPushStatus() {
		return promPushStatus;
	}



	public void setPromPushStatus(Integer promPushStatus) {
		this.promPushStatus = promPushStatus;
	}



	public Integer getAuditStatus() {
		return auditStatus;
	}



	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}



	public Integer getAuditEditStatus() {
		return auditEditStatus;
	}



	public void setAuditEditStatus(Integer auditEditStatus) {
		this.auditEditStatus = auditEditStatus;
	}



	public Integer getMcStatus() {
		return mcStatus;
	}



	public void setMcStatus(Integer mcStatus) {
		this.mcStatus = mcStatus;
	}



	public Integer getMcEditStatus() {
		return mcEditStatus;
	}



	public void setMcEditStatus(Integer mcEditStatus) {
		this.mcEditStatus = mcEditStatus;
	}



	public Integer getDmStatus() {
		return dmStatus;
	}



	public void setDmStatus(Integer dmStatus) {
		this.dmStatus = dmStatus;
	}



	public Integer getLayoutNeedsStatus() {
		return layoutNeedsStatus;
	}



	public void setLayoutNeedsStatus(Integer layoutNeedsStatus) {
		this.layoutNeedsStatus = layoutNeedsStatus;
	}



	public String getLayoutNeedsContent() {
		return layoutNeedsContent;
	}



	public void setLayoutNeedsContent(String layoutNeedsContent) {
		this.layoutNeedsContent = layoutNeedsContent;
	}



	public String getRemarks() {
		return remarks;
	}



	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}



	public Integer getExpiryStatus() {
		return expiryStatus;
	}



	public void setExpiryStatus(Integer expiryStatus) {
		this.expiryStatus = expiryStatus;
	}



	public String getApplyId() {
		return applyId;
	}



	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}



	public Date getApplyTime() {
		return applyTime;
	}



	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}



	public String getAuditId() {
		return auditId;
	}



	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}



	public Date getAuditTime() {
		return auditTime;
	}



	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}



	public String getAuditOpinion() {
		return auditOpinion;
	}



	public void setAuditOpinion(String auditOpinion) {
		this.auditOpinion = auditOpinion;
	}



	public Integer getHasEdit() {
		return hasEdit;
	}



	public void setHasEdit(Integer hasEdit) {
		this.hasEdit = hasEdit;
	}



	public Integer getIsNorth() {
		return isNorth;
	}



	public void setIsNorth(Integer isNorth) {
		this.isNorth = isNorth;
	}



	public String getNorthRuleOut() {
		return northRuleOut;
	}



	public void setNorthRuleOut(String northRuleOut) {
		this.northRuleOut = northRuleOut;
	}



	public String getBuyLimit() {
		return buyLimit;
	}



	public void setBuyLimit(String buyLimit) {
		this.buyLimit = buyLimit;
	}



	public Integer getAuditTips() {
		return auditTips;
	}



	public void setAuditTips(Integer auditTips) {
		this.auditTips = auditTips;
	}



	public Integer getSalesQty() {
		return salesQty;
	}



	public void setSalesQty(Integer salesQty) {
		this.salesQty = salesQty;
	}



	public Long getCopyActivityId() {
		return copyActivityId;
	}



	public void setCopyActivityId(Long copyActivityId) {
		this.copyActivityId = copyActivityId;
	}



	public Integer getCopySource() {
		return copySource;
	}



	public void setCopySource(Integer copySource) {
		this.copySource = copySource;
	}



	public Integer getIsLimit() {
		return isLimit;
	}



	public void setIsLimit(Integer isLimit) {
		this.isLimit = isLimit;
	}



	public String getPicUrl() {
		return picUrl;
	}



	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}



	public String getKeywords() {
		return keywords;
	}



	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}



	public String getCreateId() {
		return createId;
	}



	public void setCreateId(String createId) {
		this.createId = createId;
	}



	public Date getCreateTime() {
		return createTime;
	}



	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}



	public String getUpdateId() {
		return updateId;
	}



	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}



	public Date getUpdateTime() {
		return updateTime;
	}



	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}



	public Date getPushUpdateTime() {
		return pushUpdateTime;
	}



	public void setPushUpdateTime(Date pushUpdateTime) {
		this.pushUpdateTime = pushUpdateTime;
	}



	public Date getOptUpdateTime() {
		return optUpdateTime;
	}



	public void setOptUpdateTime(Date optUpdateTime) {
		this.optUpdateTime = optUpdateTime;
	}



	public String getCancelId() {
		return cancelId;
	}



	public void setCancelId(String cancelId) {
		this.cancelId = cancelId;
	}



	public Date getCancelTime() {
		return cancelTime;
	}



	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}



	@Override
	public String toString() {
		return GsonUtils.toJson(this);
	}
}

