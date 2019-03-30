package com.guobao.dto.product;

import java.util.ArrayList;
import java.util.List;

public class LmRiskDutyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    public LmRiskDutyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
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
     * This method corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
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

        public Criteria andRiskcodeIsNull() {
            addCriterion("RISKCODE is null");
            return (Criteria) this;
        }

        public Criteria andRiskcodeIsNotNull() {
            addCriterion("RISKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRiskcodeEqualTo(String value) {
            addCriterion("RISKCODE =", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotEqualTo(String value) {
            addCriterion("RISKCODE <>", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeGreaterThan(String value) {
            addCriterion("RISKCODE >", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RISKCODE >=", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeLessThan(String value) {
            addCriterion("RISKCODE <", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeLessThanOrEqualTo(String value) {
            addCriterion("RISKCODE <=", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeLike(String value) {
            addCriterion("RISKCODE like", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotLike(String value) {
            addCriterion("RISKCODE not like", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeIn(List<String> values) {
            addCriterion("RISKCODE in", values, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotIn(List<String> values) {
            addCriterion("RISKCODE not in", values, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeBetween(String value1, String value2) {
            addCriterion("RISKCODE between", value1, value2, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotBetween(String value1, String value2) {
            addCriterion("RISKCODE not between", value1, value2, "riskcode");
            return (Criteria) this;
        }

        public Criteria andDutycodeIsNull() {
            addCriterion("DUTYCODE is null");
            return (Criteria) this;
        }

        public Criteria andDutycodeIsNotNull() {
            addCriterion("DUTYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDutycodeEqualTo(String value) {
            addCriterion("DUTYCODE =", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeNotEqualTo(String value) {
            addCriterion("DUTYCODE <>", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeGreaterThan(String value) {
            addCriterion("DUTYCODE >", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeGreaterThanOrEqualTo(String value) {
            addCriterion("DUTYCODE >=", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeLessThan(String value) {
            addCriterion("DUTYCODE <", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeLessThanOrEqualTo(String value) {
            addCriterion("DUTYCODE <=", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeLike(String value) {
            addCriterion("DUTYCODE like", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeNotLike(String value) {
            addCriterion("DUTYCODE not like", value, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeIn(List<String> values) {
            addCriterion("DUTYCODE in", values, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeNotIn(List<String> values) {
            addCriterion("DUTYCODE not in", values, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeBetween(String value1, String value2) {
            addCriterion("DUTYCODE between", value1, value2, "dutycode");
            return (Criteria) this;
        }

        public Criteria andDutycodeNotBetween(String value1, String value2) {
            addCriterion("DUTYCODE not between", value1, value2, "dutycode");
            return (Criteria) this;
        }

        public Criteria andRiskverIsNull() {
            addCriterion("RISKVER is null");
            return (Criteria) this;
        }

        public Criteria andRiskverIsNotNull() {
            addCriterion("RISKVER is not null");
            return (Criteria) this;
        }

        public Criteria andRiskverEqualTo(String value) {
            addCriterion("RISKVER =", value, "riskver");
            return (Criteria) this;
        }

        public Criteria andRiskverNotEqualTo(String value) {
            addCriterion("RISKVER <>", value, "riskver");
            return (Criteria) this;
        }

        public Criteria andRiskverGreaterThan(String value) {
            addCriterion("RISKVER >", value, "riskver");
            return (Criteria) this;
        }

        public Criteria andRiskverGreaterThanOrEqualTo(String value) {
            addCriterion("RISKVER >=", value, "riskver");
            return (Criteria) this;
        }

        public Criteria andRiskverLessThan(String value) {
            addCriterion("RISKVER <", value, "riskver");
            return (Criteria) this;
        }

        public Criteria andRiskverLessThanOrEqualTo(String value) {
            addCriterion("RISKVER <=", value, "riskver");
            return (Criteria) this;
        }

        public Criteria andRiskverLike(String value) {
            addCriterion("RISKVER like", value, "riskver");
            return (Criteria) this;
        }

        public Criteria andRiskverNotLike(String value) {
            addCriterion("RISKVER not like", value, "riskver");
            return (Criteria) this;
        }

        public Criteria andRiskverIn(List<String> values) {
            addCriterion("RISKVER in", values, "riskver");
            return (Criteria) this;
        }

        public Criteria andRiskverNotIn(List<String> values) {
            addCriterion("RISKVER not in", values, "riskver");
            return (Criteria) this;
        }

        public Criteria andRiskverBetween(String value1, String value2) {
            addCriterion("RISKVER between", value1, value2, "riskver");
            return (Criteria) this;
        }

        public Criteria andRiskverNotBetween(String value1, String value2) {
            addCriterion("RISKVER not between", value1, value2, "riskver");
            return (Criteria) this;
        }

        public Criteria andChoflagIsNull() {
            addCriterion("CHOFLAG is null");
            return (Criteria) this;
        }

        public Criteria andChoflagIsNotNull() {
            addCriterion("CHOFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andChoflagEqualTo(String value) {
            addCriterion("CHOFLAG =", value, "choflag");
            return (Criteria) this;
        }

        public Criteria andChoflagNotEqualTo(String value) {
            addCriterion("CHOFLAG <>", value, "choflag");
            return (Criteria) this;
        }

        public Criteria andChoflagGreaterThan(String value) {
            addCriterion("CHOFLAG >", value, "choflag");
            return (Criteria) this;
        }

        public Criteria andChoflagGreaterThanOrEqualTo(String value) {
            addCriterion("CHOFLAG >=", value, "choflag");
            return (Criteria) this;
        }

        public Criteria andChoflagLessThan(String value) {
            addCriterion("CHOFLAG <", value, "choflag");
            return (Criteria) this;
        }

        public Criteria andChoflagLessThanOrEqualTo(String value) {
            addCriterion("CHOFLAG <=", value, "choflag");
            return (Criteria) this;
        }

        public Criteria andChoflagLike(String value) {
            addCriterion("CHOFLAG like", value, "choflag");
            return (Criteria) this;
        }

        public Criteria andChoflagNotLike(String value) {
            addCriterion("CHOFLAG not like", value, "choflag");
            return (Criteria) this;
        }

        public Criteria andChoflagIn(List<String> values) {
            addCriterion("CHOFLAG in", values, "choflag");
            return (Criteria) this;
        }

        public Criteria andChoflagNotIn(List<String> values) {
            addCriterion("CHOFLAG not in", values, "choflag");
            return (Criteria) this;
        }

        public Criteria andChoflagBetween(String value1, String value2) {
            addCriterion("CHOFLAG between", value1, value2, "choflag");
            return (Criteria) this;
        }

        public Criteria andChoflagNotBetween(String value1, String value2) {
            addCriterion("CHOFLAG not between", value1, value2, "choflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagIsNull() {
            addCriterion("SPECFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSpecflagIsNotNull() {
            addCriterion("SPECFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSpecflagEqualTo(String value) {
            addCriterion("SPECFLAG =", value, "specflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagNotEqualTo(String value) {
            addCriterion("SPECFLAG <>", value, "specflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagGreaterThan(String value) {
            addCriterion("SPECFLAG >", value, "specflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagGreaterThanOrEqualTo(String value) {
            addCriterion("SPECFLAG >=", value, "specflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagLessThan(String value) {
            addCriterion("SPECFLAG <", value, "specflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagLessThanOrEqualTo(String value) {
            addCriterion("SPECFLAG <=", value, "specflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagLike(String value) {
            addCriterion("SPECFLAG like", value, "specflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagNotLike(String value) {
            addCriterion("SPECFLAG not like", value, "specflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagIn(List<String> values) {
            addCriterion("SPECFLAG in", values, "specflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagNotIn(List<String> values) {
            addCriterion("SPECFLAG not in", values, "specflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagBetween(String value1, String value2) {
            addCriterion("SPECFLAG between", value1, value2, "specflag");
            return (Criteria) this;
        }

        public Criteria andSpecflagNotBetween(String value1, String value2) {
            addCriterion("SPECFLAG not between", value1, value2, "specflag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lmriskduty
     *
     * @mbg.generated do_not_delete_during_merge Wed Mar 28 17:27:14 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lmriskduty
     *
     * @mbg.generated Wed Mar 28 17:27:14 CST 2018
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