package com.guobao.dto.lis;

import java.util.ArrayList;
import java.util.List;

public class LdCode_LisExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */public LdCode_LisExample(){oredCriteria=new ArrayList<Criteria>();}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */public List<Criteria> getOredCriteria(){return oredCriteria;}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */protected abstract static class GeneratedCriteria {protected List<Criterion> criteria;protected GeneratedCriteria(){super();criteria=new ArrayList<Criterion>();}public boolean isValid(){return criteria.size() > 0;}public List<Criterion> getAllCriteria(){return criteria;}public List<Criterion> getCriteria(){return criteria;}protected void addCriterion(String condition){if (condition == null){throw new RuntimeException("Value for condition cannot be null");}criteria.add(new Criterion(condition));}protected void addCriterion(String condition,Object value,String property){if (value == null){throw new RuntimeException("Value for " + property + " cannot be null");}criteria.add(new Criterion(condition,value));}protected void addCriterion(String condition,Object value1,Object value2,String property){if (value1 == null || value2 == null){throw new RuntimeException("Between values for " + property + " cannot be null");}criteria.add(new Criterion(condition,value1,value2));}public Criteria andCodeIsNull(){addCriterion("CODE is null");return (Criteria)this;}public Criteria andCodeIsNotNull(){addCriterion("CODE is not null");return (Criteria)this;}public Criteria andCodeEqualTo(String value){addCriterion("CODE =",value,"code");return (Criteria)this;}public Criteria andCodeNotEqualTo(String value){addCriterion("CODE <>",value,"code");return (Criteria)this;}public Criteria andCodeGreaterThan(String value){addCriterion("CODE >",value,"code");return (Criteria)this;}public Criteria andCodeGreaterThanOrEqualTo(String value){addCriterion("CODE >=",value,"code");return (Criteria)this;}public Criteria andCodeLessThan(String value){addCriterion("CODE <",value,"code");return (Criteria)this;}public Criteria andCodeLessThanOrEqualTo(String value){addCriterion("CODE <=",value,"code");return (Criteria)this;}public Criteria andCodeLike(String value){addCriterion("CODE like",value,"code");return (Criteria)this;}public Criteria andCodeNotLike(String value){addCriterion("CODE not like",value,"code");return (Criteria)this;}public Criteria andCodeIn(List<String> values){addCriterion("CODE in",values,"code");return (Criteria)this;}public Criteria andCodeNotIn(List<String> values){addCriterion("CODE not in",values,"code");return (Criteria)this;}public Criteria andCodeBetween(String value1,String value2){addCriterion("CODE between",value1,value2,"code");return (Criteria)this;}public Criteria andCodeNotBetween(String value1,String value2){addCriterion("CODE not between",value1,value2,"code");return (Criteria)this;}public Criteria andCodetypeIsNull(){addCriterion("CODETYPE is null");return (Criteria)this;}public Criteria andCodetypeIsNotNull(){addCriterion("CODETYPE is not null");return (Criteria)this;}public Criteria andCodetypeEqualTo(String value){addCriterion("CODETYPE =",value,"codetype");return (Criteria)this;}public Criteria andCodetypeNotEqualTo(String value){addCriterion("CODETYPE <>",value,"codetype");return (Criteria)this;}public Criteria andCodetypeGreaterThan(String value){addCriterion("CODETYPE >",value,"codetype");return (Criteria)this;}public Criteria andCodetypeGreaterThanOrEqualTo(String value){addCriterion("CODETYPE >=",value,"codetype");return (Criteria)this;}public Criteria andCodetypeLessThan(String value){addCriterion("CODETYPE <",value,"codetype");return (Criteria)this;}public Criteria andCodetypeLessThanOrEqualTo(String value){addCriterion("CODETYPE <=",value,"codetype");return (Criteria)this;}public Criteria andCodetypeLike(String value){addCriterion("CODETYPE like",value,"codetype");return (Criteria)this;}public Criteria andCodetypeNotLike(String value){addCriterion("CODETYPE not like",value,"codetype");return (Criteria)this;}public Criteria andCodetypeIn(List<String> values){addCriterion("CODETYPE in",values,"codetype");return (Criteria)this;}public Criteria andCodetypeNotIn(List<String> values){addCriterion("CODETYPE not in",values,"codetype");return (Criteria)this;}public Criteria andCodetypeBetween(String value1,String value2){addCriterion("CODETYPE between",value1,value2,"codetype");return (Criteria)this;}public Criteria andCodetypeNotBetween(String value1,String value2){addCriterion("CODETYPE not between",value1,value2,"codetype");return (Criteria)this;}public Criteria andCodenameIsNull(){addCriterion("CODENAME is null");return (Criteria)this;}public Criteria andCodenameIsNotNull(){addCriterion("CODENAME is not null");return (Criteria)this;}public Criteria andCodenameEqualTo(String value){addCriterion("CODENAME =",value,"codename");return (Criteria)this;}public Criteria andCodenameNotEqualTo(String value){addCriterion("CODENAME <>",value,"codename");return (Criteria)this;}public Criteria andCodenameGreaterThan(String value){addCriterion("CODENAME >",value,"codename");return (Criteria)this;}public Criteria andCodenameGreaterThanOrEqualTo(String value){addCriterion("CODENAME >=",value,"codename");return (Criteria)this;}public Criteria andCodenameLessThan(String value){addCriterion("CODENAME <",value,"codename");return (Criteria)this;}public Criteria andCodenameLessThanOrEqualTo(String value){addCriterion("CODENAME <=",value,"codename");return (Criteria)this;}public Criteria andCodenameLike(String value){addCriterion("CODENAME like",value,"codename");return (Criteria)this;}public Criteria andCodenameNotLike(String value){addCriterion("CODENAME not like",value,"codename");return (Criteria)this;}public Criteria andCodenameIn(List<String> values){addCriterion("CODENAME in",values,"codename");return (Criteria)this;}public Criteria andCodenameNotIn(List<String> values){addCriterion("CODENAME not in",values,"codename");return (Criteria)this;}public Criteria andCodenameBetween(String value1,String value2){addCriterion("CODENAME between",value1,value2,"codename");return (Criteria)this;}public Criteria andCodenameNotBetween(String value1,String value2){addCriterion("CODENAME not between",value1,value2,"codename");return (Criteria)this;}public Criteria andCodealiasIsNull(){addCriterion("CODEALIAS is null");return (Criteria)this;}public Criteria andCodealiasIsNotNull(){addCriterion("CODEALIAS is not null");return (Criteria)this;}public Criteria andCodealiasEqualTo(String value){addCriterion("CODEALIAS =",value,"codealias");return (Criteria)this;}public Criteria andCodealiasNotEqualTo(String value){addCriterion("CODEALIAS <>",value,"codealias");return (Criteria)this;}public Criteria andCodealiasGreaterThan(String value){addCriterion("CODEALIAS >",value,"codealias");return (Criteria)this;}public Criteria andCodealiasGreaterThanOrEqualTo(String value){addCriterion("CODEALIAS >=",value,"codealias");return (Criteria)this;}public Criteria andCodealiasLessThan(String value){addCriterion("CODEALIAS <",value,"codealias");return (Criteria)this;}public Criteria andCodealiasLessThanOrEqualTo(String value){addCriterion("CODEALIAS <=",value,"codealias");return (Criteria)this;}public Criteria andCodealiasLike(String value){addCriterion("CODEALIAS like",value,"codealias");return (Criteria)this;}public Criteria andCodealiasNotLike(String value){addCriterion("CODEALIAS not like",value,"codealias");return (Criteria)this;}public Criteria andCodealiasIn(List<String> values){addCriterion("CODEALIAS in",values,"codealias");return (Criteria)this;}public Criteria andCodealiasNotIn(List<String> values){addCriterion("CODEALIAS not in",values,"codealias");return (Criteria)this;}public Criteria andCodealiasBetween(String value1,String value2){addCriterion("CODEALIAS between",value1,value2,"codealias");return (Criteria)this;}public Criteria andCodealiasNotBetween(String value1,String value2){addCriterion("CODEALIAS not between",value1,value2,"codealias");return (Criteria)this;}public Criteria andComcodeIsNull(){addCriterion("COMCODE is null");return (Criteria)this;}public Criteria andComcodeIsNotNull(){addCriterion("COMCODE is not null");return (Criteria)this;}public Criteria andComcodeEqualTo(String value){addCriterion("COMCODE =",value,"comcode");return (Criteria)this;}public Criteria andComcodeNotEqualTo(String value){addCriterion("COMCODE <>",value,"comcode");return (Criteria)this;}public Criteria andComcodeGreaterThan(String value){addCriterion("COMCODE >",value,"comcode");return (Criteria)this;}public Criteria andComcodeGreaterThanOrEqualTo(String value){addCriterion("COMCODE >=",value,"comcode");return (Criteria)this;}public Criteria andComcodeLessThan(String value){addCriterion("COMCODE <",value,"comcode");return (Criteria)this;}public Criteria andComcodeLessThanOrEqualTo(String value){addCriterion("COMCODE <=",value,"comcode");return (Criteria)this;}public Criteria andComcodeLike(String value){addCriterion("COMCODE like",value,"comcode");return (Criteria)this;}public Criteria andComcodeNotLike(String value){addCriterion("COMCODE not like",value,"comcode");return (Criteria)this;}public Criteria andComcodeIn(List<String> values){addCriterion("COMCODE in",values,"comcode");return (Criteria)this;}public Criteria andComcodeNotIn(List<String> values){addCriterion("COMCODE not in",values,"comcode");return (Criteria)this;}public Criteria andComcodeBetween(String value1,String value2){addCriterion("COMCODE between",value1,value2,"comcode");return (Criteria)this;}public Criteria andComcodeNotBetween(String value1,String value2){addCriterion("COMCODE not between",value1,value2,"comcode");return (Criteria)this;}public Criteria andOthersignIsNull(){addCriterion("OTHERSIGN is null");return (Criteria)this;}public Criteria andOthersignIsNotNull(){addCriterion("OTHERSIGN is not null");return (Criteria)this;}public Criteria andOthersignEqualTo(String value){addCriterion("OTHERSIGN =",value,"othersign");return (Criteria)this;}public Criteria andOthersignNotEqualTo(String value){addCriterion("OTHERSIGN <>",value,"othersign");return (Criteria)this;}public Criteria andOthersignGreaterThan(String value){addCriterion("OTHERSIGN >",value,"othersign");return (Criteria)this;}public Criteria andOthersignGreaterThanOrEqualTo(String value){addCriterion("OTHERSIGN >=",value,"othersign");return (Criteria)this;}public Criteria andOthersignLessThan(String value){addCriterion("OTHERSIGN <",value,"othersign");return (Criteria)this;}public Criteria andOthersignLessThanOrEqualTo(String value){addCriterion("OTHERSIGN <=",value,"othersign");return (Criteria)this;}public Criteria andOthersignLike(String value){addCriterion("OTHERSIGN like",value,"othersign");return (Criteria)this;}public Criteria andOthersignNotLike(String value){addCriterion("OTHERSIGN not like",value,"othersign");return (Criteria)this;}public Criteria andOthersignIn(List<String> values){addCriterion("OTHERSIGN in",values,"othersign");return (Criteria)this;}public Criteria andOthersignNotIn(List<String> values){addCriterion("OTHERSIGN not in",values,"othersign");return (Criteria)this;}public Criteria andOthersignBetween(String value1,String value2){addCriterion("OTHERSIGN between",value1,value2,"othersign");return (Criteria)this;}public Criteria andOthersignNotBetween(String value1,String value2){addCriterion("OTHERSIGN not between",value1,value2,"othersign");return (Criteria)this;}public Criteria andStateIsNull(){addCriterion("STATE is null");return (Criteria)this;}public Criteria andStateIsNotNull(){addCriterion("STATE is not null");return (Criteria)this;}public Criteria andStateEqualTo(String value){addCriterion("STATE =",value,"state");return (Criteria)this;}public Criteria andStateNotEqualTo(String value){addCriterion("STATE <>",value,"state");return (Criteria)this;}public Criteria andStateGreaterThan(String value){addCriterion("STATE >",value,"state");return (Criteria)this;}public Criteria andStateGreaterThanOrEqualTo(String value){addCriterion("STATE >=",value,"state");return (Criteria)this;}public Criteria andStateLessThan(String value){addCriterion("STATE <",value,"state");return (Criteria)this;}public Criteria andStateLessThanOrEqualTo(String value){addCriterion("STATE <=",value,"state");return (Criteria)this;}public Criteria andStateLike(String value){addCriterion("STATE like",value,"state");return (Criteria)this;}public Criteria andStateNotLike(String value){addCriterion("STATE not like",value,"state");return (Criteria)this;}public Criteria andStateIn(List<String> values){addCriterion("STATE in",values,"state");return (Criteria)this;}public Criteria andStateNotIn(List<String> values){addCriterion("STATE not in",values,"state");return (Criteria)this;}public Criteria andStateBetween(String value1,String value2){addCriterion("STATE between",value1,value2,"state");return (Criteria)this;}public Criteria andStateNotBetween(String value1,String value2){addCriterion("STATE not between",value1,value2,"state");return (Criteria)this;}public Criteria andOrdernoIsNull(){addCriterion("ORDERNO is null");return (Criteria)this;}public Criteria andOrdernoIsNotNull(){addCriterion("ORDERNO is not null");return (Criteria)this;}public Criteria andOrdernoEqualTo(Integer value){addCriterion("ORDERNO =",value,"orderno");return (Criteria)this;}public Criteria andOrdernoNotEqualTo(Integer value){addCriterion("ORDERNO <>",value,"orderno");return (Criteria)this;}public Criteria andOrdernoGreaterThan(Integer value){addCriterion("ORDERNO >",value,"orderno");return (Criteria)this;}public Criteria andOrdernoGreaterThanOrEqualTo(Integer value){addCriterion("ORDERNO >=",value,"orderno");return (Criteria)this;}public Criteria andOrdernoLessThan(Integer value){addCriterion("ORDERNO <",value,"orderno");return (Criteria)this;}public Criteria andOrdernoLessThanOrEqualTo(Integer value){addCriterion("ORDERNO <=",value,"orderno");return (Criteria)this;}public Criteria andOrdernoIn(List<Integer> values){addCriterion("ORDERNO in",values,"orderno");return (Criteria)this;}public Criteria andOrdernoNotIn(List<Integer> values){addCriterion("ORDERNO not in",values,"orderno");return (Criteria)this;}public Criteria andOrdernoBetween(Integer value1,Integer value2){addCriterion("ORDERNO between",value1,value2,"orderno");return (Criteria)this;}public Criteria andOrdernoNotBetween(Integer value1,Integer value2){addCriterion("ORDERNO not between",value1,value2,"orderno");return (Criteria)this;}}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ldcode
	 * @mbggenerated  Sun Apr 01 19:14:55 CST 2018
	 */public static class Criterion {private String condition;private Object value;private Object secondValue;private boolean noValue;private boolean singleValue;private boolean betweenValue;private boolean listValue;private String typeHandler;public String getCondition(){return condition;}public Object getValue(){return value;}public Object getSecondValue(){return secondValue;}public boolean isNoValue(){return noValue;}public boolean isSingleValue(){return singleValue;}public boolean isBetweenValue(){return betweenValue;}public boolean isListValue(){return listValue;}public String getTypeHandler(){return typeHandler;}protected Criterion(String condition){super();this.condition=condition;this.typeHandler=null;this.noValue=true;}protected Criterion(String condition,Object value,String typeHandler){super();this.condition=condition;this.value=value;this.typeHandler=typeHandler;if (value instanceof List<?>){this.listValue=true;} else {this.singleValue=true;}}protected Criterion(String condition,Object value){this(condition,value,null);}protected Criterion(String condition,Object value,Object secondValue,String typeHandler){super();this.condition=condition;this.value=value;this.secondValue=secondValue;this.typeHandler=typeHandler;this.betweenValue=true;}protected Criterion(String condition,Object value,Object secondValue){this(condition,value,secondValue,null);}}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ldcode
     *
     * @mbggenerated do_not_delete_during_merge Tue Mar 06 15:04:58 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}