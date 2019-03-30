package com.guobao.dto.ifpinsure;

import java.util.ArrayList;
import java.util.List;

public class LdBankCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LdBankCodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andBankcodeIsNull() {
            addCriterion("bankcode is null");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNotNull() {
            addCriterion("bankcode is not null");
            return (Criteria) this;
        }

        public Criteria andBankcodeEqualTo(String value) {
            addCriterion("bankcode =", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotEqualTo(String value) {
            addCriterion("bankcode <>", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThan(String value) {
            addCriterion("bankcode >", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bankcode >=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThan(String value) {
            addCriterion("bankcode <", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThanOrEqualTo(String value) {
            addCriterion("bankcode <=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLike(String value) {
            addCriterion("bankcode like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotLike(String value) {
            addCriterion("bankcode not like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeIn(List<String> values) {
            addCriterion("bankcode in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotIn(List<String> values) {
            addCriterion("bankcode not in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeBetween(String value1, String value2) {
            addCriterion("bankcode between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotBetween(String value1, String value2) {
            addCriterion("bankcode not between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcomIsNull() {
            addCriterion("bankcom is null");
            return (Criteria) this;
        }

        public Criteria andBankcomIsNotNull() {
            addCriterion("bankcom is not null");
            return (Criteria) this;
        }

        public Criteria andBankcomEqualTo(String value) {
            addCriterion("bankcom =", value, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankcomNotEqualTo(String value) {
            addCriterion("bankcom <>", value, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankcomGreaterThan(String value) {
            addCriterion("bankcom >", value, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankcomGreaterThanOrEqualTo(String value) {
            addCriterion("bankcom >=", value, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankcomLessThan(String value) {
            addCriterion("bankcom <", value, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankcomLessThanOrEqualTo(String value) {
            addCriterion("bankcom <=", value, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankcomLike(String value) {
            addCriterion("bankcom like", value, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankcomNotLike(String value) {
            addCriterion("bankcom not like", value, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankcomIn(List<String> values) {
            addCriterion("bankcom in", values, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankcomNotIn(List<String> values) {
            addCriterion("bankcom not in", values, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankcomBetween(String value1, String value2) {
            addCriterion("bankcom between", value1, value2, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankcomNotBetween(String value1, String value2) {
            addCriterion("bankcom not between", value1, value2, "bankcom");
            return (Criteria) this;
        }

        public Criteria andBankdescIsNull() {
            addCriterion("bankdesc is null");
            return (Criteria) this;
        }

        public Criteria andBankdescIsNotNull() {
            addCriterion("bankdesc is not null");
            return (Criteria) this;
        }

        public Criteria andBankdescEqualTo(String value) {
            addCriterion("bankdesc =", value, "bankdesc");
            return (Criteria) this;
        }

        public Criteria andBankdescNotEqualTo(String value) {
            addCriterion("bankdesc <>", value, "bankdesc");
            return (Criteria) this;
        }

        public Criteria andBankdescGreaterThan(String value) {
            addCriterion("bankdesc >", value, "bankdesc");
            return (Criteria) this;
        }

        public Criteria andBankdescGreaterThanOrEqualTo(String value) {
            addCriterion("bankdesc >=", value, "bankdesc");
            return (Criteria) this;
        }

        public Criteria andBankdescLessThan(String value) {
            addCriterion("bankdesc <", value, "bankdesc");
            return (Criteria) this;
        }

        public Criteria andBankdescLessThanOrEqualTo(String value) {
            addCriterion("bankdesc <=", value, "bankdesc");
            return (Criteria) this;
        }

        public Criteria andBankdescLike(String value) {
            addCriterion("bankdesc like", value, "bankdesc");
            return (Criteria) this;
        }

        public Criteria andBankdescNotLike(String value) {
            addCriterion("bankdesc not like", value, "bankdesc");
            return (Criteria) this;
        }

        public Criteria andBankdescIn(List<String> values) {
            addCriterion("bankdesc in", values, "bankdesc");
            return (Criteria) this;
        }

        public Criteria andBankdescNotIn(List<String> values) {
            addCriterion("bankdesc not in", values, "bankdesc");
            return (Criteria) this;
        }

        public Criteria andBankdescBetween(String value1, String value2) {
            addCriterion("bankdesc between", value1, value2, "bankdesc");
            return (Criteria) this;
        }

        public Criteria andBankdescNotBetween(String value1, String value2) {
            addCriterion("bankdesc not between", value1, value2, "bankdesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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