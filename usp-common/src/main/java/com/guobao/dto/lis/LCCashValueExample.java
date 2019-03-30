package com.guobao.dto.lis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LCCashValueExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    public LCCashValueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
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
     * This method corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andContnoIsNull() {
            addCriterion("ContNo is null");
            return (Criteria) this;
        }

        public Criteria andContnoIsNotNull() {
            addCriterion("ContNo is not null");
            return (Criteria) this;
        }

        public Criteria andContnoEqualTo(String value) {
            addCriterion("ContNo =", value, "contno");
            return (Criteria) this;
        }

        public Criteria andContnoNotEqualTo(String value) {
            addCriterion("ContNo <>", value, "contno");
            return (Criteria) this;
        }

        public Criteria andContnoGreaterThan(String value) {
            addCriterion("ContNo >", value, "contno");
            return (Criteria) this;
        }

        public Criteria andContnoGreaterThanOrEqualTo(String value) {
            addCriterion("ContNo >=", value, "contno");
            return (Criteria) this;
        }

        public Criteria andContnoLessThan(String value) {
            addCriterion("ContNo <", value, "contno");
            return (Criteria) this;
        }

        public Criteria andContnoLessThanOrEqualTo(String value) {
            addCriterion("ContNo <=", value, "contno");
            return (Criteria) this;
        }

        public Criteria andContnoLike(String value) {
            addCriterion("ContNo like", value, "contno");
            return (Criteria) this;
        }

        public Criteria andContnoNotLike(String value) {
            addCriterion("ContNo not like", value, "contno");
            return (Criteria) this;
        }

        public Criteria andContnoIn(List<String> values) {
            addCriterion("ContNo in", values, "contno");
            return (Criteria) this;
        }

        public Criteria andContnoNotIn(List<String> values) {
            addCriterion("ContNo not in", values, "contno");
            return (Criteria) this;
        }

        public Criteria andContnoBetween(String value1, String value2) {
            addCriterion("ContNo between", value1, value2, "contno");
            return (Criteria) this;
        }

        public Criteria andContnoNotBetween(String value1, String value2) {
            addCriterion("ContNo not between", value1, value2, "contno");
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

        public Criteria andCaldateIsNull() {
            addCriterion("CalDate is null");
            return (Criteria) this;
        }

        public Criteria andCaldateIsNotNull() {
            addCriterion("CalDate is not null");
            return (Criteria) this;
        }

        public Criteria andCaldateEqualTo(Date value) {
            addCriterionForJDBCDate("CalDate =", value, "caldate");
            return (Criteria) this;
        }

        public Criteria andCaldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CalDate <>", value, "caldate");
            return (Criteria) this;
        }

        public Criteria andCaldateGreaterThan(Date value) {
            addCriterionForJDBCDate("CalDate >", value, "caldate");
            return (Criteria) this;
        }

        public Criteria andCaldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CalDate >=", value, "caldate");
            return (Criteria) this;
        }

        public Criteria andCaldateLessThan(Date value) {
            addCriterionForJDBCDate("CalDate <", value, "caldate");
            return (Criteria) this;
        }

        public Criteria andCaldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CalDate <=", value, "caldate");
            return (Criteria) this;
        }

        public Criteria andCaldateIn(List<Date> values) {
            addCriterionForJDBCDate("CalDate in", values, "caldate");
            return (Criteria) this;
        }

        public Criteria andCaldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CalDate not in", values, "caldate");
            return (Criteria) this;
        }

        public Criteria andCaldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CalDate between", value1, value2, "caldate");
            return (Criteria) this;
        }

        public Criteria andCaldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CalDate not between", value1, value2, "caldate");
            return (Criteria) this;
        }

        public Criteria andCashvalueIsNull() {
            addCriterion("CashValue is null");
            return (Criteria) this;
        }

        public Criteria andCashvalueIsNotNull() {
            addCriterion("CashValue is not null");
            return (Criteria) this;
        }

        public Criteria andCashvalueEqualTo(BigDecimal value) {
            addCriterion("CashValue =", value, "cashvalue");
            return (Criteria) this;
        }

        public Criteria andCashvalueNotEqualTo(BigDecimal value) {
            addCriterion("CashValue <>", value, "cashvalue");
            return (Criteria) this;
        }

        public Criteria andCashvalueGreaterThan(BigDecimal value) {
            addCriterion("CashValue >", value, "cashvalue");
            return (Criteria) this;
        }

        public Criteria andCashvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CashValue >=", value, "cashvalue");
            return (Criteria) this;
        }

        public Criteria andCashvalueLessThan(BigDecimal value) {
            addCriterion("CashValue <", value, "cashvalue");
            return (Criteria) this;
        }

        public Criteria andCashvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CashValue <=", value, "cashvalue");
            return (Criteria) this;
        }

        public Criteria andCashvalueIn(List<BigDecimal> values) {
            addCriterion("CashValue in", values, "cashvalue");
            return (Criteria) this;
        }

        public Criteria andCashvalueNotIn(List<BigDecimal> values) {
            addCriterion("CashValue not in", values, "cashvalue");
            return (Criteria) this;
        }

        public Criteria andCashvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CashValue between", value1, value2, "cashvalue");
            return (Criteria) this;
        }

        public Criteria andCashvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CashValue not between", value1, value2, "cashvalue");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNull() {
            addCriterion("MAKEDATE is null");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNotNull() {
            addCriterion("MAKEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMakedateEqualTo(Date value) {
            addCriterionForJDBCDate("MAKEDATE =", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MAKEDATE <>", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThan(Date value) {
            addCriterionForJDBCDate("MAKEDATE >", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MAKEDATE >=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThan(Date value) {
            addCriterionForJDBCDate("MAKEDATE <", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MAKEDATE <=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateIn(List<Date> values) {
            addCriterionForJDBCDate("MAKEDATE in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MAKEDATE not in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MAKEDATE between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MAKEDATE not between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andMaketimeIsNull() {
            addCriterion("MAKETIME is null");
            return (Criteria) this;
        }

        public Criteria andMaketimeIsNotNull() {
            addCriterion("MAKETIME is not null");
            return (Criteria) this;
        }

        public Criteria andMaketimeEqualTo(String value) {
            addCriterion("MAKETIME =", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotEqualTo(String value) {
            addCriterion("MAKETIME <>", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThan(String value) {
            addCriterion("MAKETIME >", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThanOrEqualTo(String value) {
            addCriterion("MAKETIME >=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThan(String value) {
            addCriterion("MAKETIME <", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThanOrEqualTo(String value) {
            addCriterion("MAKETIME <=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLike(String value) {
            addCriterion("MAKETIME like", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotLike(String value) {
            addCriterion("MAKETIME not like", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeIn(List<String> values) {
            addCriterion("MAKETIME in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotIn(List<String> values) {
            addCriterion("MAKETIME not in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeBetween(String value1, String value2) {
            addCriterion("MAKETIME between", value1, value2, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotBetween(String value1, String value2) {
            addCriterion("MAKETIME not between", value1, value2, "maketime");
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
            addCriterionForJDBCDate("ModifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterionForJDBCDate("ModifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterionForJDBCDate("ModifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterionForJDBCDate("ModifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ModifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ModifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ModifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(String value) {
            addCriterion("ModifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(String value) {
            addCriterion("ModifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(String value) {
            addCriterion("ModifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(String value) {
            addCriterion("ModifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(String value) {
            addCriterion("ModifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLike(String value) {
            addCriterion("ModifyTime like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotLike(String value) {
            addCriterion("ModifyTime not like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<String> values) {
            addCriterion("ModifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<String> values) {
            addCriterion("ModifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(String value1, String value2) {
            addCriterion("ModifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(String value1, String value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lccashvalue
     *
     * @mbggenerated do_not_delete_during_merge Thu Sep 13 18:25:53 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lccashvalue
     *
     * @mbggenerated Thu Sep 13 18:25:53 CST 2018
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