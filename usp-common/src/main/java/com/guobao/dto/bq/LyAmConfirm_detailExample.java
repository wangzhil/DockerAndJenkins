package com.guobao.dto.bq;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LyAmConfirm_detailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    public LyAmConfirm_detailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
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
     * This method corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
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

        public Criteria andTransseqIsNull() {
            addCriterion("TransSeq is null");
            return (Criteria) this;
        }

        public Criteria andTransseqIsNotNull() {
            addCriterion("TransSeq is not null");
            return (Criteria) this;
        }

        public Criteria andTransseqEqualTo(String value) {
            addCriterion("TransSeq =", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotEqualTo(String value) {
            addCriterion("TransSeq <>", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqGreaterThan(String value) {
            addCriterion("TransSeq >", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqGreaterThanOrEqualTo(String value) {
            addCriterion("TransSeq >=", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqLessThan(String value) {
            addCriterion("TransSeq <", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqLessThanOrEqualTo(String value) {
            addCriterion("TransSeq <=", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqLike(String value) {
            addCriterion("TransSeq like", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotLike(String value) {
            addCriterion("TransSeq not like", value, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqIn(List<String> values) {
            addCriterion("TransSeq in", values, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotIn(List<String> values) {
            addCriterion("TransSeq not in", values, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqBetween(String value1, String value2) {
            addCriterion("TransSeq between", value1, value2, "transseq");
            return (Criteria) this;
        }

        public Criteria andTransseqNotBetween(String value1, String value2) {
            addCriterion("TransSeq not between", value1, value2, "transseq");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoIsNull() {
            addCriterion("EDORACCEPTNO is null");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoIsNotNull() {
            addCriterion("EDORACCEPTNO is not null");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoEqualTo(String value) {
            addCriterion("EDORACCEPTNO =", value, "edoracceptno");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoNotEqualTo(String value) {
            addCriterion("EDORACCEPTNO <>", value, "edoracceptno");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoGreaterThan(String value) {
            addCriterion("EDORACCEPTNO >", value, "edoracceptno");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoGreaterThanOrEqualTo(String value) {
            addCriterion("EDORACCEPTNO >=", value, "edoracceptno");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoLessThan(String value) {
            addCriterion("EDORACCEPTNO <", value, "edoracceptno");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoLessThanOrEqualTo(String value) {
            addCriterion("EDORACCEPTNO <=", value, "edoracceptno");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoLike(String value) {
            addCriterion("EDORACCEPTNO like", value, "edoracceptno");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoNotLike(String value) {
            addCriterion("EDORACCEPTNO not like", value, "edoracceptno");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoIn(List<String> values) {
            addCriterion("EDORACCEPTNO in", values, "edoracceptno");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoNotIn(List<String> values) {
            addCriterion("EDORACCEPTNO not in", values, "edoracceptno");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoBetween(String value1, String value2) {
            addCriterion("EDORACCEPTNO between", value1, value2, "edoracceptno");
            return (Criteria) this;
        }

        public Criteria andEdoracceptnoNotBetween(String value1, String value2) {
            addCriterion("EDORACCEPTNO not between", value1, value2, "edoracceptno");
            return (Criteria) this;
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

        public Criteria andApplychannelIsNull() {
            addCriterion("ApplyChannel is null");
            return (Criteria) this;
        }

        public Criteria andApplychannelIsNotNull() {
            addCriterion("ApplyChannel is not null");
            return (Criteria) this;
        }

        public Criteria andApplychannelEqualTo(String value) {
            addCriterion("ApplyChannel =", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelNotEqualTo(String value) {
            addCriterion("ApplyChannel <>", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelGreaterThan(String value) {
            addCriterion("ApplyChannel >", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelGreaterThanOrEqualTo(String value) {
            addCriterion("ApplyChannel >=", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelLessThan(String value) {
            addCriterion("ApplyChannel <", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelLessThanOrEqualTo(String value) {
            addCriterion("ApplyChannel <=", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelLike(String value) {
            addCriterion("ApplyChannel like", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelNotLike(String value) {
            addCriterion("ApplyChannel not like", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelIn(List<String> values) {
            addCriterion("ApplyChannel in", values, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelNotIn(List<String> values) {
            addCriterion("ApplyChannel not in", values, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelBetween(String value1, String value2) {
            addCriterion("ApplyChannel between", value1, value2, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelNotBetween(String value1, String value2) {
            addCriterion("ApplyChannel not between", value1, value2, "applychannel");
            return (Criteria) this;
        }

        public Criteria andBusitypeIsNull() {
            addCriterion("BusiType is null");
            return (Criteria) this;
        }

        public Criteria andBusitypeIsNotNull() {
            addCriterion("BusiType is not null");
            return (Criteria) this;
        }

        public Criteria andBusitypeEqualTo(String value) {
            addCriterion("BusiType =", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotEqualTo(String value) {
            addCriterion("BusiType <>", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeGreaterThan(String value) {
            addCriterion("BusiType >", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeGreaterThanOrEqualTo(String value) {
            addCriterion("BusiType >=", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLessThan(String value) {
            addCriterion("BusiType <", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLessThanOrEqualTo(String value) {
            addCriterion("BusiType <=", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLike(String value) {
            addCriterion("BusiType like", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotLike(String value) {
            addCriterion("BusiType not like", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeIn(List<String> values) {
            addCriterion("BusiType in", values, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotIn(List<String> values) {
            addCriterion("BusiType not in", values, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeBetween(String value1, String value2) {
            addCriterion("BusiType between", value1, value2, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotBetween(String value1, String value2) {
            addCriterion("BusiType not between", value1, value2, "busitype");
            return (Criteria) this;
        }

        public Criteria andTolisflagIsNull() {
            addCriterion("ToLisFlag is null");
            return (Criteria) this;
        }

        public Criteria andTolisflagIsNotNull() {
            addCriterion("ToLisFlag is not null");
            return (Criteria) this;
        }

        public Criteria andTolisflagEqualTo(String value) {
            addCriterion("ToLisFlag =", value, "tolisflag");
            return (Criteria) this;
        }

        public Criteria andTolisflagNotEqualTo(String value) {
            addCriterion("ToLisFlag <>", value, "tolisflag");
            return (Criteria) this;
        }

        public Criteria andTolisflagGreaterThan(String value) {
            addCriterion("ToLisFlag >", value, "tolisflag");
            return (Criteria) this;
        }

        public Criteria andTolisflagGreaterThanOrEqualTo(String value) {
            addCriterion("ToLisFlag >=", value, "tolisflag");
            return (Criteria) this;
        }

        public Criteria andTolisflagLessThan(String value) {
            addCriterion("ToLisFlag <", value, "tolisflag");
            return (Criteria) this;
        }

        public Criteria andTolisflagLessThanOrEqualTo(String value) {
            addCriterion("ToLisFlag <=", value, "tolisflag");
            return (Criteria) this;
        }

        public Criteria andTolisflagLike(String value) {
            addCriterion("ToLisFlag like", value, "tolisflag");
            return (Criteria) this;
        }

        public Criteria andTolisflagNotLike(String value) {
            addCriterion("ToLisFlag not like", value, "tolisflag");
            return (Criteria) this;
        }

        public Criteria andTolisflagIn(List<String> values) {
            addCriterion("ToLisFlag in", values, "tolisflag");
            return (Criteria) this;
        }

        public Criteria andTolisflagNotIn(List<String> values) {
            addCriterion("ToLisFlag not in", values, "tolisflag");
            return (Criteria) this;
        }

        public Criteria andTolisflagBetween(String value1, String value2) {
            addCriterion("ToLisFlag between", value1, value2, "tolisflag");
            return (Criteria) this;
        }

        public Criteria andTolisflagNotBetween(String value1, String value2) {
            addCriterion("ToLisFlag not between", value1, value2, "tolisflag");
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
     * This class corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated do_not_delete_during_merge Thu Nov 29 10:40:05 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lyamconfirm_detail
     *
     * @mbg.generated Thu Nov 29 10:40:05 CST 2018
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