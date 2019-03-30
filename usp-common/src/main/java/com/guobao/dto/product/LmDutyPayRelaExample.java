package com.guobao.dto.product;

import java.util.ArrayList;
import java.util.List;

public class LmDutyPayRelaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    public LmDutyPayRelaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
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
     * This method corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
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

        public Criteria andPayplancodeIsNull() {
            addCriterion("PAYPLANCODE is null");
            return (Criteria) this;
        }

        public Criteria andPayplancodeIsNotNull() {
            addCriterion("PAYPLANCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayplancodeEqualTo(String value) {
            addCriterion("PAYPLANCODE =", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeNotEqualTo(String value) {
            addCriterion("PAYPLANCODE <>", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeGreaterThan(String value) {
            addCriterion("PAYPLANCODE >", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYPLANCODE >=", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeLessThan(String value) {
            addCriterion("PAYPLANCODE <", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeLessThanOrEqualTo(String value) {
            addCriterion("PAYPLANCODE <=", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeLike(String value) {
            addCriterion("PAYPLANCODE like", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeNotLike(String value) {
            addCriterion("PAYPLANCODE not like", value, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeIn(List<String> values) {
            addCriterion("PAYPLANCODE in", values, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeNotIn(List<String> values) {
            addCriterion("PAYPLANCODE not in", values, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeBetween(String value1, String value2) {
            addCriterion("PAYPLANCODE between", value1, value2, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplancodeNotBetween(String value1, String value2) {
            addCriterion("PAYPLANCODE not between", value1, value2, "payplancode");
            return (Criteria) this;
        }

        public Criteria andPayplannameIsNull() {
            addCriterion("PAYPLANNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayplannameIsNotNull() {
            addCriterion("PAYPLANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayplannameEqualTo(String value) {
            addCriterion("PAYPLANNAME =", value, "payplanname");
            return (Criteria) this;
        }

        public Criteria andPayplannameNotEqualTo(String value) {
            addCriterion("PAYPLANNAME <>", value, "payplanname");
            return (Criteria) this;
        }

        public Criteria andPayplannameGreaterThan(String value) {
            addCriterion("PAYPLANNAME >", value, "payplanname");
            return (Criteria) this;
        }

        public Criteria andPayplannameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYPLANNAME >=", value, "payplanname");
            return (Criteria) this;
        }

        public Criteria andPayplannameLessThan(String value) {
            addCriterion("PAYPLANNAME <", value, "payplanname");
            return (Criteria) this;
        }

        public Criteria andPayplannameLessThanOrEqualTo(String value) {
            addCriterion("PAYPLANNAME <=", value, "payplanname");
            return (Criteria) this;
        }

        public Criteria andPayplannameLike(String value) {
            addCriterion("PAYPLANNAME like", value, "payplanname");
            return (Criteria) this;
        }

        public Criteria andPayplannameNotLike(String value) {
            addCriterion("PAYPLANNAME not like", value, "payplanname");
            return (Criteria) this;
        }

        public Criteria andPayplannameIn(List<String> values) {
            addCriterion("PAYPLANNAME in", values, "payplanname");
            return (Criteria) this;
        }

        public Criteria andPayplannameNotIn(List<String> values) {
            addCriterion("PAYPLANNAME not in", values, "payplanname");
            return (Criteria) this;
        }

        public Criteria andPayplannameBetween(String value1, String value2) {
            addCriterion("PAYPLANNAME between", value1, value2, "payplanname");
            return (Criteria) this;
        }

        public Criteria andPayplannameNotBetween(String value1, String value2) {
            addCriterion("PAYPLANNAME not between", value1, value2, "payplanname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lmdutypayrela
     *
     * @mbg.generated do_not_delete_during_merge Wed Mar 28 19:50:45 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lmdutypayrela
     *
     * @mbg.generated Wed Mar 28 19:50:45 CST 2018
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