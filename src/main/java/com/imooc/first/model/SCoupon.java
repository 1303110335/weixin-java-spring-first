package com.imooc.first.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ming
 *
 */
public class SCoupon {
	private Integer id;
	private Integer appType;
	private String title;
	private String brief;
	private String desc;
	private String tag;
	private Integer expire;
	private Integer maxAcquire;
	private Integer number;
	private Integer ableNumber;
	private Integer stage;
	private Integer type;
	private BigDecimal amount;
	private BigDecimal cost;
	private BigDecimal rate;
	private int rateDays;
	private int rateDaysPercent;
	private BigDecimal rateAmount;
	private String image;
	private BigDecimal amountUpperLimit;
	private BigDecimal amountLowerLimit;
	private Integer dayUpperLimit;
	private Integer dayLowerLimit;
	private Date startTime;
	private Date endTime;
	private Date addTime;
	private Long addUserId;
	private Date modifyTime;
	private Long modifyUserId;
	private Integer isDeleted;
	/**
	 * 加息天数
	 */
	private String couponRateDay;
	/**
	 * 加息金额
	 */
	private String couponRateAmount;

	public String getCouponRateDay() {
		return couponRateDay;
	}

	public void setCouponRateDay(String couponRateDay) {
		this.couponRateDay = couponRateDay;
	}

	public String getCouponRateAmount() {
		return couponRateAmount;
	}

	public void setCouponRateAmount(String couponRateAmount) {
		this.couponRateAmount = couponRateAmount;
	}

	public BigDecimal getRateAmount() {
		return rateAmount;
	}

	public void setRateAmount(BigDecimal rateAmount) {
		this.rateAmount = rateAmount;
	}

	public int getRateDays() {
		return rateDays;
	}

	public void setRateDays(int rateDays) {
		this.rateDays = rateDays;
	}

	public int getRateDaysPercent() {
		return rateDaysPercent;
	}

	public void setRateDaysPercent(int rateDaysPercent) {
		this.rateDaysPercent = rateDaysPercent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAppType() {
		return appType;
	}

	public void setAppType(Integer appType) {
		this.appType = appType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getExpire() {
		return expire;
	}

	public void setExpire(Integer expire) {
		this.expire = expire;
	}

	public Integer getMaxAcquire() {
		return maxAcquire;
	}

	public void setMaxAcquire(Integer maxAcquire) {
		this.maxAcquire = maxAcquire;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getAbleNumber() {
		return ableNumber;
	}

	public void setAbleNumber(Integer ableNumber) {
		this.ableNumber = ableNumber;
	}

	public Integer getStage() {
		return stage;
	}

	public void setStage(Integer stage) {
		this.stage = stage;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public BigDecimal getAmountUpperLimit() {
		return amountUpperLimit;
	}

	public void setAmountUpperLimit(BigDecimal amountUpperLimit) {
		this.amountUpperLimit = amountUpperLimit;
	}

	public BigDecimal getAmountLowerLimit() {
		return amountLowerLimit;
	}

	public void setAmountLowerLimit(BigDecimal amountLowerLimit) {
		this.amountLowerLimit = amountLowerLimit;
	}

	public Integer getDayUpperLimit() {
		return dayUpperLimit;
	}

	public void setDayUpperLimit(Integer dayUpperLimit) {
		this.dayUpperLimit = dayUpperLimit;
	}

	public Integer getDayLowerLimit() {
		return dayLowerLimit;
	}

	public void setDayLowerLimit(Integer dayLowerLimit) {
		this.dayLowerLimit = dayLowerLimit;
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

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Long getAddUserId() {
		return addUserId;
	}

	public void setAddUserId(Long addUserId) {
		this.addUserId = addUserId;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(Long modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	/**
	 * 优惠券使用时间
	 */
	private Date useTime;

	public Date getUseTime() {
		return useTime;
	}

	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	// 个人优惠券使用状态
    private Integer status;

    private Integer finalDay;// 加息券最终加息天数
    private BigDecimal finalAmount; // 最终加息金额

	public Integer getFinalDay() {
		return finalDay;
	}

	public void setFinalDay(Integer finalDay) {
		this.finalDay = finalDay;
	}

	public BigDecimal getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(BigDecimal finalAmount) {
		this.finalAmount = finalAmount;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
    
}