package com.imooc.first.api.resp.activity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zzqana on 3/18/2016.
 */
public class UserCouponBean {
	/**
	 * 优惠券id
	 */
	private Integer id;
	/**
	 * 优惠劵类型，1-加息卷，2-投资红包卷，3-现金卷，4-第三方卷
	 */
	private Integer type;
	/**
	 * 是否使用，0-未领取，1-未使用，2-已使用，3-已作废
	 */
	private Integer status;
	/**
	 * 优惠劵名称
	 */
	private String title;
	/**
	 * 优惠券简介
	 */
	private String brief;
	/**
	 * 优惠劵描述
	 */
	private String desc;
	/**
	 * 可投类型
	 */
	private String tag;
	/**
	 * 可投类型数字
	 */
	private String[] tagId;
	private Integer finalDay;
	private BigDecimal finalAmount;

	public Integer getFinalDay() {
		return finalDay;
	}

	public void setFinalDay(Integer finalDay) {
		this.finalDay = finalDay;
	}

	public BigDecimal getFinalAmount() {
		if (finalAmount == null)
			return null;
		return finalAmount.setScale(2, BigDecimal.ROUND_DOWN);
	}

	public void setFinalAmount(BigDecimal finalAmount) {
		this.finalAmount = finalAmount;
	}

	public String[] getTagId() {
		return tagId;
	}

	public void setTagId(String[] tagId) {
		this.tagId = tagId;
	}

	/**
	 * 获取时间
	 */
	private Date gainTime;
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 过期时间
	 */
	private Date endTime;
	/**
	 * 使用时间
	 */
	private Date useTime;
	private String rechargeNo;

	public String getRechargeNo() {
		return rechargeNo;
	}

	public void setRechargeNo(String rechargeNo) {
		this.rechargeNo = rechargeNo;
	}

	public Date getUseTime() {
		return useTime;
	}

	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	/**
	 * 红包/现金卷金额
	 */
	private BigDecimal amount;
	/**
	 * 利率
	 */
	private BigDecimal rate;
	/**
	 * 第三方兑换码
	 */
	private String redemptionCode;
	/**
	 * 第三方图片
	 */
	private String image;
	/**
	 * 起投天数上限
	 */
	private BigDecimal dayUpperLimit;
	/**
	 * 起投天数下限
	 */
	private BigDecimal dayLowerLimit;
	/**
	 * 起投金额上限
	 */
	private BigDecimal amountUpperLimit;
	/**
	 * 起投金额下限
	 */
	private BigDecimal amountLowerLimit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
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

	public Date getGainTime() {
		return gainTime;
	}

	public void setGainTime(Date gainTime) {
		this.gainTime = gainTime;
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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getRedemptionCode() {
		return redemptionCode;
	}

	public void setRedemptionCode(String redemptionCode) {
		this.redemptionCode = redemptionCode;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public BigDecimal getDayUpperLimit() {
		return dayUpperLimit;
	}

	public void setDayUpperLimit(BigDecimal dayUpperLimit) {
		this.dayUpperLimit = dayUpperLimit;
	}

	public BigDecimal getDayLowerLimit() {
		return dayLowerLimit;
	}

	public void setDayLowerLimit(BigDecimal dayLowerLimit) {
		this.dayLowerLimit = dayLowerLimit;
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

	/* begin 拓展属性 2018年4月17日 */
	// 加息天数描述（后台填写）
	private String rateDaysDesc;
	// 加息天数（和加息天数百分比互斥）
	private Integer rateDays;
	// 基于标期天数的百分比（50表示50%，如果标期是30天，则加息15天）
	private Integer rateDaysPercent;
	// 参与加息的本金（0表示不限制）
	private BigDecimal rateAmount;

	public String getRateDaysDesc() {
		return rateDaysDesc;
	}

	public void setRateDaysDesc(String rateDaysDesc) {
		this.rateDaysDesc = rateDaysDesc;
	}

	public Integer getRateDays() {
		return rateDays;
	}

	public void setRateDays(Integer rateDays) {
		this.rateDays = rateDays;
	}

	public Integer getRateDaysPercent() {
		return rateDaysPercent;
	}

	public void setRateDaysPercent(Integer rateDaysPercent) {
		this.rateDaysPercent = rateDaysPercent;
	}

	public BigDecimal getRateAmount() {
		return rateAmount;
	}

	public void setRateAmount(BigDecimal rateAmount) {
		this.rateAmount = rateAmount;
	}

	/* end 拓展属性 2018年4月17日 */
}
