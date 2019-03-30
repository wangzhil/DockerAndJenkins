package com.guobao.dto.ifpinsure;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LcCertifyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    public LcCertifyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
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
     * This method corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
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
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Long value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Long value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Long value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Long value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Long value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Long value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Long> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Long> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Long value1, Long value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Long value1, Long value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andPrtnoIsNull() {
            addCriterion("PrtNo is null");
            return (Criteria) this;
        }

        public Criteria andPrtnoIsNotNull() {
            addCriterion("PrtNo is not null");
            return (Criteria) this;
        }

        public Criteria andPrtnoEqualTo(String value) {
            addCriterion("PrtNo =", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoNotEqualTo(String value) {
            addCriterion("PrtNo <>", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoGreaterThan(String value) {
            addCriterion("PrtNo >", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoGreaterThanOrEqualTo(String value) {
            addCriterion("PrtNo >=", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoLessThan(String value) {
            addCriterion("PrtNo <", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoLessThanOrEqualTo(String value) {
            addCriterion("PrtNo <=", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoLike(String value) {
            addCriterion("PrtNo like", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoNotLike(String value) {
            addCriterion("PrtNo not like", value, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoIn(List<String> values) {
            addCriterion("PrtNo in", values, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoNotIn(List<String> values) {
            addCriterion("PrtNo not in", values, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoBetween(String value1, String value2) {
            addCriterion("PrtNo between", value1, value2, "prtno");
            return (Criteria) this;
        }

        public Criteria andPrtnoNotBetween(String value1, String value2) {
            addCriterion("PrtNo not between", value1, value2, "prtno");
            return (Criteria) this;
        }

        public Criteria andCertifynoIsNull() {
            addCriterion("CertifyNo is null");
            return (Criteria) this;
        }

        public Criteria andCertifynoIsNotNull() {
            addCriterion("CertifyNo is not null");
            return (Criteria) this;
        }

        public Criteria andCertifynoEqualTo(String value) {
            addCriterion("CertifyNo =", value, "certifyno");
            return (Criteria) this;
        }

        public Criteria andCertifynoNotEqualTo(String value) {
            addCriterion("CertifyNo <>", value, "certifyno");
            return (Criteria) this;
        }

        public Criteria andCertifynoGreaterThan(String value) {
            addCriterion("CertifyNo >", value, "certifyno");
            return (Criteria) this;
        }

        public Criteria andCertifynoGreaterThanOrEqualTo(String value) {
            addCriterion("CertifyNo >=", value, "certifyno");
            return (Criteria) this;
        }

        public Criteria andCertifynoLessThan(String value) {
            addCriterion("CertifyNo <", value, "certifyno");
            return (Criteria) this;
        }

        public Criteria andCertifynoLessThanOrEqualTo(String value) {
            addCriterion("CertifyNo <=", value, "certifyno");
            return (Criteria) this;
        }

        public Criteria andCertifynoLike(String value) {
            addCriterion("CertifyNo like", value, "certifyno");
            return (Criteria) this;
        }

        public Criteria andCertifynoNotLike(String value) {
            addCriterion("CertifyNo not like", value, "certifyno");
            return (Criteria) this;
        }

        public Criteria andCertifynoIn(List<String> values) {
            addCriterion("CertifyNo in", values, "certifyno");
            return (Criteria) this;
        }

        public Criteria andCertifynoNotIn(List<String> values) {
            addCriterion("CertifyNo not in", values, "certifyno");
            return (Criteria) this;
        }

        public Criteria andCertifynoBetween(String value1, String value2) {
            addCriterion("CertifyNo between", value1, value2, "certifyno");
            return (Criteria) this;
        }

        public Criteria andCertifynoNotBetween(String value1, String value2) {
            addCriterion("CertifyNo not between", value1, value2, "certifyno");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
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
     * This class corresponds to the database table lccertify
     *
     * @mbggenerated do_not_delete_during_merge Fri Feb 02 09:05:54 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lccertify
     *
     * @mbggenerated Fri Feb 02 09:05:54 CST 2018
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