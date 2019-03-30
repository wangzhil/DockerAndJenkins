package com.guobao.dto.ifpinsure;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LcPremExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    public LcPremExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSidIsNull() {
            addCriterion("Sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("Sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Long value) {
            addCriterion("Sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Long value) {
            addCriterion("Sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Long value) {
            addCriterion("Sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Long value) {
            addCriterion("Sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Long value) {
            addCriterion("Sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Long value) {
            addCriterion("Sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Long> values) {
            addCriterion("Sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Long> values) {
            addCriterion("Sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Long value1, Long value2) {
            addCriterion("Sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Long value1, Long value2) {
            addCriterion("Sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andPolnoIsNull() {
            addCriterion("PolNo is null");
            return (Criteria) this;
        }

        public Criteria andPolnoIsNotNull() {
            addCriterion("PolNo is not null");
            return (Criteria) this;
        }

        public Criteria andPolnoEqualTo(String value) {
            addCriterion("PolNo =", value, "polno");
            return (Criteria) this;
        }

        public Criteria andPolnoNotEqualTo(String value) {
            addCriterion("PolNo <>", value, "polno");
            return (Criteria) this;
        }

        public Criteria andPolnoGreaterThan(String value) {
            addCriterion("PolNo >", value, "polno");
            return (Criteria) this;
        }

        public Criteria andPolnoGreaterThanOrEqualTo(String value) {
            addCriterion("PolNo >=", value, "polno");
            return (Criteria) this;
        }

        public Criteria andPolnoLessThan(String value) {
            addCriterion("PolNo <", value, "polno");
            return (Criteria) this;
        }

        public Criteria andPolnoLessThanOrEqualTo(String value) {
            addCriterion("PolNo <=", value, "polno");
            return (Criteria) this;
        }

        public Criteria andPolnoLike(String value) {
            addCriterion("PolNo like", value, "polno");
            return (Criteria) this;
        }

        public Criteria andPolnoNotLike(String value) {
            addCriterion("PolNo not like", value, "polno");
            return (Criteria) this;
        }

        public Criteria andPolnoIn(List<String> values) {
            addCriterion("PolNo in", values, "polno");
            return (Criteria) this;
        }

        public Criteria andPolnoNotIn(List<String> values) {
            addCriterion("PolNo not in", values, "polno");
            return (Criteria) this;
        }

        public Criteria andPolnoBetween(String value1, String value2) {
            addCriterion("PolNo between", value1, value2, "polno");
            return (Criteria) this;
        }

        public Criteria andPolnoNotBetween(String value1, String value2) {
            addCriterion("PolNo not between", value1, value2, "polno");
            return (Criteria) this;
        }

        public Criteria andDutycodeIsNull() {
            addCriterion("DutyCode is null");
            return (Criteria) this;
        }

        public Criteria andDutycodeIsNotNull() {
            addCriterion("DutyCode is not null");
            return (Criteria) this;
        }

        public Criteria andDutycodeEqualTo(String value) {
            addCriterion("DutyCode =", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeNotEqualTo(String value) {
            addCriterion("DutyCode <>", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeGreaterThan(String value) {
            addCriterion("DutyCode >", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeGreaterThanOrEqualTo(String value) {
            addCriterion("DutyCode >=", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeLessThan(String value) {
            addCriterion("DutyCode <", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeLessThanOrEqualTo(String value) {
            addCriterion("DutyCode <=", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeLike(String value) {
            addCriterion("DutyCode like", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeNotLike(String value) {
            addCriterion("DutyCode not like", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeIn(List<String> values) {
            addCriterion("DutyCode in", values, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeNotIn(List<String> values) {
            addCriterion("DutyCode not in", values, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeBetween(String value1, String value2) {
            addCriterion("DutyCode between", value1, value2, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeNotBetween(String value1, String value2) {
            addCriterion("DutyCode not between", value1, value2, "dutycode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeIsNull() {
            addCriterion("PayPlanCode is null");
            return (Criteria) this;
        }

        public Criteria andPayplancodeIsNotNull() {
            addCriterion("PayPlanCode is not null");
            return (Criteria) this;
        }

        public Criteria andPayplancodeEqualTo(String value) {
            addCriterion("PayPlanCode =", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeNotEqualTo(String value) {
            addCriterion("PayPlanCode <>", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeGreaterThan(String value) {
            addCriterion("PayPlanCode >", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeGreaterThanOrEqualTo(String value) {
            addCriterion("PayPlanCode >=", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeLessThan(String value) {
            addCriterion("PayPlanCode <", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeLessThanOrEqualTo(String value) {
            addCriterion("PayPlanCode <=", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeLike(String value) {
            addCriterion("PayPlanCode like", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeNotLike(String value) {
            addCriterion("PayPlanCode not like", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeIn(List<String> values) {
            addCriterion("PayPlanCode in", values, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeNotIn(List<String> values) {
            addCriterion("PayPlanCode not in", values, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeBetween(String value1, String value2) {
            addCriterion("PayPlanCode between", value1, value2, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeNotBetween(String value1, String value2) {
            addCriterion("PayPlanCode not between", value1, value2, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplantypeIsNull() {
            addCriterion("PayPlanType is null");
            return (Criteria) this;
        }

        public Criteria andPayplantypeIsNotNull() {
            addCriterion("PayPlanType is not null");
            return (Criteria) this;
        }

        public Criteria andPayplantypeEqualTo(String value) {
            addCriterion("PayPlanType =", value, "payplantype");
            return (Criteria) this;
        }

        public Criteria andPayplantypeNotEqualTo(String value) {
            addCriterion("PayPlanType <>", value, "payplantype");
            return (Criteria) this;
        }

        public Criteria andPayplantypeGreaterThan(String value) {
            addCriterion("PayPlanType >", value, "payplantype");
            return (Criteria) this;
        }

        public Criteria andPayplantypeGreaterThanOrEqualTo(String value) {
            addCriterion("PayPlanType >=", value, "payplantype");
            return (Criteria) this;
        }

        public Criteria andPayplantypeLessThan(String value) {
            addCriterion("PayPlanType <", value, "payplantype");
            return (Criteria) this;
        }

        public Criteria andPayplantypeLessThanOrEqualTo(String value) {
            addCriterion("PayPlanType <=", value, "payplantype");
            return (Criteria) this;
        }

        public Criteria andPayplantypeLike(String value) {
            addCriterion("PayPlanType like", value, "payplantype");
            return (Criteria) this;
        }

        public Criteria andPayplantypeNotLike(String value) {
            addCriterion("PayPlanType not like", value, "payplantype");
            return (Criteria) this;
        }

        public Criteria andPayplantypeIn(List<String> values) {
            addCriterion("PayPlanType in", values, "payplantype");
            return (Criteria) this;
        }

        public Criteria andPayplantypeNotIn(List<String> values) {
            addCriterion("PayPlanType not in", values, "payplantype");
            return (Criteria) this;
        }

        public Criteria andPayplantypeBetween(String value1, String value2) {
            addCriterion("PayPlanType between", value1, value2, "payplantype");
            return (Criteria) this;
        }

        public Criteria andPayplantypeNotBetween(String value1, String value2) {
            addCriterion("PayPlanType not between", value1, value2, "payplantype");
            return (Criteria) this;
        }

        public Criteria andStandpremIsNull() {
            addCriterion("StandPrem is null");
            return (Criteria) this;
        }

        public Criteria andStandpremIsNotNull() {
            addCriterion("StandPrem is not null");
            return (Criteria) this;
        }

        public Criteria andStandpremEqualTo(BigDecimal value) {
            addCriterion("StandPrem =", value, "standprem");
            return (Criteria) this;
        }

        public Criteria andStandpremNotEqualTo(BigDecimal value) {
            addCriterion("StandPrem <>", value, "standprem");
            return (Criteria) this;
        }

        public Criteria andStandpremGreaterThan(BigDecimal value) {
            addCriterion("StandPrem >", value, "standprem");
            return (Criteria) this;
        }

        public Criteria andStandpremGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("StandPrem >=", value, "standprem");
            return (Criteria) this;
        }

        public Criteria andStandpremLessThan(BigDecimal value) {
            addCriterion("StandPrem <", value, "standprem");
            return (Criteria) this;
        }

        public Criteria andStandpremLessThanOrEqualTo(BigDecimal value) {
            addCriterion("StandPrem <=", value, "standprem");
            return (Criteria) this;
        }

        public Criteria andStandpremIn(List<BigDecimal> values) {
            addCriterion("StandPrem in", values, "standprem");
            return (Criteria) this;
        }

        public Criteria andStandpremNotIn(List<BigDecimal> values) {
            addCriterion("StandPrem not in", values, "standprem");
            return (Criteria) this;
        }

        public Criteria andStandpremBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StandPrem between", value1, value2, "standprem");
            return (Criteria) this;
        }

        public Criteria andStandpremNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StandPrem not between", value1, value2, "standprem");
            return (Criteria) this;
        }

        public Criteria andPremIsNull() {
            addCriterion("Prem is null");
            return (Criteria) this;
        }

        public Criteria andPremIsNotNull() {
            addCriterion("Prem is not null");
            return (Criteria) this;
        }

        public Criteria andPremEqualTo(BigDecimal value) {
            addCriterion("Prem =", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremNotEqualTo(BigDecimal value) {
            addCriterion("Prem <>", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremGreaterThan(BigDecimal value) {
            addCriterion("Prem >", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Prem >=", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremLessThan(BigDecimal value) {
            addCriterion("Prem <", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Prem <=", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremIn(List<BigDecimal> values) {
            addCriterion("Prem in", values, "prem");
            return (Criteria) this;
        }

        public Criteria andPremNotIn(List<BigDecimal> values) {
            addCriterion("Prem not in", values, "prem");
            return (Criteria) this;
        }

        public Criteria andPremBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Prem between", value1, value2, "prem");
            return (Criteria) this;
        }

        public Criteria andPremNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Prem not between", value1, value2, "prem");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNull() {
            addCriterion("MakeDate is null");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNotNull() {
            addCriterion("MakeDate is not null");
            return (Criteria) this;
        }

        public Criteria andMakedateEqualTo(Date value) {
            addCriterion("MakeDate =", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotEqualTo(Date value) {
            addCriterion("MakeDate <>", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThan(Date value) {
            addCriterion("MakeDate >", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThanOrEqualTo(Date value) {
            addCriterion("MakeDate >=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThan(Date value) {
            addCriterion("MakeDate <", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThanOrEqualTo(Date value) {
            addCriterion("MakeDate <=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateIn(List<Date> values) {
            addCriterion("MakeDate in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotIn(List<Date> values) {
            addCriterion("MakeDate not in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateBetween(Date value1, Date value2) {
            addCriterion("MakeDate between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotBetween(Date value1, Date value2) {
            addCriterion("MakeDate not between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("ModifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("ModifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("ModifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("ModifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("ModifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("ModifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("ModifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("ModifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("ModifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("ModifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("ModifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lcprem
     *
     * @mbggenerated do_not_delete_during_merge Fri Mar 02 09:51:46 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lcprem
     *
     * @mbggenerated Fri Mar 02 09:51:46 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}